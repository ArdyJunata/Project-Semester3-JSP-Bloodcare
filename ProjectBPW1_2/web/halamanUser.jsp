<%-- 
    Document   : halamanuser
    Created on : Dec 26, 2019, 8:51:17 AM
    Author     : ardyj
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>
<%@include file="templates/navbar.jsp" %>
<%@page import="helper.*"%>
<%@page import="model.*"%>
<%
    String email = user.getEmail();
    ArrayList<Postingan> list = PostinganHome.selectAllSelf(email);
    ArrayList<Pendonoran> list2 = PendonoranHome.selectAllSelf(email);
    

%>


<div class="section" style="margin-top: 36px;">
    <div class="red lighten-1">
        <div class="container" style="height: 100%">
            <div class="row">
                <div class="col s6">
                    <h4 class="white-text center-align">History Pendonoran</h4>

                    <ul class="collapsible collection">
                        <%                            
                            for (int i = 0; i < list2.size(); i++) {
                            list2.get(i);
                        %>
                        <li>
                            <div class="collapsible-header">
                                <i class="material-icons">refresh</i>
                                <span>Donor <%= list2.get(i).getJenis() %> - <%= list2.get(i).getTanggal() %></span>
                            </div>
                            <div class="collapsible-body white">
                                <table>
                                    <tr>
                                        <td>Status</td>
                                        <td>:</td>
                                        <td><%= list2.get(i).getStatus() %></td>
                                    </tr>                               
                                </table><br>
                                <a href="postinganController?aksi=hapus&id=<%= list.get(i).getId()%>" class="btn teal accent-4 white-text">Batalkan</a>
                            </div>
                        </li>
                        <% } %>
                    </ul>
                </div>
                <div class="col s6">
                    <h4 class="white-text center-align">Permintaan Darah</h4>
                    <ul class="collapsible collection">
                        <%
                            for (int i = 0; i < list.size(); i++) {
                                list.get(i);
                        %>
                        <li>
                            <div class="collapsible-header">
                                <i class="material-icons">refresh</i>
                                <span><%= list.get(i).getNamaPenerima()%></span>
                            </div>
                            <div class="collapsible-body white">
                                <table>
                                    <tr>
                                        <td>Nama Penerima</td>
                                        <td>:</td>
                                        <td><%= list.get(i).getNamaPenerima()%></td>
                                    </tr>
                                    <tr>
                                        <td>No Handphone</td>
                                        <td>:</td>
                                        <td><%= list.get(i).getNoHp()%></td>
                                    </tr>
                                    <tr>
                                        <td>Alamat Penerima Darah</td>
                                        <td>:</td>
                                        <td> <%= list.get(i).getAlamat()%></td>
                                    </tr>
                                    <tr>
                                        <td>Golongan Darah</td>
                                        <td>:</td>
                                        <td><%= list.get(i).getGoldar()%><%= list.get(i).getRh()%></td>
                                    </tr>
                                    <tr>
                                        <td>Jumlah Kantong Darah</td>
                                        <td>:</td>
                                        <td><%= list.get(i).getJmlKantung()%> Kantong Dibutuhkan</td>
                                    </tr>
                                    <tr>
                                        <td>Keterangan</td>
                                        <td>:</td>
                                        <td><%= list.get(i).getKeterangan()%></td>
                                    </tr>                                        
                                    <tr>
                                        <td>Status</td>
                                        <td>:</td>
                                        <td><%= list.get(i).getStatus()%></td>
                                    </tr>                                        
                                </table><br>
                                <a href="postinganController?aksi=hapus&id=<%= list.get(i).getId()%>" class="btn teal accent-4 white-text">Hapus Postingan</a>
                            </div>
                        </li>
                        <% }%>
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
