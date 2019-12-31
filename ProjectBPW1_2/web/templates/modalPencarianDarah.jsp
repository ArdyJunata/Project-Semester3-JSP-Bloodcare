<%-- 
    Document   : modalPencarianDarah
    Created on : Dec 24, 2019, 5:07:40 PM
    Author     : ardyj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Modal Structure -->
<div id="cari" class="modal modal-fixed-footer">
    <div class="modal-content">
        <h4>Form Pencarian Darah</h4>
        <div class="row">
            <form action="postinganController" class="col s12" method="post">
                <div class="row">
                    <div class="input-field col s12">
                        <input placeholder="masukkan nama penerima darah" id="nama" name="nama" type="text" class="validate">
                        <label for="nama">Nama Penerima Darah</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <input placeholder="masukkan nomor hp anda" id="nohp" name="hp" type="text" class="validate">
                        <label for="nohp">No Hanphone</label>
                    </div>
                    <div class="input-field col s6">
                        <input id="alamat" name="alamat" placeholder="masukkan lokasi Penerima Saat Ini" type="text" class="validate">
                        <label for="alamat">Alamat</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s4">
                        <select name="goldar">
                            <option value="" disabled selected>pilih</option>
                            <option value="A">A</option>
                            <option value="B">B</option>
                            <option value="AB">AB</option>
                            <option value="O">O</option>
                        </select>
                        <label>Golongan Darah</label>
                    </div>
                    <div class="input-field col s4">
                        <select name="rh">
                            <option value="" disabled selected>pilih</option>
                            <option value="+">(+) Positif</option>
                            <option value="-">(-) Negatif</option>
                        </select>
                        <label>Faktor Resus(Rh)</label>
                    </div>
                    <div class="input-field col s4">
                        <input id="jml" name="kantung" placeholder="masukkan jumlah kantong darah" type="number" class="validate">
                        <label>Jumlah Kantong</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12"">
                        <textarea id="textarea1" name="keterangan" class="materialize-textarea"></textarea>
                        <label for="textarea1">Keterangan penerima</label>
                    </div>
                </div>
        </div>
    </div>
    <div class="modal-footer">
        <button class="btn waves-effect waves-ligh modal-closet btn-join red lighten-1" type="submit" name="action">Kirim
            <i class="material-icons right">send</i>
        </button>
   
