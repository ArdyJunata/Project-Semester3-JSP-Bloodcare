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

public class editProfileController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher control = null;
        User user = new User();
        UserHome home = new UserHome();

        String nama = request.getParameter("nama");
        String email = request.getParameter("email");
        String jenis = request.getParameter("kelamin");
        String tanggal = request.getParameter("tanggal");
        int stok = Integer.parseInt(request.getParameter("stok"));

        user.setNama(nama);
        user.setEmail(email);
        user.setJenisKelamin(jenis);
        user.setTanggal(tanggal);
        user.setBeratBadan(0);
        user.setStok(stok);

        if (home.updateProfile(user) == true) {
            if (stok >= 0) {
                control = request.getRequestDispatcher("/editStock.jsp");
            } else if (stok < 0) {
                control = request.getRequestDispatcher("/editProfile.jsp");
            }
        } else {
            control = request.getRequestDispatcher("/index.jsp");
        }
        control.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newEmail = request.getParameter("newEmail");
        String oldEmail = request.getParameter("oldEmail");

        UserHome home = new UserHome();
        RequestDispatcher control = null;

        if (home.updateEmail(oldEmail, newEmail)) {
            control = request.getRequestDispatcher("loginController");
        } else {
            control = request.getRequestDispatcher("editEmail.jsp");
        }
        control.forward(request, response);
    }
}
