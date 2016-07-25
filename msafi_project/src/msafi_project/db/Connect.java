/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msafi_project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mary
 */
public class Connect {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String DB_CONNECT="jdbc:mysql://localhost/msafi_db";
    private Connection conn=null;
    
    
    
    
   public void db_connect(){
        try {
            conn= DriverManager.getConnection(DB_CONNECT, USERNAME, PASSWORD);
            System.out.println("connection opened");
        } catch (SQLException e) {
            e.printStackTrace();
        }
   
   }
   public void close_connection(){
        try {
            conn.close();
            System.out.println("connection closed");
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
   }
      
}
