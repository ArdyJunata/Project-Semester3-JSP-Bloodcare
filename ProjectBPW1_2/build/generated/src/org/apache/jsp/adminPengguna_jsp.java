package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import helper.*;
import model.*;

public final class adminPengguna_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/templates/headerAdmin.jsp");
    _jspx_dependants.add("/templates/sidebar.jsp");
    _jspx_dependants.add("/templates/modalTambahPengguna.jsp");
    _jspx_dependants.add("/templates/footerAdmin.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>Admin Page</title>\n");
      out.write("\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\">");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Page Wrapper -->\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar - Brand -->\n");
      out.write("      <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\">Admin BloodCare</div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Dashboard -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"adminIndex.jsp\">\n");
      out.write("          <span>Dashboard</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("      <!-- Heading -->\n");
      out.write("      <div class=\"sidebar-heading\">\n");
      out.write("        User\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"adminPengguna.jsp\">\n");
      out.write("          <span>Pendonor</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"adminRs.jsp\">\n");
      out.write("          <span>Rumah Sakit</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"adminUtd.jsp\">\n");
      out.write("          <span>UTD</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"adminAkun.jsp\">\n");
      out.write("          <span>Admin</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"loginController\">\n");
      out.write("          <span>Logout</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("    <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    ArrayList<User> list = UserHome.getUserByRole(2);
    String pesan = (String) request.getAttribute("pesan");


      out.write("\n");
      out.write("\n");
      out.write("<!-- Content Wrapper -->\n");
      out.write("<div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("    <!-- Main Content -->\n");
      out.write("    <div id=\"content\" style=\"margin-top:60px;\">\n");
      out.write("        <!-- Begin Page Content -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("            <!-- Page Heading -->\n");
      out.write("            \n");
      out.write("            <h1 class=\"h3 mb-4 text-gray-800\">Akun Pengguna</h1>\n");
      out.write("            ");
                
                if (pesan != null) {
                    if (pesan.equals("berhasil")) {
            
      out.write("\n");
      out.write("            <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                Aksi Berhasil!\n");
      out.write("            </div>\n");
      out.write("            ");
 } else if (pesan.equals("gagal")) { 
      out.write("\n");
      out.write("            <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                Aksi Gagal!\n");
      out.write("            </div>\n");
      out.write("            ");
 }
                } 
      out.write("\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" style=\"margin-bottom: 20px;\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("               Tambah Pengguna\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Tambah Akun Pengguna</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form action=\"userController\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" value=\"pengguna\" name=\"aksi\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Nama Lengkap</label>\n");
      out.write("                        <input type=\"text\" name=\"nama\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Masukkan nama lengkap\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                <input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Masukkan email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                                <input type=\"password\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"masukkan katasandi\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Tutup</button>\n");
      out.write("                ");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"role\" value=\"2\">\n");
      out.write("            <input type=\"hidden\" name=\"halaman\" value=\"adminPengguna.jsp\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Simpan</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<table class=\"table\">\n");
      out.write("    <thead class=\"thead-dark\">\n");
      out.write("        <tr>\n");
      out.write("            <th scope=\"col\">#</th>\n");
      out.write("            <th scope=\"col\">Nama</th>\n");
      out.write("            <th scope=\"col\">Email</th>\n");
      out.write("            <th scope=\"col\">Password</th>\n");
      out.write("            <th scope=\"col\">Tanggal Lahir</th>\n");
      out.write("            <th scope=\"col\">Jenis Kelamin</th>\n");
      out.write("            <th scope=\"col\">Aksi</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    ");
                    for (int i = 0; i < list.size(); i++) {
            list.get(i);
    
      out.write("\n");
      out.write("    <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <th scope=\"row\">");
      out.print( i + 1);
      out.write("</th>\n");
      out.write("            <td>");
      out.print( list.get(i).getNama());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( list.get(i).getEmail());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( list.get(i).getPassword());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( list.get(i).getTanggal());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( list.get(i).getJenisKelamin());
      out.write("</td>\n");
      out.write("            <td><a href=\"adminEdit.jsp?email=");
      out.print( list.get(i).getEmail());
      out.write("\" class=\"btn btn-primary btn-sm text-white\">edit</a> \n");
      out.write("                <a href=\"userController?aksi=hapus&halaman=adminPengguna.jsp&email=");
      out.print( list.get(i).getEmail());
      out.write("\" class=\"btn btn-danger btn-sm text-white\">hapus</a> \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </tbody>\n");
      out.write("    ");
 }
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"sticky-footer bg-white\">\n");
      out.write("    <div class=\"container my-auto\">\n");
      out.write("        <div class=\"copyright text-center my-auto\">\n");
      out.write("            <span>Copyright &copy; Your Website 2019</span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<!-- End of Footer -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- End of Page Wrapper -->\n");
      out.write("<!-- Bootstrap core JavaScript-->\n");
      out.write("<script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Core plugin JavaScript-->\n");
      out.write("<script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Custom scripts for all pages-->\n");
      out.write("<script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
