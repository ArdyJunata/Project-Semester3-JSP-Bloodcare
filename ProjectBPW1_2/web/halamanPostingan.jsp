<%-- 
    Document   : halamanPostingan
    Created on : Dec 26, 2019, 8:20:02 PM
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
    ArrayList<Postingan> list = PostinganHome.selectAllOther(email);

%>

<div class="section" style="margin-top: 36px;">
    <div class="red lighten-1">
        <div class="container" style="height: 100%">
            <div class="row">
                <h3 class="white-text center-align">Permintaan Darah</h3>
                <div class="row">
                    <%
                        for (int i = 0; i < list.size(); i++) {
                        list.get(i);
                     %>
                    <div class="col s6">
                        <div class="card white">
                            <div class="card-content">
                                <span class="card-title" style="font-weight: bold">
                                    <%= list.get(i).getNamaPenerima() %> - Golongan Darah <%= list.get(i).getGoldar() %><%= list.get(i).getRh() %>
                                </span>
                                <p>
                                    <%= list.get(i).getAlamat()%> - <%= list.get(i).getJmlKantung() %> Kantung Darah 
                                    <br><%= list.get(i).getKeterangan() %>
                                </p>
                            </div>
                            <div class="card-action">
                                <a href="#" class="red-text text-darken-1">Request</a>
                            </div>
                        </div>
                    </div>
                    <% } %>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="templates/footer.jsp" %>
