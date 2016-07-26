package msafi_project.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import msafi_project.model.Users;
import java.util.Date;

public class Create {

    private PreparedStatement ps;
    private Connection con;
    private Connect connect;
//    private Employees employees;
//    private Orders orders;
//    private Service service;
    private Users users;

    public Create() {
        try {
            users = new Users(765886, new Date(), "jacone", "12345", "jacone keya", "kjacone@gmail.com", "kasarani", "09874332");
            String sql_state = "insert into users values(?,?,?,?,?,?,?)";
            con = connect.db_connect();

            ps = con.prepareStatement(sql_state);
//    ps.setInt(1, users.getId());
            ps.setString(2, users.getDate_of_birth().toString());
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
