package valafunny;

import java.sql.*;

public class valaFunnyInsert {

	    public static void main(String args[])
	    {
	        try
	        {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	             
	            // Establishing Connection
	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vala", "blondee");
	 
	            if (con != null)             
	                System.out.println("Connected");            
	            else           
	                System.out.println("Not Connected");
	             
	            con.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		 try {  
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con = DriverManager.getConnection("jdbc:oracle:valaconnect:@localhost:1521:xe", "vala", "blondee");
	            Statement stmt = con.createStatement();
	             
	            stmt.executeUpdate("INSERT INTO bikeRaces " + 
	                "VALUES (1, 'Ground trail', 4, 242, 'webPage isnot created',90, 'Poznan')"); 
	            stmt.executeUpdate("INSERT INTO bikeRaces " + 
		            "VALUES (2, 'Kaszebe Velo', 3, 99, 'www.czasnarower.pl/',93, 'Gdynia')"); 
	            stmt.executeUpdate("INSERT INTO bikeRaces " + 
		            "VALUES (3, 'Round Center', 4, 31, 'www.rovercentrum.pl/',85, 'Wroclaw')");
	            con.close(); 
	        } catch (Exception e) { 
	            System.err.println("Got an exception! "); 
	            System.err.println(e.getMessage()); 
	        } 
	}*/

}