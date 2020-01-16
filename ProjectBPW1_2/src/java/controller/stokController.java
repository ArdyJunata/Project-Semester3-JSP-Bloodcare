package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import helper.*;
import model.*;

public class stokController extends HttpServlet {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDateTime now = LocalDateTime.now();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String aksi = request.getParameter("aksi");

        RestokHome home = new RestokHome();
        Restok stok = new Restok();
        RequestDispatcher control = null;
        if (aksi.equals("insert")) {
            String perequest = request.getParameter("perequest");
            String pemberi = request.getParameter("pemberi");
            int qty = Integer.parseInt(request.getParameter("qty"));
            int stoks = Integer.parseInt(request.getParameter("stok"));

            if (qty > stoks) {
                String pesan = "tidak cukup";
                request.setAttribute("pesan", pesan);
                control = request.getRequestDispatcher("/stock.jsp");
            } else if (qty <= stoks) {
                stok.setPemberi(pemberi);
                stok.setPerequest(perequest);
                stok.setQty(qty);
                stok.setTanggal(dtf.format(now));

                if (home.insertUser(stok)) {
                    control = request.getRequestDispatcher("/halamanRequest.jsp");
                } else {
                    control = request.getRequestDispatcher("/stock.jsp");
                }
            } else if (qty < 1) {
                String pesan = "tidak bisa";
                request.setAttribute("pesan", pesan);
                control = request.getRequestDispatcher("/stock.jsp");
            }
        } else if (aksi.equals("terima")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String status = "diterima";
            int qty = Integer.parseInt(request.getParameter("qty"));
            if (home.statusUpdate(id, status) == true) {
                String perequest = request.getParameter("perequest");
                String pemberi = request.getParameter("pemberi");
                int stoks = Integer.parseInt(request.getParameter("stok"));
                home.stokUpdate(pemberi, stoks);
                home.stokUpdate(perequest, qty);
                control = request.getRequestDispatcher("/halamanRequest.jsp");
            }
        } else if (aksi.equals("tolak")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String status = "ditolak";
            int qty = Integer.parseInt(request.getParameter("qty"));
            if (home.statusUpdate(id, status) == true) {
                String perequest = request.getParameter("perequest");
                home.stokUpdate(perequest, qty);
                control = request.getRequestDispatcher("/halamanRequest.jsp");
            }
        }
        control.forward(request, response);
    }

}
