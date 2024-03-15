import java.sql.*;

public class conn {
    

    public Statement statement;

   conn(){
       
      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelReservationSystem","root","fuckmedaddy567");
             statement=c.createStatement();
     } catch (Exception e) {
        e.printStackTrace();
     }
    }
   

      
    }
     
    
    
