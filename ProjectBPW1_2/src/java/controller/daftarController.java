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
import helper.*;
import model.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author ardyj
 */
public class daftarController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = new User();
        UserHome userHome = new UserHome();
        RequestDispatcher control = null;
        String nama = request.getParameter("nama");
        String email = request.getParameter("email");
        String password = request.getParameter("katasandi");
        String pesan = null;

        user.setNama(nama);
        user.setEmail(email);
        user.setPassword(password);

        if (userHome.insertUser(user) == true) {
            control = request.getRequestDispatcher("/masuk.jsp");
            control.include(request, response);
        } else {
            pesan = "Email telah terdaftar";
            request.setAttribute("duplikatEmail", pesan);
            control = request.getRequestDispatcher("/daftar.jsp");
            control.forward(request, response);
        }

    }
}
