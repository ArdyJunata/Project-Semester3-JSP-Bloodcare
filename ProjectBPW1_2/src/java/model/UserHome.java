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
        boolean cek = false;

        try {
            String insert = "select email, password from user";
            akses.connect();
            ResultSet rs = akses.executeQuery(insert);;

            while (rs.next()) {
                email = rs.getString("email");
                password = rs.getString("password");

                if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
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
                    + "berat_badan = " + user.getBeratBadan() + " "
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
}
