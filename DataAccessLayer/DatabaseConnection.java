package DataAccessLayer;

import java.sql.*;
import java.util.Properties;
public class DatabaseConnection {
    
   
    String jdbcDriver = "com.sqlserver.jdbc.SqlServerDriver";
    
    public Connection con() throws SQLException, InstantiationException, IllegalAccessException,
            ClassNotFoundException { 
            //String connection = "jdbc:sqlserver://LAPTOP-8H1HK9CJ\\1433;Databasename=Delicious_Catering;IntegratedSecurity=true;";      
            String url = "jdbc:sqlserver://localhost:1433/Delicious_Catering"; 
            Class.forName(jdbcDriver);
            Properties info = new Properties(); 
            info.put("user", "root"); 
            info.put("password", "test");
            Connection con = null; 
            con = java.sql.DriverManager.getConnection(url,info);
            return con;
    }
}
 