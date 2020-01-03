package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import helper.*;
import helper.*;
import model.*;

public final class gagalRutin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/templates/header.jsp");
    _jspx_dependants.add("/templates/navbar.jsp");
    _jspx_dependants.add("/templates/modalSyaratDonor.jsp");
    _jspx_dependants.add("/templates/footer.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("        \n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    boolean cekLogin = false;
    String nama = "none";
    User user = (User) session.getAttribute("dataUser");
    User cek = (User) session.getAttribute("index");
    try {

        if (cek.getCek() == 1) {
            UserHome home = new UserHome();

            cekLogin = home.cekLogin(user);

            nama = user.getNama();
        } else {
            cekLogin = false;
            nama = null;
        }
    } catch (NullPointerException ex) {
        RequestDispatcher control = null;
        control = request.getRequestDispatcher("/loginController");
        control.forward(request, response);
    }

      out.write("\n");
      out.write("<div class=\"section\">\n");
      out.write("    <div class=\"navbar-fixed\">\n");
      out.write("        <nav class=\"z-depth-0 navdy red lighten-1 nav\">\n");
      out.write("            <div class=\"nav-wrapper container\">\n");
      out.write("                <ul id=\"nav-mobile\" class=\"brand-logo center\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"#\">Tentang</a></li>\n");
      out.write("                    <li><a href=\"#\">Donor Rutin</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <a href=\"#!\" class=\"brand-logo\"><i class=\"material-icons\"></i>BloodCare</a>\n");
      out.write("                <ul id=\"navbar-items\" class=\"right hide-on-med-and-down\">\n");
      out.write("\n");
      out.write("                    ");
if (cekLogin == true) {
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"dropdown-trigger\" data-target=\"dropdown1\" style=\"font-weight: bold\" href=\"#\">\n");
      out.write("                            ");
      out.print(nama);
      out.write("<span class=\"material-icons\">arrow_drop_down</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"loginController\" class=\"waves-effect white btn-small btn-login\">Logout</a></li>\n");
      out.write("\n");
      out.write("                    ");
 } else { 
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"masuk.jsp\" class=\"waves-effect white btn-small btn-login\">Login</a></li>  \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<ul id=\"dropdown1\" class=\"dropdown-content\">\n");
      out.write("    <li><a href=\"halamanUser.jsp\" class=\"red-text text-accent-2\">Status Transaksi</a></li>\n");
      out.write("    <li><a href=\"editProfile.jsp\" class=\"red-text text-accent-2\">Edit Profile</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("        const drop = document.querySelectorAll(\".dropdown-trigger\");\n");
      out.write("        M.Dropdown.init(drop, {\n");
      out.write("            coverTrigger: false\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>");
      out.write("\n");
      out.write("<h3 class=\"center-align\">Anda sudah pernah melakukan request Donor Rutin.</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal Structure -->\n");
      out.write("<div id=\"syarat\" class=\"modal modal-fixed-footer\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <h4>Syarat Donor Darah</h4>\n");
      out.write("        <hr>\n");
      out.write("        <ul style=\"font-size: 17px;\">\n");
      out.write("            <li>1. Sehat Jasmani & Rohani</li>\n");
      out.write("            <li>2. Usia 17 Tahun s/d 60 tahun untuk Donor Darah Pertama kali</li>\n");
      out.write("            <li>3. Berat Badan Minimal 45 kg</li>\n");
      out.write("            <li>4. Tekanan Darah Sistolik 90-160 mmHg & Diastolik 60-100 mmHg</li>\n");
      out.write("            <li>5. Denyut Nadi 50-100 kali/menit</li>\n");
      out.write("            <li>6. Suhu Tubuh 36.5C-37.5C</li>\n");
      out.write("            <li>7. Kadar Hemogoblin darah 12.5-17 gr/dl</li>\n");
      out.write("            <li>8. Interval Donor Darah sejak penyumbangan terkahir adalah 2 Bulan</li>\n");
      out.write("            <li>9. Bagi Wanita, Tidak Dalam Keadaan Hamil, Menyusui & Menstruasi</li>\n");
      out.write("            <li>10. Waktu Terakhir Makan adalah 3 Jam Sebelum Menyumbangkan Darah</li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        <button class=\"btn waves-effect waves-ligh modal-closet btn-join red lighten-1 modal-close\" type=\"submit\" name=\"action\">Oke\n");
      out.write("        </button>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--JavaScript at end of body for optimized loading-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/myjs.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("</body>\n");
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
