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
            String insert = "insert into postingan (nama_penerima, no_hp, alamat, goldar, rh, jml_kantong, keterangan, user_id) values ("
                    + "'" + posting.getNamaPenerima() + "',"
                    + "'" + posting.getNoHp() + "',"
                    + "'" + posting.getAlamat() + "',"
                    + "'" + posting.getGoldar() + "',"
                    + "'" + posting.getRh() + "',"
                    + "" + posting.getJmlKantung() + ","
                    + "'" + posting.getKeterangan() + "',"
                    + "'" + posting.getUserId() + "')";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean insertTransaksiPost(int id) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();

        try {
            String insert = "insert into transaksi (tanggal_transaksi, status, post_id, donor_id) values ("
                    + "'" + dtf.format(now) + "',"
                    + "'menunggu',"
                    + "" + id + ","
                    + "0)";
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
            String query = "SELECT * FROM postingan where user_id <> '" + email + "'";
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
                list.add(posting);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static ArrayList<Postingan> selectAllSelf(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Postingan> list = new ArrayList<>();

        try {
            String query = "SELECT * FROM postingan where user_id = '" + email + "'";
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
                list.add(posting);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean deletePost(int id) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "delete from postingan where id = " + id + "";
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

}
