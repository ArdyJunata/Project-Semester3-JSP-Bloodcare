package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class masuk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/templates/header.jsp");
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

    String pesan = (String) request.getAttribute("duplikatEmail");
    boolean cek = false;
    if (pesan == null) {
        cek = false;
    } else {
        cek = true;
    }



      out.write("\n");
      out.write("<div class=\"section bg\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col m6 offset-m3\">\n");
      out.write("                <form action=\"loginController\" method=\"post\" class=\"masuk-container z-depth-3\">\n");
      out.write("                    <h4 class=\"center-align\">Masuk</h4>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col m4\">\n");
      out.write("                            <img src=\"img/user.png\" width=\"160\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col m8\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">email</i>\n");
      out.write("                                <input id=\"email\" name=\"email\" type=\"email\" class=\"validate\">\n");
      out.write("                                <label for=\"email\">Email</label>\n");
      out.write("                                ");
 if (cek == true) {
      out.write("\n");
      out.write("                                <span class=\"helper-text align-left red-text\">");
      out.print(pesan);
      out.write("</span>\n");
      out.write("                                ");
 } else {
      out.write("\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">vpn_key</i>\n");
      out.write("                                <input id=\"katasandi\" name=\"katasandi\" type=\"password\" class=\"validate\">\n");
      out.write("                                <label for=\"katasandi\">Kata Sandi</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                            </div>\n");
      out.write("                        <button class=\"btn red lighten-1\">Masuk</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"center-align\">belum menjadi anggota ? Klik <a href=\"daftar.jsp\">Daftar</a></p>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("        const box = document.querySelectorAll(\"select\");\n");
      out.write("        M.FormSelect.init(box, {});\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
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
