package DataAccessLayer;

import java.sql.*;
public class DatabaseConnection {
    
   
    String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Connection con() throws SQLException, InstantiationException, IllegalAccessException,
            ClassNotFoundException { 
            Class.forName(jdbcDriver);
            String connection = "jdbc:sqlserver://LAPTOP-8H1HK9CJ\\1433;Databasename=Delicious_Catering;IntegratedSecurity=true;";
            String user = "CovenantNSM";
            String password = "pass";
            Connection con = DriverManager.getConnection(connection,user,password);
            return con;
    }
}
 