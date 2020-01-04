<%-- 
    Document   : stock
    Created on : Jan 4, 2020, 3:36:05 PM
    Author     : ardyj
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>
<%@include file="templates/navbarInstansi.jsp" %>
<%@page import="helper.*"%>
<%@page import="model.*"%>
<%
    String email = user.getEmail();
    int qty = user.getStok();
    ArrayList<Restok> listMinta = RestokHome.selectRequestan(email);
    ArrayList<Restok> list = RestokHome.selectMinta(email);

%>


<div class="section" style="margin-top: 36px;">
    <div class="red lighten-1">
        <div class="container" style="height: 100%">
            <div class="row">
                <div class="col s6">
                    <h4 class="white-text center-align">Perequest Kantung Darah</h4>
                    <ul class="collapsible collection">
                        <%                            for (int i = 0; i < listMinta.size(); i++) {
                                listMinta.get(i);

                        %>
                        <li>
                            <div class="collapsible-header">
                                <i class="material-icons">refresh</i>
                                <span><%= listMinta.get(i).getNama()%></span>
                            </div>
                            <div class="collapsible-body white">
                                <table>
                                    <tr>
                                        <td>Nama Instansi </td>
                                        <td>:</td>
                                        <td><%= listMinta.get(i).getNama()%></td>
                                    </tr>
                                    <tr>
                                        <td>Jumlah Kantung </td>
                                        <td>:</td>
                                        <td><%= listMinta.get(i).getQty()%></td>
                                    </tr>
                                    <tr>
                                        <td>Tanggal Request</td>
                                        <td>:</td>
                                        <td><%= listMinta.get(i).getTanggal()%></td>
                                    </tr>
                                    <tr>
                                        <td>Status</td>
                                        <td>:</td>
                                        <td><%= listMinta.get(i).getStatus()%></td>
                                    </tr>
                                </table><br>
                                <%
                                    int stok = RestokHome.getStokById(listMinta.get(i).getPerequest());
                                    if (listMinta.get(i).getStatus().equals("diterima") || listMinta.get(i).getStatus().equals("ditolak")) {
                                %>
                                <% } else {%>
                                <a href="stokController?aksi=terima&id=<%= listMinta.get(i).getId()%>&pemberi=<%= listMinta.get(i).getPemberi() %>&stok=<%= qty - listMinta.get(i).getQty() %>&qty=<%= listMinta.get(i).getQty() + stok%>&perequest=<%= listMinta.get(i).getPerequest() %>" class="btn red lighten-1 btn-join">Terima</a>
                                <a href="stokController?aksi=tolak&id=<%= listMinta.get(i).getId()%>&qty=<%=qty%>" class="btn white btn-join" style="color: #ef5350">Tolak</a>
                                <% } %>
                            </div>
                        </li>
                        <% }%>
                    </ul>
                </div>
                <div class="col s6">
                    <h4 class="white-text center-align">Permintaan Kantung Darah</h4>
                    <ul class="collapsible collection">
                        <%
                            for (int i = 0; i < list.size(); i++) {
                                list.get(i);

                        %>
                        <li>
                            <div class="collapsible-header">
                                <i class="material-icons">refresh</i>
                                <span><%= list.get(i).getNama()%></span>
                            </div>
                            <div class="collapsible-body white">
                                <table>
                                    <tr>
                                        <td>Nama Instansi </td>
                                        <td>:</td>
                                        <td><%= list.get(i).getNama()%></td>
                                    </tr>
                                    <tr>
                                        <td>Jumlah Kantung </td>
                                        <td>:</td>
                                        <td><%= list.get(i).getQty()%></td>
                                    </tr>
                                    <tr>
                                        <td>Tanggal Request</td>
                                        <td>:</td>
                                        <td><%= list.get(i).getTanggal()%></td>
                                    </tr>
                                    <tr>
                                        <td>Status</td>
                                        <td>:</td>
                                        <td><%= list.get(i).getStatus()%></td>
                                    </tr>
                                </table><br>
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
