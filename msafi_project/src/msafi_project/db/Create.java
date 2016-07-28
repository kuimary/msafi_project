package msafi_project.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import msafi_project.model.Users;
import java.util.Date;
import msafi_project.model.Employees;
import msafi_project.model.Orders;
import msafi_project.model.Service;

public class Create {

    private PreparedStatement ps;
 
  
//    private Employees employees;
//    private Orders orders;
//    private Service service;
   
    /**
     *
     * @param connect connection method
     * @param users user class
     * inserts data to users table
     * 
     */
    public Create(Connection connect, Users users) {
        try {
//            users = new Users(1765886, "today", "jacone", "12345", "jacone keya", "kjacone@gmail.com", "kasarani", "09874332");
           
//            String sql_state = "insert into users values(?,?,?,?,?,?,?,?,?)";
            String sql_state = "insert into `users`(identification_number, date_of_birth, user_name, password, full_name,email,residence,mobile_number) values (?,?,?,?,?,?,?,?);";
          
            ps = con.prepareStatement(sql_state);
            ps.setInt(1,users.getIdentification_number());
            ps.setString(2, users.getDate_of_birth());
            ps.setString(3, users.getUser_name());
            ps.setString(4, users.getPassword());
            ps.setString(5, users.getFull_name());
            ps.setString(6, users.getEmail());
            ps.setString(7, users.getResidence());
            ps.setString(8, users.getMobile_number());
            
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("not Inserted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * @param connect connection method
     * @param employees employees pojo class
     * insert data to employees table
     */
    public Create(Connection connect, Employees employees) {
        try {
//            users = new Users(1765886, "today", "jacone", "12345", "jacone keya", "kjacone@gmail.com", "kasarani", "09874332");
           
//            String sql_state = "insert into users values(?,?,?,?,?,?,?,?,?)";
            String sql_state = "insert into `users`(identification_number, date_of_birth, user_name, password, full_name,email,residence,mobile_number) values (?,?,?,?,?,?,?,?);";
          
            ps = con.prepareStatement(sql_state);
            ps.setInt(1,users.getIdentification_number());
            ps.setString(2, users.getDate_of_birth());
            ps.setString(3, users.getUser_name());
            ps.setString(4, users.getPassword());
            ps.setString(5, users.getFull_name());
            ps.setString(6, users.getEmail());
            ps.setString(7, users.getResidence());
            ps.setString(8, users.getMobile_number());
            
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("not Inserted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public Create(Connection connect, Service service) {
        try {
//            users = new Users(1765886, "today", "jacone", "12345", "jacone keya", "kjacone@gmail.com", "kasarani", "09874332");
           
//            String sql_state = "insert into users values(?,?,?,?,?,?,?,?,?)";
            String sql_state = "insert into `users`(identification_number, date_of_birth, user_name, password, full_name,email,residence,mobile_number) values (?,?,?,?,?,?,?,?);";
          
            ps = con.prepareStatement(sql_state);
            ps.setInt(1,users.getIdentification_number());
            ps.setString(2, users.getDate_of_birth());
            ps.setString(3, users.getUser_name());
            ps.setString(4, users.getPassword());
            ps.setString(5, users.getFull_name());
            ps.setString(6, users.getEmail());
            ps.setString(7, users.getResidence());
            ps.setString(8, users.getMobile_number());
            
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("not Inserted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public Create(Connection connect, Orders orders) {
        try {
//            users = new Users(1765886, "today", "jacone", "12345", "jacone keya", "kjacone@gmail.com", "kasarani", "09874332");
           
//            String sql_state = "insert into users values(?,?,?,?,?,?,?,?,?)";
            String sql_state = "insert into `users`(identification_number, date_of_birth, user_name, password, full_name,email,residence,mobile_number) values (?,?,?,?,?,?,?,?);";
          
            ps = con.prepareStatement(sql_state);
            ps.setInt(1,users.getIdentification_number());
            ps.setString(2, users.getDate_of_birth());
            ps.setString(3, users.getUser_name());
            ps.setString(4, users.getPassword());
            ps.setString(5, users.getFull_name());
            ps.setString(6, users.getEmail());
            ps.setString(7, users.getResidence());
            ps.setString(8, users.getMobile_number());
            
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("not Inserted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
