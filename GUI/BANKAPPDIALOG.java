
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.*;


public class BANKAPPDIALOG extends JDialog implements ActionListener {
    private User user;
    private BANKAPPGUI bankingAppGui;
    private JLabel balanceLabel, enterAmountLabel, enterUserLabel;
    private JTextField enterAmountField, enterUserField;
    private JButton actionButton;
    private JPanel pastTransactionPanel;
    private ArrayList<TRANSACTION> pastTransactions;

    public BANKAPPDIALOG(BANKAPPGUI bankingAppGui, User user){
      
        setSize(400, 400);

      
        setModal(true);

       
        setLocationRelativeTo(bankingAppGui);

       
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

       
        setResizable(false);

      
        setLayout(null);

      
        this.bankingAppGui = bankingAppGui;

        
        this.user = user;
    }

    public void addCurrentBalanceAndAmount(){

        balanceLabel = new JLabel("Balance: $" + user.getCurrentBalance());
        balanceLabel.setBounds(0, 10, getWidth() - 20, 20);
        balanceLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(balanceLabel);

        enterAmountLabel = new JLabel("Enter Amount:");
        enterAmountLabel.setBounds(0, 50, getWidth() - 20, 20);
        enterAmountLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        enterAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(enterAmountLabel);


        enterAmountField = new JTextField();
        enterAmountField.setBounds(15, 80, getWidth() - 50, 40);
        enterAmountField.setFont(new Font("Dialog", Font.BOLD, 20));
        enterAmountField.setHorizontalAlignment(SwingConstants.RIGHT);
        add(enterAmountField);
    }

    public void addActionButton(String actionButtonType){
        actionButton = new JButton(actionButtonType);
        actionButton.setBounds(15, 300, getWidth() - 50, 40);
        actionButton.setFont(new Font("Dialog", Font.BOLD, 20));
        actionButton.addActionListener(this);
        add(actionButton);
    }

    public void addUserField(){
        
        enterUserLabel = new JLabel("Enter User:");
        enterUserLabel.setBounds(0, 160, getWidth() - 20, 20);
        enterUserLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        enterUserLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(enterUserLabel);

    
        enterUserField = new JTextField();
        enterUserField.setBounds(15, 190, getWidth() - 50, 40);
        enterUserField.setFont(new Font("Dialog", Font.BOLD, 20));
        add(enterUserField);
    }

