import java.sql.*;

public class conn {
    

    public Statement statement;

   conn(){
       
      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database","root","your_password");
             statement=c.createStatement();
     } catch (Exception e) {
        e.printStackTrace();
     }
    }
   

      
    }
     
    
    
