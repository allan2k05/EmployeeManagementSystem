import java.sql.*;

public class Conn {
    
    Connection connection;
    Statement statement;

    public Conn(){


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","root@123");
            statement = connection.createStatement();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
