

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LOGINGUI extends BASEFRAME{
    public LOGINGUI(){
        super("Banking App");
    }

    @Override
    protected void addGuiComponents(){

        JLabel bankingAppLabel = new JLabel("Banking App");
        bankingAppLabel.setBounds(0,20, super.getWidth(), 40);
        bankingAppLabel.setFont(new Font("Dialog", Font.BOLD, 32));
        bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(bankingAppLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20,120, getWidth()-30,24);
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(usernameLabel);
        
        JTextField usernameField = new JTextField();
        usernameField.setBounds(20,160, getWidth()-50,24);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20,200, getWidth()-30,24);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20,240, getWidth()-50,24);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(20,400, getWidth() - 50,40);
        loginButton.setFont(new Font("Dialog", Font.PLAIN, 20));
        loginButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());

                User user = MyJDBC.validateLogin(username, password);

                if(user != null){
                LOGINGUI.this.dispose();
                BANKAPPGUI bankingAppGui = new BANKAPPGUI(user);
                bankingAppGui.setVisible(true);

                JOptionPane.showMessageDialog(bankingAppGui, "Login Succesful");
                }
                else{
                    JOptionPane.showMessageDialog(LOGINGUI.this, "Login Failed");
                    
            }}  })  ;
        add(loginButton);

        JLabel registerLabel = new JLabel("<html><a href=\"#\">Don't have an account? Register Here</a><html>");
        registerLabel.setBounds(0,480,getWidth() - 10, 30);
        registerLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerLabel);

        registerLabel.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e)
            {
                LOGINGUI.this.dispose();

                new REGISTERGUI().setVisible(true);
            }
        });

    }
}