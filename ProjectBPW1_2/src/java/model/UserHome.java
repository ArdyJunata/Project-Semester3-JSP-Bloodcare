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
            String insert = "insert into user (nama, email, password, image, tanggal_lahir, berat_badan, jenis_kelamin, stok, role_id) values ("
                    + "'" + user.getNama() + "',"
                    + "'" + user.getEmail() + "',"
                    + "'" + user.getPassword() + "',"
                    + "'" + user.getImage() + "',"
                    + "'0000-00-00',"
                    + "" + user.getBeratBadan() + ","
                    + "'" + user.getJenisKelamin() + "',"
                    + "" + user.getStok() + ","
                    + "" + user.getRoleId() + ""
                    + ")";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean cekLogin(User user) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        String email, password;
        int role;
        boolean cek = false;

        try {
            String insert = "select email, password, role_id from user";
            akses.connect();
            ResultSet rs = akses.executeQuery(insert);;

            while (rs.next()) {
                email = rs.getString("email");
                password = rs.getString("password");
                role = rs.getInt("role_id");

                if (email.equals(user.getEmail()) && password.equals(user.getPassword()) && role == user.getRoleId()) {
                    cek = true;
                }
            }
            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }

    public User getUserByEmail(String email) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        User user = new User();
        try {
            String insert = "select * from user where email = '" + email + "'";
            akses.connect();
            ResultSet rs = akses.executeQuery(insert);;

            while (rs.next()) {
                user.setNama(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setImage(rs.getString(5));
                user.setTanggal(rs.getString(6));
                user.setBeratBadan(rs.getInt(7));
                user.setJenisKelamin(rs.getString(8));
                user.setRoleId(rs.getInt("role_id"));
                user.setStok(rs.getInt(9));
            }
            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public boolean updateProfile(User user) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "update user set nama = '" + user.getNama() + "', "
                    + "jenis_kelamin = '" + user.getJenisKelamin() + "', "
                    + "tanggal_lahir = '" + user.getTanggal() + "', "
                    + "berat_badan = " + user.getBeratBadan() + ","
                    + "stok = " + user.getStok() + " "
                    + "where email = '" + user.getEmail() + "'";
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

    public boolean updateEmail(String oldEmail, String newEmail) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;

        try {
            String delete = "update user set email = '" + newEmail + "' where email = '" + oldEmail + "'";
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

    public static ArrayList<User> selectStockOther(String email, int role) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<User> list = new ArrayList<>();

        try {
            String query = "select * from user where email <> '" + email + "' and role_id = " + role;
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                User user = new User();
                user.setNama(rs.getString("nama"));
                user.setStok(rs.getInt("stok"));
                user.setEmail(rs.getString("email"));
                list.add(user);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static ArrayList<User> getUserByRole(int role) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<User> list = new ArrayList<>();

        try {
            String query = "select * from user where role_id = " + role;
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                User user = new User();
                user.setNama(rs.getString("nama"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setTanggal(rs.getString("tanggal_lahir"));
                user.setBeratBadan(rs.getInt("berat_badan"));
                user.setJenisKelamin(rs.getString("jenis_kelamin"));
                user.setStok(rs.getInt("stok"));
                user.setRoleId(rs.getInt("role_id"));
                list.add(user);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static String cekRequested(String perequest, String pemberi) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        boolean sukses = false;
        String nama = null;

        try {
            String cek = "select * from restok where perequest = '" + perequest + "' and pemberi ='" + pemberi + "'";
            akses.connect();

            ResultSet rs = akses.executeQuery(cek);

            while (rs.next()) {
                nama = rs.getString(1);
            }
            akses.disconnect();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PostinganHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nama;
    }
}
