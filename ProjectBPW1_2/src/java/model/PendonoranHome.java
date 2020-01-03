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

    public boolean insertDonorRutin(Pendonoran donor) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();

        try {
            String insert = "insert into pendonoran (jenis_id, user_id, status) values ('" + donor.getJenis() + "', '" + donor.getUserId() + "', 'menjalani')";
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
            String query = "select * from transaksi, pendonoran where transaksi.donor_id = pendonoran.id and pendonoran.user_id = '" + email + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Transaksi trans = new Transaksi();
                trans.setId(rs.getInt(1));
                trans.setJenis(rs.getString(6));
                trans.setTanggal(rs.getString(2));
                trans.setPostId(rs.getInt(3));
                trans.setDonorId(rs.getInt(4));
                trans.setStatusDonor(rs.getString(8));
                list.add(trans);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Transaksi selectAllBiasa(int id) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        Transaksi trans = new Transaksi();
        try {
            String query = "select * from pendonoran, transaksi, postingan, user "
                    + "where transaksi.donor_id = pendonoran.id and "
                    + "transaksi.post_id = postingan.id and "
                    + "postingan.user_id = user.email and "
                    + "transaksi.id = " + id + "";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
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
                trans.setDonorId(rs.getInt(1));
                trans.setPostId(rs.getInt(9));
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trans;
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

    public static String selectRutin(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        String jenis = null;

        try {
            String query = "SELECT jenis_id FROM pendonoran where user_id = '" + email + "' and jenis_id = 'rutin'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                jenis = rs.getString(1);

            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jenis;
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

    public boolean deleteTrans(int id) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "delete from pendonoran where id = " + id + "";
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
