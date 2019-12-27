<%-- 
    Document   : editProfile
    Created on : Dec 26, 2019, 11:46:48 PM
    Author     : ardyj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>
<%@include file="templates/navbar.jsp" %>

<div class="section" style="margin-top: 60px;">
    <div class="white">
        <div class="container" style="height: 100%">
            <div class="row center-align">
                <h4>Edit Profile</h4>
                Tambahkan informasi tentang diri anda di profilmu   
            </div>
            <div class="row center-align">
                <img src="img/ardy.png" width="200" alt="" class="circle responsive-img">
            </div>
            <div class="row">
                <div class="col s2">
                </div>
                <form action="masuk.jsp" class="col s8">
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="nama" type="text" class="validate">
                            <label for="nama">Nama Anda</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="email" type="email" class="validate">
                            <label for="email">Email</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="alamat" type="text" class="validate">
                            <label for="alamat">Nomor Handphone</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <select>
                                <option value="" disabled selected>pilih</option>
                                <option value="A">A</option>
                                <option value="B">B</option>
                                <option value="AB">AB</option>
                                <option value="O">O</option>
                            </select>
                            <label>Golongan Darah</label>
                        </div>
                        <div class="input-field col s6">
                            <select>
                                <option value="" disabled selected>pilih</option>
                                <option value="positif">(+) Positif</option>
                                <option value="negatif">(-) Negatif</option>
                            </select>
                            <label>Faktor Resus(Rh)</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="tanggal" type="text" class="validate datepicker">
                            <label for="tanggal">Tanggal Lahir</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="berat" type="number" class="validate">
                            <label for="berat">Berat Badan</label>
                            <span class="helper-text" data-error="wrong" data-success="right">satuan kg (kilogram)</span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s12 center-align">
                            <button class="btn red lighten-1 btn-join">simpan</button>
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
        M.Datepicker.init(date, {});
    })


</script>
<%@include file="templates/footer.jsp" %>
