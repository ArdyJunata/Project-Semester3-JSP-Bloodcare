package model;

import helper.*;
import helper.Postingan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PendonoranHome {

    public boolean insertDonor(Pendonoran donor) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();

        try {
            String insert = "insert into pendonoran (jenis_id, user_id) values (" + donor.getJenisId() + ", '" + donor.getUserId() + "')";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Pendonoran> selectAllSelf(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Pendonoran> list = new ArrayList<>();

        try {
            String query = "select * from pendonoran, transaksi, jenis_donor where pendonoran.jenis_id = jenis_donor.id and \n"
                    + "transaksi.donor_id = pendonoran.id and pendonoran.user_id = '" + email + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Pendonoran donor = new Pendonoran();
                donor.setId(rs.getInt(1));
                donor.setJenisId(rs.getInt(2));
                donor.setUserId(rs.getString(3));
                donor.setTanggal(rs.getString(5));
                donor.setStatus(rs.getString(6));
                donor.setJenis(rs.getString(10));
                list.add(donor);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static int selectLatest() {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        int id = 0;

        try {
            String query = "SELECT * FROM pendonoran ORDER BY ID DESC LIMIT 1";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                id = rs.getInt(1);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
