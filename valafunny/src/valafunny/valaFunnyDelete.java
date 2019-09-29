package valafunny;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class valaFunnyDelete {

    public static void main(String args[])
    {
        int id = 5;
        int rate = 88;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vala", "blondee");
            Statement stmt = con.createStatement();
                  
            // Deleting from database
            String q1 = "DELETE from userid WHERE id = " + id +  "' AND rating = " + rate;
                     
            int x = stmt.executeUpdate(q1);
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }


}
