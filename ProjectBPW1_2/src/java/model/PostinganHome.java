package model;

import java.sql.ResultSet;
import helper.*;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostinganHome {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();

    public boolean insertUser(Postingan posting) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();

        try {
            String insert = "insert into postingan (nama_penerima, no_hp, alamat, goldar, rh, jml_kantong, keterangan, user_id, status) values ("
                    + "'" + posting.getNamaPenerima() + "',"
                    + "'" + posting.getNoHp() + "',"
                    + "'" + posting.getAlamat() + "',"
                    + "'" + posting.getGoldar() + "',"
                    + "'" + posting.getRh() + "',"
                    + "" + posting.getJmlKantung() + ","
                    + "'" + posting.getKeterangan() + "',"
                    + "'" + posting.getUserId() + "',"
                    + "'tersedia')";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static int selectLatest() {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        int id = 0;

        try {
            String query = "SELECT * FROM postingan ORDER BY ID DESC LIMIT 1";
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

    public static ArrayList<Postingan> selectAllOther(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Postingan> list = new ArrayList<>();

        try {
            String query = "select * from postingan, transaksi where transaksi.post_id = postingan.id and postingan.user_id <> '" + email + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Postingan posting = new Postingan();
                posting.setId(rs.getInt(1));
                posting.setNamaPenerima(rs.getString(2));
                posting.setNoHp(rs.getString(3));
                posting.setAlamat(rs.getString(4));
                posting.setGoldar(rs.getString(5));
                posting.setRh(rs.getString(6));
                posting.setJmlKantung(rs.getInt(7));
                posting.setKeterangan(rs.getString(8));
                posting.setUserId(rs.getString(9));
                posting.setStatus(rs.getString(10));
                posting.setIdDonor(rs.getInt(14));
                list.add(posting);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static ArrayList<Transaksi> selectAllSelf(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Transaksi> list = new ArrayList<>();

        try {
            String query = "select * from transaksi, postingan where transaksi.post_id = postingan.id and postingan.user_id = '" + email + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Transaksi trans = new Transaksi();
                trans.setId(rs.getInt(1));
                trans.setTanggal(rs.getString(2));
                trans.setNamaPenerima(rs.getString(6));
                trans.setPostId(rs.getInt(3));
                trans.setGoldar(rs.getString(9));
                trans.setRh(rs.getString(10));
                trans.setStatusPost(rs.getString(14));
                trans.setNoHp(rs.getString(7));
                trans.setAlamat(rs.getString(8));
                trans.setJmlKantung(rs.getInt(11));
                trans.setKeterangan(rs.getString(12));
                list.add(trans);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static String selectAllSelfRequested(int transId) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        String nama = null;

        try {
            String query = "select * from pendonoran, transaksi, user where transaksi.donor_id = pendonoran.id and pendonoran.user_id = user.email and transaksi.id = " + transId;
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                nama = rs.getString(10);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nama;
    }

    public boolean deletePost(int id) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "delete from postingan where id = " + id;
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
            String delete = "delete from transaksi where post_id = " + id + "";
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
            String delete = "update postingan set status = '" + status + "' where id = " + post;
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
