package model;

import java.sql.ResultSet;
import helper.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserHome {
    Date tanggal;

    public boolean insertUser(User user) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();

        try {

            String insert = "insert into user values ('', 'a', 'b', 'c', 'd','0000-00-00', 0, 0, 'e', 0, 2 )";
            akses.connect();
            akses.executeQuery(insert);
            akses.disconnect();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
