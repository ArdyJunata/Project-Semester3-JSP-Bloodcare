<%-- 
    Document   : masuk
    Created on : Nov 11, 2019, 10:44:24 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>
<%
    String pesan = (String) request.getAttribute("duplikatEmail");
    boolean cek = false;
    if (pesan == null) {
        cek = false;
    } else {
        cek = true;
    }


%>
<div class="section bg">
    <div class="container">
        <div class="row">
            <div class="col m6 offset-m3">
                <form action="loginController" method="post" class="masuk-container z-depth-3">
                    <h4 class="center-align">Masuk</h4>
                    <div class="row">
                        <div class="col m4">
                            <img src="img/user.png" width="160">
                        </div>
                        <div class="col m8">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">email</i>
                                <input id="email" name="email" type="email" class="validate">
                                <label for="email">Email</label>
                                <% if (cek == true) {%>
                                <span class="helper-text align-left red-text"><%=pesan%></span>
                                <% } else {%>
                                <% }%>
                            </div>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">vpn_key</i>
                                <input id="katasandi" name="katasandi" type="password" class="validate">
                                <label for="katasandi">Kata Sandi</label>
                            </div>
                            <div class="row">
                            </div>
                            <div class="row">
                            </div>
                            <div class="row">
                            </div>
                        <button class="btn red lighten-1">Masuk</button>
                        </div>
                    </div>
                    <p class="center-align">belum menjadi anggota ? Klik <a href="daftar.jsp">Daftar</a></p>
                </form>
            </div>
        </div>
    </div>
</div>
</div>

<script>
    
    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("select");
        M.FormSelect.init(box, {});
    });
    
</script>


<%@include file="templates/footer.jsp" %>
