
/* 
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.AppConfigurationEntry;

public class Connector {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Bank");

        Statement sqlST;
        String useSQL = new String("emp");
        String output;
        ResultSet result;
        String SQL = "select * from emp";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/emp";
            Connection dbConnect = DriverManager.getConnection(dbURL,"root","");
            sqlSt = dbConnect.createStatement();
            result = sqlST.executeQuery(SQL);

        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Class not found");
        }
        catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQL Connection not established" + ex.getMessage());
        }

    }
}*/
