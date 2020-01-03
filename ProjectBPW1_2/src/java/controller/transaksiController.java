/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.Postingan;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

/**
 *
 * @author ardyj
 */
public class transaksiController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher control = null;
        PostinganHome home = new PostinganHome();
        PendonoranHome donorHome = new PendonoranHome();
        TransaksiHome trans = new TransaksiHome();

        String aksi = request.getParameter("aksi");

        if (aksi.equals("post")) {
            int id = PostinganHome.selectLatest();

            if (trans.insertTransaksiPost(id) == true) {
                control = request.getRequestDispatcher("/halamanUser.jsp");
            } else {
                control = request.getRequestDispatcher("/index.jsp");
            }
        } else if (aksi.equals("donor")) {
            int postId = Integer.parseInt(request.getParameter("postId"));
            int id = PendonoranHome.selectLatest();

            if (trans.updateTrans(id, postId) == true) {
                home.statusUpdate(postId, "direquest");
                control = request.getRequestDispatcher("/halamanUser.jsp");
            } else {
                control = request.getRequestDispatcher("/index.jsp");
            }
        } else if(aksi.equals("rutin")) {
            int id = PendonoranHome.selectLatest();

            if (trans.insertTransaksiDonor(id) == true) {
                control = request.getRequestDispatcher("/halamanUser.jsp");
            } else {
                control = request.getRequestDispatcher("/index.jsp");
            }
        }
        control.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
