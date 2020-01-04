<%-- 
    Document   : editProfile
    Created on : Dec 26, 2019, 11:46:48 PM
    Author     : ardyj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>
<%@include file="templates/navbarInstansi.jsp" %>
<%
    String email = user.getEmail();
    UserHome home = new UserHome();
    User users = home.getUserByEmail(email);
    nama = users.getNama();
    email = users.getEmail();
    String jenis = users.getJenisKelamin();
    String tanggal = users.getTanggal();
    int berat = users.getBeratBadan();
    int stock = users.getStok();
    session.setAttribute("dataUser", users);
%>

<div class="section" style="margin-top: 60px;">
    <div class="white">
        <div class="container" style="height: 100%">
            <div class="row center-align">
                <h4>Edit Profile</h4>
                Update selalu stock kantung darah pada bank darah  
            </div>
            <div class="row">
                <div class="col s3">
                </div>
                <form action="editProfileController" method="post" class="col s6">
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="nama" name="nama" value="<%=nama%>" type="text" class="validate">
                            <label for="nama">Nama Instansi</label>
                        </div>
                        <div class="input-field">
                            <input id="email" name="email" value="<%=email%>" type="hidden" class="validate">
                            <input id="tanggal" name="tanggal" value="null" type="hidden" class="validate">
                            <input id="kelamin" name="kelamin" value="null" type="hidden" class="validate">
                            <input id="berat" name="berat" value="0" type="hidden" class="validate">
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="stok" name="stok" type="number" value="<%=stock%>"  class="validate">
                            <label for="stok">Stock Darah</label>
                            <span class="helper-text">satuan per kantung</span>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col s12 center-align">
                            <button class="btn red lighten-1 btn-join">edit profile</button>
                            <br><br>
                        </div>
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

    document.addEventListener("DOMContentLoaded", function () {
        const date = document.querySelectorAll(".datepicker");
        M.Datepicker.init(date, {
            format: 'yyyy-mm-dd'
        });
    });

    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("select");
        M.FormSelect.init(box, {});
    });


</script>
<%@include file="templates/footer.jsp" %>
