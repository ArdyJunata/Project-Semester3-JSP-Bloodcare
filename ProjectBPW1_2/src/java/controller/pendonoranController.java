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

        int jenis = Integer.parseInt(request.getParameter("jenis"));
        String email = request.getParameter("email");
        int postId = Integer.parseInt(request.getParameter("id"));

        donor.setJenisId(jenis);
        donor.setUserId(email);

        if (donorHome.insertDonor(donor) == true) {
            control = request.getRequestDispatcher("/transaksiController?aksi=donor&postId=" + postId);
        } else {
            control = request.getRequestDispatcher("/halamanPostingan.jsp");
        }
        control.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}