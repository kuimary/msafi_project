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
          
            ps = connect.prepareStatement(sql_state);
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
            String sql_state = "insert into `employees`(identification_number,nok_identification_number, date_of_birth, user_name, password, full_name,email,residence,mobile_number,nok_name, nok_mobile, nok_residence) values (?,?,?,?,?,?,?,?,?,?,?,?);";
          
            ps = connect.prepareStatement(sql_state);
            ps.setInt(1,employees.getIdentification_number());
            ps.setInt(2,employees.getNok_identification_number());
            ps.setString(3, employees.getDate_of_birth());
            ps.setString(4,employees.getUser_name());
            ps.setString(5, employees.getPassword());
            ps.setString(6, employees.getFull_name());
            ps.setString(7, employees.getEmail());
            ps.setString(8, employees.getResidence());
            ps.setString(9, employees.getMobile_numbe());
            ps.setString(10, employees.getNok_name());
            ps.setString(11, employees.getNok_mobile()); 
            ps.setString(12, employees.getNok_residence());
            
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
            String sql_state = "insert into `service`(name, description,service_price) values (?,?,?);";
          
            ps = connect.prepareStatement(sql_state);
            ps.setString(1,service.getName());
            ps.setString(2,service.getDescription());
            ps.setInt(3,service.getPrice());
           
            
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
            String sql_state = "insert into `orders`(order_id,date_time,client_name,employee_name,order_name,price,residence,confirmed) values (?,?,?,?,?,?,?,?);";
          
            ps = connect.prepareStatement(sql_state);
            ps.setInt(1,orders.getOrder_id());
            ps.setString(2,orders.getDate_time());
            ps.setString(3,orders.getClient_name());
            ps.setString(4,orders.getEmployee_name());
            ps.setString(5,orders.getOrder_name());
            ps.setString(6,orders.getPrice());
            ps.setString(7,orders.getResidence());
            ps.setString(8,orders.isConfirmed());
            
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
