package controller;

import helper.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserHome;

public class userController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = new User();
        UserHome userHome = new UserHome();
        RequestDispatcher control = null;
        String nama = request.getParameter("nama");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        int role = Integer.parseInt(request.getParameter("role"));
        String halaman = request.getParameter("halaman");

        user.setNama(nama);
        user.setEmail(email);
        user.setPassword(password);
        user.setRoleId(role);

        if (userHome.insertUser(user) == true) {
            control = request.getRequestDispatcher("/" + halaman);
            control.include(request, response);
        } else {
            control = request.getRequestDispatcher("/adminIndex.jsp");
            control.forward(request, response);
        }

    }
}
