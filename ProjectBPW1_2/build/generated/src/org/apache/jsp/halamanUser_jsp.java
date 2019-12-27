package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class halamanUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/templates/header.jsp");
    _jspx_dependants.add("/templates/navbar.jsp");
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
      out.write("<div class=\"section\">\n");
      out.write("    <div class=\"navbar-fixed\">\n");
      out.write("        <nav class=\"z-depth-0 navdy red lighten-1 nav\">\n");
      out.write("            <div class=\"nav-wrapper container\">\n");
      out.write("                <ul id=\"nav-mobile\" class=\"brand-logo center\">\n");
      out.write("                    <li><a href=\"index.jsp\">Beranda</a></li>\n");
      out.write("                    <li><a href=\"sass.html\">Tentang</a></li>\n");
      out.write("                    <li><a href=\"sass.html\">Donor Rutin</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <a href=\"#!\" class=\"brand-logo\"><i class=\"material-icons\"></i>BloodCare</a>\n");
      out.write("                <ul id=\"navbar-items\" class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"dropdown-trigger\" data-target=\"dropdown1\" style=\"font-weight: bold\" href=\"#\">\n");
      out.write("                            Muhammad Ardy Junata<span class=\"material-icons\">arrow_drop_down</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"masuk.jsp\" class=\"waves-effect white btn-small btn-login\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<ul id=\"dropdown1\" class=\"dropdown-content\">\n");
      out.write("    <li><a href=\"halamanUser.jsp\" class=\"red-text text-accent-2\">Status Transaksi</a></li>\n");
      out.write("    <li><a href=\"#!\" class=\"red-text text-accent-2\">Edit Profile</a></li>\n");
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
      out.write("\n");
      out.write("<div class=\"section\" style=\"margin-top: 36px;\">\n");
      out.write("    <div class=\"red lighten-1\">\n");
      out.write("        <div class=\"container\" style=\"height: 100%\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s6\">\n");
      out.write("                    <h4 class=\"white-text center-align\">History Pendonoran</h4>\n");
      out.write("                    <ul class=\"collection\">\n");
      out.write("                        <li class=\"collection-item avatar\">\n");
      out.write("                            <i class=\"material-icons circle teal accent-4\">remove</i>\n");
      out.write("                            <span class=\"title\">Title</span>\n");
      out.write("                            <p>First Line <br>\n");
      out.write("                                Second Line\n");
      out.write("                            </p>\n");
      out.write("                            <a href=\"#!\" class=\"secondary-content\">ditolak</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"collection-item avatar\">\n");
      out.write("                            <i class=\"material-icons circle  teal accent-4\">check</i>\n");
      out.write("                            <span class=\"title\">Title</span>\n");
      out.write("                            <p>First Line <br>\n");
      out.write("                                Second Line\n");
      out.write("                            </p>\n");
      out.write("                            <a href=\"#!\" class=\"secondary-content\">selesai</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"collection-item avatar\">\n");
      out.write("                            <i class=\"material-icons circle  teal accent-4\">check</i>\n");
      out.write("                            <span class=\"title\">Title</span>\n");
      out.write("                            <p>First Line <br>\n");
      out.write("                                Second Line\n");
      out.write("                            </p>\n");
      out.write("                            <a href=\"#!\" class=\"secondary-content\">selesai</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"collection-item avatar\">\n");
      out.write("                            <i class=\"material-icons circle  teal accent-4\">refresh</i>\n");
      out.write("                            <span class=\"title\">Title</span>\n");
      out.write("                            <p>First Line <br>\n");
      out.write("                                Second Line\n");
      out.write("                            </p>\n");
      out.write("                            <a href=\"#!\" class=\"secondary-content\">proses</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s6\">\n");
      out.write("                    <h4 class=\"white-text center-align\">Permintaan Darah</h4>\n");
      out.write("                    <ul class=\"collapsible collection\">\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"collapsible-header\">\n");
      out.write("                                <i class=\"material-icons\">refresh</i>\n");
      out.write("                                <span>Ardy Junata</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"collapsible-body white\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Nama Penerima</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>Ardy Junata</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Email</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>ardy18ti@mahasiswa.pcr.ac.id</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Alamat Penerima Darah</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>Rumah Sakit Awal Bros</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Golongan Darah</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>O+</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Jumlah Kantong Darah</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>4 Kantong Dibutuhkan</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Keterangan</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>kecelakaan</td>\n");
      out.write("                                        </tr>                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Status</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>menunggu</td>\n");
      out.write("                                        </tr>                                        \n");
      out.write("                                    </table><br>\n");
      out.write("                                <button class=\"btn teal accent-4 white-text\">Hapus Postingan</button>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    <ul class=\"collapsible collection\">\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"collapsible-header\">\n");
      out.write("                                <i class=\"material-icons\">refresh</i>\n");
      out.write("                                <span>Jody Alief Prismart</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"collapsible-body white\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Nama Penerima</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>Ardy Junata</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Email</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>ardy18ti@mahasiswa.pcr.ac.id</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Alamat Penerima Darah</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>Rumah Sakit Awal Bros</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Golongan Darah</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>O+</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Jumlah Kantong Darah</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>4 Kantong Dibutuhkan</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Keterangan</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>kecelakaan</td>\n");
      out.write("                                        </tr>                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Status</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td>menunggu</td>\n");
      out.write("                                        </tr>                                        \n");
      out.write("                                    </table><br>\n");
      out.write("                                <button class=\"btn teal accent-4 white-text\">Hapus Postingan</button>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("        const collap = document.querySelectorAll(\".collapsible\");\n");
      out.write("        M.Collapsible.init(collap, {});\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
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
