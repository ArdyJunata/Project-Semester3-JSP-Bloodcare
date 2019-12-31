package model;

import java.sql.ResultSet;
import helper.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostinganHome {

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
    
     public static ArrayList<Postingan> selectAll() {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Postingan> list = new ArrayList<>();

        try {
            String query = "SELECT * FROM postingan";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Postingan posting = new Postingan();
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

}
