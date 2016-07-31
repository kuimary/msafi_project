package msafi_project.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Read {

    private Statement statement;
    private ResultSet result;

    public void Read_employees(Connection conn) {
        try {
            String sql = "SELECT * FROM employees";
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                String identification_number = result.getString("identification_number");
                String nok_identification_number = result.getString("nok_identification_number");
                String date_of_birth = result.getString("date_of_birth");
                String user_name = result.getString("user_name");
                String full_name = result.getString("full_name");
                String email = result.getString("email");
                String residence = result.getString("residence");
                String mobile_number = result.getString("mobile_number");
                String nok_name = result.getString("nok_name");
                String nok_residence = result.getString("nok_residence");
                String nok_mobile = result.getString("nok_mobile");

                String output = "Employees #%d: %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s ";
                System.out.println(String.format(output, ++count, identification_number, nok_identification_number, date_of_birth, user_name, full_name, email, residence, mobile_number, nok_name, nok_residence, nok_mobile));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Read_orders(Connection conn) {
        try {
            String sql = "SELECT * FROM orders" ;
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                String order_id = result.getString("order_id");
                String date_time = result.getString("date_time");
                String client_name = result.getString("client_name");
                String employee_name = result.getString("employee_name");
                String order_name = result.getString("order_name");
                String price = result.getString("price");
                String residence = result.getString("residence");
                String confirmed = result.getString("confirmed");
                
                String output = "Orders #%d: %s - %s - %s - %s - %s - %s - %s - %s ";
                System.out.println(String.format(output, ++count, order_id, date_time, client_name, employee_name, order_name, price, residence, confirmed));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Read_service(Connection conn) {
        try {
            String sql = "SELECT * FROM service";
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                String name = result.getString("name");
                String description = result.getString("description");
                String service_price = result.getString("service_price");
                

                String output = "Services #%d: %s - %s - %s  ";
                System.out.println(String.format(output, ++count, name, description, service_price));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Read_users(Connection conn) {
        try {
            String sql = "SELECT * FROM users";
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                String identification_number = result.getString("identification_number");
                String date_of_birth = result.getString("date_of_birth");
                String user_name = result.getString("user_name");
                String full_name = result.getString("full_name");
                String email = result.getString("email");
                String residence = result.getString("residence");
                String mobile_number = result.getString("mobile_number");
                

                String output = "Users #%d: %s - %s - %s - %s - %s - %s - %s  ";
                System.out.println(String.format(output, ++count, identification_number,  date_of_birth, user_name, full_name, email, residence, mobile_number));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
