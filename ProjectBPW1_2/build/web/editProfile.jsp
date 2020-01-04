<%-- 
    Document   : editProfile
    Created on : Dec 26, 2019, 11:46:48 PM
    Author     : ardyj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>
<%@include file="templates/navbar.jsp" %>
<%
    String email = user.getEmail();
    UserHome home = new UserHome();
    User users = home.getUserByEmail(email);
    nama = users.getNama();
    email = users.getEmail();
    String jenis = users.getJenisKelamin();
    String tanggal = users.getTanggal();
    int berat = users.getBeratBadan();
    session.setAttribute("dataUser", users);
%>

<div class="section" style="margin-top: 60px;">
    <div class="white">
        <div class="container" style="height: 100%">
            <div class="row center-align">
                <h4>Edit Profile</h4>
                Tambahkan informasi tentang diri anda di profilmu   
            </div>
            <div class="row">
                <div class="col s2">
                </div>
                <form action="editProfileController" method="post" class="col s8">
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="nama" name="nama" value="<%=nama%>" type="text" class="validate">
                            <label for="nama">Nama Anda</label>
                        </div>
                        <div class="input-field col s6">
                            <% if (jenis.equals("Laki-laki")) {%>
                            <select name="kelamin">
                                <option value="<%=jenis%>">Laki-laki</option>
                                <option value="Perempuan">Perempuan</option>
                            </select>
                            <%} else {%>
                            <select name="kelamin">
                                <option value="<%=jenis%>">Perempuan</option>
                                <option value="Laki-laki">Laki-laki</option>
                            </select>
                            <% }%>
                            <label>Jenis Kelamin</label>
                        </div>
                        <div class="input-field">
                            <input id="email" name="email" value="<%=email%>" type="hidden" class="validate">
                            <input id="stok" name="stok" value="-1" type="hidden" class="validate">
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="tanggal" name="tanggal" type="text" value="<%=tanggal%>" class="validate datepicker">
                            <label for="tanggal">Tanggal Lahir</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="berat" name="berat" type="number" value="<%=berat%>"  class="validate">
                            <label for="berat">Berat Badan</label>
                            <span class="helper-text">satuan kg (kilogram)</span>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col s12 center-align">
                            <button class="btn red lighten-1 btn-join">edit profile</button>
                            <br><br>
                            <a href="editEmail.jsp">Ubah Alamat Email</a>
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
