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
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aksi = request.getParameter("aksi");
        String email = request.getParameter("email");
        String halaman = request.getParameter("halaman");
        
        User user = new User();
        UserHome userHome = new UserHome();
        RequestDispatcher control = null;
        
        if (aksi.equals("hapus")) {
            if (userHome.deleteUser(email) == true) {
                control = request.getRequestDispatcher("/" + halaman);
            }
        } else if (aksi.equals("edit")) {
            String nama = request.getParameter("nama");
            String password = request.getParameter("password");
            String tanggal = request.getParameter("tanggal");
            String jenis = request.getParameter("jenis");
            int role = Integer.parseInt(request.getParameter("role"));
            int stok = Integer.parseInt(request.getParameter("stok"));
            
            user.setNama(nama);
            user.setPassword(password);
            user.setTanggal(tanggal);
            user.setEmail(email);
            user.setJenisKelamin(jenis);
            user.setRoleId(role);
            user.setStok(stok);
            
            if (userHome.updateUser(user) == true) {
                control = request.getRequestDispatcher("/" + halaman);
            } else {
                control = request.getRequestDispatcher("/adminIndex.jsp");
            }
            control.forward(request, response);
        }
        
    }
}
