<%-- 
    Document   : halamanuser
    Created on : Dec 26, 2019, 8:51:17 AM
    Author     : ardyj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>
<%@include file="templates/navbar.jsp" %>

<div class="section" style="margin-top: 36px;">
    <div class="red lighten-1">
        <div class="container" style="height: 100%">
            <div class="row">
                <div class="col s6">
                    <h4 class="white-text center-align">History Pendonoran</h4>
                    <ul class="collection">
                        <li class="collection-item avatar">
                            <i class="material-icons circle teal accent-4">remove</i>
                            <span class="title">Title</span>
                            <p>First Line <br>
                                Second Line
                            </p>
                            <a href="#!" class="secondary-content">ditolak</a>
                        </li>
                        <li class="collection-item avatar">
                            <i class="material-icons circle  teal accent-4">check</i>
                            <span class="title">Title</span>
                            <p>First Line <br>
                                Second Line
                            </p>
                            <a href="#!" class="secondary-content">selesai</a>
                        </li>
                        <li class="collection-item avatar">
                            <i class="material-icons circle  teal accent-4">check</i>
                            <span class="title">Title</span>
                            <p>First Line <br>
                                Second Line
                            </p>
                            <a href="#!" class="secondary-content">selesai</a>
                        </li>
                        <li class="collection-item avatar">
                            <i class="material-icons circle  teal accent-4">refresh</i>
                            <span class="title">Title</span>
                            <p>First Line <br>
                                Second Line
                            </p>
                            <a href="#!" class="secondary-content">proses</a>
                        </li>
                    </ul>
                </div>
                <div class="col s6">
                    <h4 class="white-text center-align">Permintaan Darah</h4>
                    <ul class="collapsible collection">
                        <li>
                            <div class="collapsible-header">
                                <i class="material-icons">refresh</i>
                                <span>Ardy Junata</span>
                            </div>
                            <div class="collapsible-body white">
                                    <table>
                                        <tr>
                                            <td>Nama Penerima</td>
                                            <td>:</td>
                                            <td>Ardy Junata</td>
                                        </tr>
                                        <tr>
                                            <td>Email</td>
                                            <td>:</td>
                                            <td>ardy18ti@mahasiswa.pcr.ac.id</td>
                                        </tr>
                                        <tr>
                                            <td>Alamat Penerima Darah</td>
                                            <td>:</td>
                                            <td>Rumah Sakit Awal Bros</td>
                                        </tr>
                                        <tr>
                                            <td>Golongan Darah</td>
                                            <td>:</td>
                                            <td>O+</td>
                                        </tr>
                                        <tr>
                                            <td>Jumlah Kantong Darah</td>
                                            <td>:</td>
                                            <td>4 Kantong Dibutuhkan</td>
                                        </tr>
                                        <tr>
                                            <td>Keterangan</td>
                                            <td>:</td>
                                            <td>kecelakaan</td>
                                        </tr>                                        
                                        <tr>
                                            <td>Status</td>
                                            <td>:</td>
                                            <td>menunggu</td>
                                        </tr>                                        
                                    </table><br>
                                <button class="btn teal accent-4 white-text">Hapus Postingan</button>
                            </div>
                        </li>
                    <ul class="collapsible collection">
                        <li>
                            <div class="collapsible-header">
                                <i class="material-icons">refresh</i>
                                <span>Jody Alief Prismart</span>
                            </div>
                            <div class="collapsible-body white">
                                    <table>
                                        <tr>
                                            <td>Nama Penerima</td>
                                            <td>:</td>
                                            <td>Ardy Junata</td>
                                        </tr>
                                        <tr>
                                            <td>Email</td>
                                            <td>:</td>
                                            <td>ardy18ti@mahasiswa.pcr.ac.id</td>
                                        </tr>
                                        <tr>
                                            <td>Alamat Penerima Darah</td>
                                            <td>:</td>
                                            <td>Rumah Sakit Awal Bros</td>
                                        </tr>
                                        <tr>
                                            <td>Golongan Darah</td>
                                            <td>:</td>
                                            <td>O+</td>
                                        </tr>
                                        <tr>
                                            <td>Jumlah Kantong Darah</td>
                                            <td>:</td>
                                            <td>4 Kantong Dibutuhkan</td>
                                        </tr>
                                        <tr>
                                            <td>Keterangan</td>
                                            <td>:</td>
                                            <td>kecelakaan</td>
                                        </tr>                                        
                                        <tr>
                                            <td>Status</td>
                                            <td>:</td>
                                            <td>menunggu</td>
                                        </tr>                                        
                                    </table><br>
                                <button class="btn teal accent-4 white-text">Hapus Postingan</button>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    document.addEventListener("DOMContentLoaded", function () {
        const collap = document.querySelectorAll(".collapsible");
        M.Collapsible.init(collap, {});
    });
    
</script>

<%@include file="templates/footer.jsp" %>
