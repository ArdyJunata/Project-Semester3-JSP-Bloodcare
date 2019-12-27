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
            <form action="masuk.jsp" class="col s12">
                <div class="row">
                    <div class="input-field col s12">
                        <input placeholder="masukkan nama penerima darah" id="nama" type="text" class="validate">
                        <label for="nama">Nama Penerima Darah</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <input placeholder="masukkan email anda" id="email" type="email" class="validate">
                        <label for="email">Email</label>
                    </div>
                    <div class="input-field col s6">
                        <input id="alamat" placeholder="masukkan lokasi Penerima Saat Ini" type="text" class="validate">
                        <label for="alamat">Alamat</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s4">
                        <select>
                            <option value="" disabled selected>pilih</option>
                            <option value="A">A</option>
                            <option value="B">B</option>
                            <option value="AB">AB</option>
                            <option value="O">O</option>
                        </select>
                        <label>Golongan Darah</label>
                    </div>
                    <div class="input-field col s4">
                        <select>
                            <option value="" disabled selected>pilih</option>
                            <option value="positif">(+) Positif</option>
                            <option value="negatif">(-) Negatif</option>
                        </select>
                        <label>Faktor Resus(Rh)</label>
                    </div>
                    <div class="input-field col s4">
                        <input id="alamat" placeholder="masukkan jumlah kantong darah" type="number" class="validate">
                        <label>Jumlah Kantong</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12"">
                        <textarea id="textarea1" class="materialize-textarea"></textarea>
                        <label for="textarea1">Keterangan penerima</label>
                    </div>
                </div>
        </div>
    </div>
    <div class="modal-footer">
        <button class="btn waves-effect waves-ligh modal-closet btn-join red lighten-1" type="submit" name="action">Kirim
            <i class="material-icons right">send</i>
        </button>
    </form>
    </div>
</div>
