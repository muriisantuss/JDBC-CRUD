package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

  private static final String URL = "jdbc:mysql://localhost:3306/crud";
  private static final String USER = "root";
  private static final String PASSWORD = "root";

  private static Connection conn;

  public static Connection getConnection(){
    try{
      if(conn == null){
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn;
      } else{
        return conn;
      }
    }
      catch(SQLException e){
        e.printStackTrace();
        return null;
      }
    }
}
