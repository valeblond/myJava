package valafunny;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class valaFunnyUpdate {

    public static void main(String args[])
    {
        int id = 7;
        int rate = 94; 
        String newName = "Art";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vala", "blondee");
            Statement stmt = con.createStatement();
         
            // Updating database
            String q1 = "UPDATE museum set name = '" + newName +"' WHERE mus_id = " +id+ " AND rating = " + rate;
            int x = stmt.executeUpdate(q1);
             
            if (x > 0)            
                System.out.println("Password Successfully Updated");            
            else           
                System.out.println("ERROR OCCURED :(");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
