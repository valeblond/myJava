package valafunny;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class valaFunnySelect {

    public static void main(String args[])
    {
        int id = 8;
        int rate = 92;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vala", "blondee");
            Statement stmt = con.createStatement();
             
            // SELECT query
            String q1 = "select * from museum WHERE id = " + id + " AND rating = " + rate;
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}