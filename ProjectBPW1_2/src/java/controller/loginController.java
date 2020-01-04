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
import model.*;

/**
 *
 * @author ardyj
 */
public class loginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User();
        UserHome home = new UserHome();

        RequestDispatcher control = null;
        HttpSession session = request.getSession();

        String email = request.getParameter("email");
        String password = request.getParameter("katasandi");
        int role = Integer.parseInt(request.getParameter("role"));

        user.setEmail(email);
        user.setPassword(password);
        user.setRoleId(role);

        if (role != 0) {
            if (home.cekLogin(user) == true) {
                session.setAttribute("dataUser", home.getUserByEmail(email));
                user.setCek(1);
                session.setAttribute("index", user);
                if (role == 1) {
                } else if (role == 2) {
                    control = request.getRequestDispatcher("/index.jsp");
                } else if (role == 3) {
                    control = request.getRequestDispatcher("/stock.jsp");
                } else if (role == 4) {
                    control = request.getRequestDispatcher("/stock.jsp");
                }

            } else {
                String pesan = "kesalahan, silahkan login kembali";
                request.setAttribute("duplikatEmail", pesan);
                control = request.getRequestDispatcher("/masuk.jsp");
            }
        } else {
            control = request.getRequestDispatcher("/masuk.jsp");
        }

        control.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        RequestDispatcher control = null;

        session.removeAttribute("dataUser");
        session.invalidate();

        control = request.getRequestDispatcher("/masuk.jsp");
        control.forward(request, response);
    }
}
