<%-- 
    Document   : masuk
    Created on : Nov 11, 2019, 10:44:24 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>

<div class="section bg">
    <div class="container">
        <div class="row">
            <div class="col m6 offset-m3">
                <form action="index.jsp" class="masuk-container center-align z-depth-3">
                    <h4>Masuk</h4>
                    <div class="row">
                        <div class="col m4">
                            <img src="img/user.png" width="160">
                        </div>
                        <div class="col m8">
                            <div class="input-field col s12 ">
                                <i class="material-icons prefix">email</i>
                                <input value="" name="email" type="text" class="validate">
                                <label class="active" for="first_name2">Email</label>
                            </div>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">vpn_key</i>
                                <input value="" name="katasandi" type="text" class="validate">
                                <label class="active" for="first_name2">Kata Sandi</label>
                            </div>
                            <button class="btn red lighten-1">Masuk</button>
                        </div>
                    </div>
                    <br>
                    <p>belum menjadi anggota ? Klik <a href="daftar.jsp">Daftar</a></p>
                </form>
            </div>
        </div>
    </div>
</div>
</div>

<%@include file="templates/footer.jsp" %>
