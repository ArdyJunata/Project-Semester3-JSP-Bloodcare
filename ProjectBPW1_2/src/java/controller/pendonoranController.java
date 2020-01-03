package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import helper.*;
import model.*;

public class pendonoranController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher control = null;

        Pendonoran donor = new Pendonoran();
        PendonoranHome donorHome = new PendonoranHome();
        String aksi = request.getParameter("aksi");
        if (aksi.equals("insert")) {
            int jenis = Integer.parseInt(request.getParameter("jenis"));
            String email = request.getParameter("email");
            int postId = Integer.parseInt(request.getParameter("idPost"));
            String jenisName = "";
//        int donorId = Integer.parseInt(request.getParameter("idDonor"));
            if (jenis == 1) {
                jenisName = "biasa";
            } else if (jenis == 2) {
                jenisName = "rutin";
            }

            donor.setJenis(jenisName);
            donor.setUserId(email);

            if (donorHome.insertDonor(donor) == true) {
                control = request.getRequestDispatcher("/transaksiController?aksi=donor&postId=" + postId);
            } else {
                control = request.getRequestDispatcher("/index.jsp");
            }
        } else if (aksi.equals("update")) {
            int donorId = Integer.parseInt(request.getParameter("donorId"));
            int postId = Integer.parseInt(request.getParameter("postId"));
            if (donorHome.statusUpdate(donorId, "dibatalkan") == true) {
                control = request.getRequestDispatcher("/postinganController?aksi=update&status=dibatalkan&postId=" + postId);
            }
        }
        control.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
