

import javax.swing.*;

public class APPLAUNCH {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            
            public void run()
            {
                new LOGINGUI().setVisible(true);
                //new RegisterGui().setVisible(false);
                /*new BankingAppGui(
                    new User(4, "username", "password", new BigDecimal("20.00"))
                ).setVisible(true);*/
            }
        });
    }
}
