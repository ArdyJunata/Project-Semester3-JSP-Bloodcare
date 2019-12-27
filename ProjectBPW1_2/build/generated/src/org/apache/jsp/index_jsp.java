package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/templates/header.jsp");
    _jspx_dependants.add("/templates/navbar.jsp");
    _jspx_dependants.add("/templates/modalPencarianDarah.jsp");
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
      out.write("                    <li><a href=\"sass.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"sass.html\">About</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <a href=\"#!\" class=\"brand-logo\"><i class=\"material-icons\">queue</i>BloodCare</a>\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a style=\"font-weight: bold\" href=\"collapsible.html\">Muhammad Ardy Junata</a></li>\n");
      out.write("                    <li><a href=\"masuk.jsp\" class=\"waves-effect white btn-small btn-login\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("<div class=\"section\">\n");
      out.write("    <div class=\"red lighten-1\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <div class=\"col s2\"></div>\n");
      out.write("            <div class=\"col s8\">\n");
      out.write("                <div class=\"heading1 center-align\">\n");
      out.write("                    <h2>5,2 JUTA KANTONG DARAH</h2>\n");
      out.write("                    <h2>DIBUTUHKAN INDONESIA SETIAP TAHUNNYA</h2>\n");
      out.write("                    <p>donor darah sekarang untuk selamatkan nyawa mereka  -   cari pendonor darah yang sesuai cepat dan tepat</p>\n");
      out.write("                    <a class=\"waves-effect white btn-large btn-home\">Donor Darah</a>\n");
      out.write("                    <button class=\"waves-effect white btn-large btn-home modal-trigger\" data-target=\"cari\">Cari Pendonor</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--ABOUT-->\n");
      out.write("<div class=\"section about\">\n");
      out.write("    <div class=\"container center-align\">\n");
      out.write("        <h3>BERGABUNG DENGAN BLOODCARE</h3>\n");
      out.write("        <p>miliki akun bloodcare anda untuk membantu donor darah dan cari pendonor anda</p>\n");
      out.write("        <a href=\"masuk.jsp\" class=\"waves-effect red lighten-1 btn-large btn-join\">Daftar Akun</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--siapa saja-->\n");
      out.write("<div class=\"section candon red lighten-1\">\n");
      out.write("    <div class=\"container center-align\">\n");
      out.write("        <h3>SIAPA YANG BISA DONOR DARAH ?</h3>\n");
      out.write("        <p>ketahui syarat dan ketentuan donor darah</p>\n");
      out.write("        <a class=\"waves-effect white btn-large btn-home\">Pelajari Lebih Lanjut</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("        const box = document.querySelectorAll(\".modal\");\n");
      out.write("        M.Modal.init(box, {});\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("        const box = document.querySelectorAll(\"select\");\n");
      out.write("        M.FormSelect.init(box, {});\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal Structure -->\n");
      out.write("<div id=\"cari\" class=\"modal modal-fixed-footer\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <h4>Form Pencarian Darah</h4>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <form class=\"col s12\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <input placeholder=\"masukkan nama penerima darah\" id=\"nama\" type=\"text\" class=\"validate\">\n");
      out.write("                        <label for=\"nama\">Nama Penerima Darah</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s6\">\n");
      out.write("                        <input placeholder=\"masukkan email anda\" id=\"email\" type=\"email\" class=\"validate\">\n");
      out.write("                        <label for=\"email\">Email</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s6\">\n");
      out.write("                        <input id=\"alamat\" type=\"text\" class=\"validate\">\n");
      out.write("                        <label for=\"alamat\">Lokasi Penerima Saat Ini</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s6\">\n");
      out.write("                        <select>\n");
      out.write("                            <option value=\"\" disabled selected>pilih golongan darah anda</option>\n");
      out.write("                            <option value=\"A\">A</option>\n");
      out.write("                            <option value=\"B\">B</option>\n");
      out.write("                            <option value=\"AB\">AB</option>\n");
      out.write("                            <option value=\"O\">O</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label>Golongan Darah</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s6\">\n");
      out.write("                        <select>\n");
      out.write("                            <option value=\"\" disabled selected>tentukan jenis rh anda</option>\n");
      out.write("                            <option value=\"positif\">(+) Positif</option>\n");
      out.write("                            <option value=\"negatif\">(-) Negatif</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label>Faktor Resus(Rh)</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        <a href=\"#!\" class=\"modal-close waves-effect waves-green btn-flat\">Agree</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--JavaScript at end of body for optimized loading-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/myjs.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
