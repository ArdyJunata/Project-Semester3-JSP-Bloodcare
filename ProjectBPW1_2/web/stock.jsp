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

%>


<div class="section" style="margin-top: 36px;">
    <div class="red lighten-1">
        <div class="container" style="height: 100%">
            <div class="row">
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
                                </table>
                                <% if(role == 3) {%>
                                <br>
                                <a href="" class="btn red lighten-1 btn-join">Batalkan</a>
                                <% } %>
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
                                </table>
                                <% if(role == 3) {%>
                                <br>
                                <a href="" class="btn red lighten-1 btn-join">Batalkan</a>
                                <% } %>
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
