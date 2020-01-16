<%-- 
    Document   : navbarInstansi
    Created on : Dec 26, 2019, 2:25:41 PM
    Author     : ardyj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="helper.*"%>
<%@page import="model.*"%>
<%
    boolean cekLogin = false;
    String nama = "none";
    User user = (User) session.getAttribute("dataUser");
    User cek = (User) session.getAttribute("index");
    try {

        if (cek.getCek() == 1) {
            UserHome home = new UserHome();

            User user1 = new User();

            user1 = home.getUserByEmail(user.getEmail());
            int role = user1.getRoleId();

            cekLogin = home.cekLogin(user, role);

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
%>
<div class="section">
    <div class="navbar-fixed">
        <nav class="z-depth-0 navdy red lighten-1 nav">
            <div class="nav-wrapper container">
                <ul id="nav-mobile" class="brand-logo center">
                    <li><a href="stock.jsp">Home</a></li>
                    <li><a href="#">Tentang</a></li>
                </ul>
                <a href="index.jsp" class="brand-logo"><i class="material-icons"></i>BloodCare</a>
                <ul id="navbar-items" class="right hide-on-med-and-down">

                    <%if (cekLogin == true) {%>
                    <li>
                        <a class="dropdown-trigger" data-target="dropdown1" style="font-weight: bold" href="#">
                            <%=nama%><span class="material-icons">arrow_drop_down</span>
                        </a>
                    </li>
                    <li><a href="loginController" class="waves-effect white btn-small btn-login">Logout</a></li>

                    <% } else { %>
                    </li>
                    <li><a href="masuk.jsp" class="waves-effect white btn-small btn-login">Login</a></li>  
                        <% }%>

                </ul>
            </div>
        </nav>
    </div>
</div>
<% if (user.getRoleId() == 4) { %>
<ul id="dropdown1" class="dropdown-content">
    <li><a href="halamanRequest.jsp" class="red-text text-accent-2">Status Transaksi</a></li>
    <li><a href="editStock.jsp" class="red-text text-accent-2">Edit Profile</a></li>
</ul>

<%} else { %>
<ul id="dropdown1" class="dropdown-content">
    <li><a href="halamanRequest.jsp" class="red-text text-accent-2">Status Transaksi</a></li>
    <li><a href="editStock.jsp" class="red-text text-accent-2">Edit Profile</a></li>
</ul>
<% }%>

<script>
    document.addEventListener("DOMContentLoaded", function () {
        const drop = document.querySelectorAll(".dropdown-trigger");
        M.Dropdown.init(drop, {
            coverTrigger: false
        });
    });
</script>
