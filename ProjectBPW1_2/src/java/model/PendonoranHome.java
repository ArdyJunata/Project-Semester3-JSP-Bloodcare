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
            String insert = "insert into pendonoran (jenis_id, user_id, status) values ('" + donor.getJenis() + "', '" + donor.getUserId() + "', 'direquest')";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Transaksi> selectAllSelf(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Transaksi> list = new ArrayList<>();

        try {
            String query = "select * from pendonoran, transaksi, postingan, user "
                    + "where transaksi.donor_id = pendonoran.id and "
                    + "transaksi.post_id = postingan.id and "
                    + "postingan.user_id = user.email and "
                    + "pendonoran.user_id = '" + email + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Transaksi trans = new Transaksi();
                trans.setId(rs.getInt(5));
                trans.setJenis(rs.getString(2));
                trans.setTanggal(rs.getString(6));
                trans.setNamaPenerima(rs.getString(10));
                trans.setGoldar(rs.getString(13));
                trans.setRh(rs.getString(14));
                trans.setNamaUser(rs.getString(20));
                trans.setStatusDonor(rs.getString(4));
                trans.setNoHp(rs.getString(11));
                trans.setAlamat(rs.getString(12));
                trans.setJmlKantung(rs.getInt(15));
                trans.setKeterangan(rs.getString(16));
                list.add(trans);
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

    public boolean statusUpdate(int donor, String status) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "update pendonoran set status = '" + status + "' where id = " + donor + "";
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
