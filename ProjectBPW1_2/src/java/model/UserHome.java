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
            String insert = "insert into user (nama, email, password, image, tanggal_lahir, umur, berat_badan, jenis_kelamin, stok, role_id) values ("
                    + "'" + user.getNama() + "',"
                    + "'" + user.getEmail() + "',"
                    + "'" + user.getPassword() + "',"
                    + "'" + user.getImage() + "',"
                    + "'0000-00-00',"
                    + "" + user.getUmur() + ","
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
                user.setEmail(rs.getString("email"));
                user.setNama(rs.getString("nama"));
                user.setPassword(rs.getString("password"));
                user.setImage(rs.getString("image"));
                user.setUmur(rs.getInt("umur"));
                user.setBeratBadan(rs.getInt("berat_badan"));
                user.setJenisKelamin(rs.getString("jenis_kelamin"));
                user.setStok(rs.getInt("stok"));
            }
            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
