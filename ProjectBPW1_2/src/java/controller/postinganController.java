/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import helper.*;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author ardyj
 */
public class postinganController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cek = request.getParameter("aksi");
        RequestDispatcher control = null;
        PostinganHome home = new PostinganHome();
        if (cek.equals("hapus")) {
            int id = Integer.parseInt(request.getParameter("id"));
            if (home.deletePost(id) == true) {
                home.deleteTrans(id);
                control = request.getRequestDispatcher("/halamanUser.jsp");
            } else {
                control = request.getRequestDispatcher("/halamanUser.jsp");
                System.out.println("gagal");
            }
        } else if (cek.equals("update")) {
            int postId = Integer.parseInt(request.getParameter("postId"));
            String status = request.getParameter("status");
            if (home.statusUpdate(postId, status) == true) {
                control = request.getRequestDispatcher("/halamanUser.jsp");
            } else {
                control = request.getRequestDispatcher("/index.jsp");
                System.out.println("gagal");
            }
        }
        control.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Postingan posting = new Postingan();
        PostinganHome home = new PostinganHome();
        HttpSession session = request.getSession();
        RequestDispatcher control = null;

        User user = (User) session.getAttribute("dataUser");

        String nama = request.getParameter("nama");
        String noHp = request.getParameter("hp");
        String alamat = request.getParameter("alamat");
        String goldar = request.getParameter("goldar");
        String rh = request.getParameter("rh");
        int kantung = Integer.parseInt(request.getParameter("kantung"));
        String keterangan = request.getParameter("keterangan");
        String email = request.getParameter("email");

        posting.setNamaPenerima(nama);
        posting.setNoHp(noHp);
        posting.setAlamat(alamat);
        posting.setGoldar(goldar);
        posting.setRh(rh);
        posting.setJmlKantung(kantung);
        posting.setKeterangan(keterangan);
        posting.setUserId(email);

        if (home.insertUser(posting) == true) {
            control = request.getRequestDispatcher("/transaksiController?aksi=post");
        } else {
            control = request.getRequestDispatcher("/masuk.jsp");
        }
        control.forward(request, response);

    }
}
