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
    int role = user.getRoleId();
    ArrayList<User> listRs = UserHome.selectStockOther(email, 3);
    ArrayList<User> listUtd = UserHome.selectStockOther(email, 4);
    try {
        String pesan = (String) request.getAttribute("pesan");
        if (pesan.equals("tidak cukup")) {
%>
<script>
    alert('Stok Tidak Cukup');
</script>
<%
        }
    } catch (NullPointerException ex) {
        System.out.println("Error");
    } finally {
        System.out.println("error");
    }
%>


<div class="section" style="margin-top: 36px;">
    <div class="red lighten-1">
        <div class="container" style="height: 100%">
            <div class="row">
                <h2 class="center-align white-text">Halaman Perequestan dan Stock Darah </h2>
                <hr>
                <div class="col s6">
                    <h4 class="white-text center-align">Stock Rumah Sakit</h4>
                    <ul class="collapsible collection">
                        <%                            for (int i = 0; i < listRs.size(); i++) {
                                listRs.get(i);
                        %>
                        <li>
                            <div class="collapsible-header">
                                <i class="material-icons">refresh</i>
                                <span><%= listRs.get(i).getNama()%></span>
                            </div>
                            <div class="collapsible-body white">
                                <table>
                                    <tr>
                                        <td>Stok </td>
                                        <td>:</td>
                                        <td><%= listRs.get(i).getStok()%></td>
                                    </tr>
                                    <tr>
                                        <td>Qty Request </td>
                                        <td>:</td>
                                        <td>
                                            <form action="stokController" method="get">
                                                <div class="input-field col s12">
                                                    <input name="aksi" type="hidden" value="insert" class="validate">
                                                    <input name="perequest" type="hidden" value="<%=email%>" class="validate">
                                                    <input name="pemberi" type="hidden" value="<%= listRs.get(i).getEmail()%>" class="validate">
                                                    <input name="stok" type="hidden" value="<%= listRs.get(i).getStok()%>" class="validate">
                                                    <input min="1" id="qty" name="qty" type="number" class="validate">
                                                    <label for="qty">kantong darah</label>
                                                    <span class="helper-text">isi jika anda ingin request kantong darah</span>
                                                </div>
                                        </td>
                                    </tr>
                                </table>
                                <% if (role == 3) {%>
                                <br>
                                <button class="btn red lighten-1 btn-join">Request</button>
                                <% } %>
                                </form>
                            </div>
                        </li>
                        <% } %>
                    </ul>
                </div>
                <div class="col s6">
                    <h4 class="white-text center-align">Stock UTD PMI</h4>
                    <ul class="collapsible collection">
                        <%
                            for (int i = 0; i < listUtd.size(); i++) {
                                listUtd.get(i);
                        %>
                        <li>
                            <div class="collapsible-header">
                                <i class="material-icons">refresh</i>
                                <span><%= listUtd.get(i).getNama()%></span>
                            </div>
                            <div class="collapsible-body white">
                                <table>
                                    <tr>
                                        <td>Stok </td>
                                        <td>:</td>
                                        <td><%= listUtd.get(i).getStok()%></td>
                                    </tr>
                                    <tr>
                                        <td>Qty Request </td>
                                        <td>:</td>
                                        <td>
                                            <form action="stokController" method="get">
                                                <div class="input-field col s12">
                                                    <input name="aksi" type="hidden" value="insert" class="validate">
                                                    <input name="perequest" type="hidden" value="<%=email%>" class="validate">
                                                    <input name="pemberi" type="hidden" value="<%= listUtd.get(i).getEmail()%>" class="validate">
                                                    <input name="stok" type="hidden" value="<%= listUtd.get(i).getStok()%>" class="validate">
                                                    <input id="qty" name="qty" type="number" class="validate">
                                                    <label for="qty">kantong darah</label>
                                                    <span class="helper-text">isi jika anda ingin request kantong darah</span>
                                                </div>
                                        </td>
                                    </tr>
                                </table>
                                <% if (role == 3) {%>
                                <br>
                                <button class="btn red lighten-1 btn-join">Request</button>
                                <% } %>
                                </form>
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
