package model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransaksiHome {

    public boolean updateTrans(int id, int post) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "update transaksi set donor_id = " + id + " where post_id = " + post + "";
            akses.connect();

            int baris = akses.executeUpdate(delete);
            if (baris > 0) {
                sukses = true;
            }
            akses.disconnect();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sukses;
    }

    public boolean statusUpdate(int post, String status) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "update transaksi set status = '" + status + "' where post_id = " + post + "";
            akses.connect();

            int baris = akses.executeUpdate(delete);
            if (baris > 0) {
                sukses = true;
            }
            akses.disconnect();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sukses;
    }

}
