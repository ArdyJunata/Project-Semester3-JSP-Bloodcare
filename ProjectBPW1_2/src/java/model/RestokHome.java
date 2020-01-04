package model;

import helper.Postingan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import helper.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RestokHome {

    public boolean insertUser(Restok restok) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();

        try {
            String insert = "insert into restok (tanggal, perequest, pemberi, status, qty) values("
                    + "'" + restok.getTanggal() + "',"
                    + "'" + restok.getPerequest() + "',"
                    + "'" + restok.getPemberi() + "',"
                    + "'direquest',"
                    + "" + restok.getQty() + ")";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RestokHome.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Restok> selectRequestan(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Restok> list = new ArrayList<>();

        try {
            String query = "select * from restok, user where restok.perequest = user.email and restok.pemberi = '" + email + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Restok restok = new Restok();
                restok.setId(rs.getInt(1));
                restok.setTanggal(rs.getString(2));
                restok.setPerequest(rs.getString(3));
                restok.setPemberi(rs.getString(4));
                restok.setStatus(rs.getString(5));
                restok.setQty(rs.getInt(6));
                restok.setNama(rs.getString(8));
                list.add(restok);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static ArrayList<Restok> selectMinta(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Restok> list = new ArrayList<>();

        try {
            String query = "select * from restok, user where restok.pemberi = user.email and restok.perequest = '" + email + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Restok restok = new Restok();
                restok.setId(rs.getInt(1));
                restok.setTanggal(rs.getString(2));
                restok.setPerequest(rs.getString(3));
                restok.setPemberi(rs.getString(4));
                restok.setStatus(rs.getString(5));
                restok.setQty(rs.getInt(6));
                restok.setNama(rs.getString(8));
                list.add(restok);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean statusUpdate(int id, String status) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "update restok set status = '" + status + "' where id = " + id;
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

    public boolean stokUpdate(String id, int qty) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "update user set stok = " + qty + " where email = '" + id + "'";
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

    public static int getStokById(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        int stok = 0;

        try {
            String query = "select stok from user where email = '" + email + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                stok = rs.getInt(1);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stok;
    }
}
