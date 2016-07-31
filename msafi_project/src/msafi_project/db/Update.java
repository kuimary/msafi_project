package msafi_project.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Update {

    private Connect connect;
    

    public void update_employees() {
        try {
            String sql = "UPDATE Employees SET identification_number=?,nok_identification_number=?,date_of_birth=?,user_name=?,password=?,full_name=?,residence=?,mobile_number=?,nok_name=?,nok_mobile=?,nok_residence=? WHERE email=?";
            
            PreparedStatement statement = connect.db_connect().prepareStatement(sql);
            statement.setString(1, "123456789");
            statement.setString(2, "William Henry Bill Gates");
            statement.setString(3, "bill.gates@microsoft.com");
            statement.setString(4, "bill");
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update_orders() {
    }

    public void update_service() {
    }

    public void update_users() {
    }

}
