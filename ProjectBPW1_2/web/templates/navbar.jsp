<%-- 
    Document   : navbar
    Created on : Nov 11, 2019, 10:56:10 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="helper.*"%>
<%@page import="model.*"%>
<%
    boolean cekLogin = false;
    String nama = "none";
    User user = (User) session.getAttribute("dataUser");
    User cek = (User) session.getAttribute("index");
    User user1 = new User();
    try {

        if (cek.getCek() == 1) {
            UserHome home = new UserHome();
            user1 = home.getUserByEmail(user.getEmail());
            int role = user1.getRoleId();
            cekLogin = home.cekLogin(user,role);

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
                    <li><a href="index.jsp">Home</a></li>
                    <li><a class="modal-trigger" data-target="tentang">Tentang</a></li>
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

<ul id="dropdown1" class="dropdown-content">
    <li><a href="halamanUser.jsp" class="red-text text-accent-2">Status Transaksi</a></li>
    <li><a href="editProfile.jsp" class="red-text text-accent-2">Edit Profile</a></li>
</ul>

<%@include file="modalTentang.jsp" %>

<script>
    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("#tentang");
        M.Modal.init(box, {});
    });

    document.addEventListener("DOMContentLoaded", function () {
        const drop = document.querySelectorAll(".dropdown-trigger");
        M.Dropdown.init(drop, {
            coverTrigger: false
        });
    });
</script>