    public void addPastTransactionComponents(){
       
        pastTransactionPanel = new JPanel();

        pastTransactionPanel.setLayout(new BoxLayout(pastTransactionPanel, BoxLayout.Y_AXIS));

       
        JScrollPane scrollPane = new JScrollPane(pastTransactionPanel);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 20, getWidth() - 15, getHeight() - 80);

       
        pastTransactions = MyJDBC.getPastTransaction(user);

    
        for(int i = 0; i < pastTransactions.size(); i++){
          
            TRANSACTION pastTransaction = pastTransactions.get(i);

            
            JPanel pastTransactionContainer = new JPanel();
            pastTransactionContainer.setLayout(new BorderLayout());

     
            JLabel transactionTypeLabel = new JLabel(pastTransaction.getTransactionType());
            transactionTypeLabel.setFont(new Font("Dialog", Font.BOLD, 20));

           
            JLabel transactionAmountLabel = new JLabel(String.valueOf(pastTransaction.getTransactionAmount()));
            transactionAmountLabel.setFont(new Font("Dialog", Font.BOLD, 20));

          
            JLabel transactionDateLabel = new JLabel(String.valueOf(pastTransaction.getTransactionDate()));
            transactionDateLabel.setFont(new Font("Dialog", Font.BOLD, 20));

            
            pastTransactionContainer.add(transactionTypeLabel, BorderLayout.WEST);
            pastTransactionContainer.add(transactionAmountLabel, BorderLayout.EAST);
            pastTransactionContainer.add(transactionDateLabel, BorderLayout.SOUTH); 

        
            pastTransactionContainer.setBackground(Color.WHITE);

          
            pastTransactionContainer.setBorder(BorderFactory.createLineBorder(Color.BLACK));

          
            pastTransactionPanel.add(pastTransactionContainer);
        }

        
        add(scrollPane);
    }

    private void handleTransaction(String transactionType, float amountVal){
        TRANSACTION transaction;

        //if(enterAmountField.equalsIgnoreCase=="String"){}
        if(transactionType.equalsIgnoreCase("Deposit")){
            // deposit transaction type
            // add to current balance
            user.setCurrentBalance(user.getCurrentBalance().add(new BigDecimal(amountVal)));
            

            // create transaction
            // we leave date null because we are going to be using the NOW() in sql which will get the current date
            transaction = new TRANSACTION(user.getId(), transactionType, new BigDecimal(amountVal), null);
        }else{
            // withdraw transaction type
            // subtract from current balance
            user.setCurrentBalance(user.getCurrentBalance().subtract(new BigDecimal(amountVal)));

            // we want to show a negative sign for the amount val when withdrawing
            transaction = new TRANSACTION(user.getId(), transactionType, new BigDecimal(-amountVal), null);
        }

        // update database
        if(MyJDBC.addTransactionToDatabase(transaction) && MyJDBC.updateCurrentBalance(user)){
            // show success dialog
            JOptionPane.showMessageDialog(this, transactionType + " Successfully!");

            // reset the fields
            resetFieldsAndUpdateCurrentBalance();
        }else{
            // show failure dialog
            JOptionPane.showMessageDialog(this, transactionType + " Failed...");
        }

    }

    private void resetFieldsAndUpdateCurrentBalance(){
        // reset fields
        enterAmountField.setText("");

        // only appears when transfer is clicked
        if(enterUserField != null){
            enterUserField.setText("");
        }

        // update current balance on dialog
        balanceLabel.setText("Balance: $" + user.getCurrentBalance());

        // update current balance on main gui
        bankingAppGui.getCurrentBalanceField().setText("$" + user.getCurrentBalance());
    }

    private void handleTransfer(User user, String transferredUser, float amount){
        // attempt to perform transfer
        if(MyJDBC.transfer(user, transferredUser, amount)){
            // show success dialog
            JOptionPane.showMessageDialog(this, "Transfer Success!");
            resetFieldsAndUpdateCurrentBalance();
        }else{
            // show failure dialog
            JOptionPane.showMessageDialog(this, "Transfer Failed...");
        }
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();

       try{
            String str = String.valueOf(enterAmountField);
            Integer num = Integer.valueOf(str);
        }catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Error: Input value is not valid");
        }
     
        /*if(enterAmountField.matches("^\\d+(\\.\\d+)?")) {
            //okay
          } else {
            // not okay !
          }

          if(enterAmountField.nextInt()) {
            //okay
          } else {
            // not okay !
          }*/


        // get amount val
        float amountVal = Float.parseFloat(enterAmountField.getText());
      

        
        // pressed deposit
        if(buttonPressed.equalsIgnoreCase("Deposit")){
            // we want to handle the deposit transaction
            handleTransaction(buttonPressed, amountVal);
        }else{
            // pressed withdraw or transfer

            // validate input by making sure that the withdraw or transfer amount is less than the current balance
            // if the result is -1 it means that the entered amount is greater, 0 means they are equal and 1 means that
            // the entered amount is less
            int result = user.getCurrentBalance().compareTo(BigDecimal.valueOf(amountVal));
            if(result < 0) //&& result.equals(str)){
            {
                // display an error dialog
                JOptionPane.showMessageDialog(this, "Error: Input value is more than current balance");
                return;
            }

            // check to see if the withdraw- or transferbutton was pressed
            if(buttonPressed.equalsIgnoreCase("Withdraw")){
                handleTransaction(buttonPressed, amountVal);
            }else{
                // transfer
                String transferredUser = enterUserField.getText();

                
                handleTransfer(user, transferredUser, amountVal);
            }

        }
    }
    
     

   
}