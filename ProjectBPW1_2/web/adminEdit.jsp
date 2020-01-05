<%-- 
    Document   : adminEdit
    Created on : Jan 5, 2020, 5:11:00 PM
    Author     : ardyj
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/headerAdmin.jsp" %>
<%@include file="templates/sidebar.jsp" %>
<%@page import="helper.*"%>
<%@page import="model.*"%>
<%
    String email = request.getParameter("email");
    UserHome home = new UserHome();
    User list = home.getUserByEmail(email);
    String nama = list.getNama();
    String password = list.getPassword();
    String tanggal = list.getTanggal();
    String jenis = list.getJenisKelamin();
    int role = list.getRoleId();
    int stok = list.getStok();

%>

<!-- Content Wrapper -->
<div id="content-wrapper" class="d-flex flex-column">

    <!-- Main Content -->
    <div id="content" style="margin-top:60px;">
        <!-- Begin Page Content -->
        <div class="container-fluid">
            <!-- Page Heading -->
            <h1 class="h3 mb-4 text-gray-800">Edit Pengguna</h1>
            <div class="row">
                <div class="col-sm-6">
                    <form action="userController" method="get">
                        <table class="table">
                            <% if (role == 2) {%>
                            <tr>
                                <td>Nama</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="nama" value="<%=nama%>"></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td>:</td>
                                <td><input class="form-control" type="Email" name="email" value="<%=email%>"></td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="password" value="<%=password%>"></td>
                            </tr>
                            <tr>
                                <td>Tanggal Lahir</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="tanggal" value="<%=tanggal%>"></td>
                            </tr>
                            <tr>
                                <td>Jenis Kelamin</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="jenis" value="<%=jenis%>"></td>
                            </tr>

                            <input type="hidden" name="stok" value="<%= stok %>">
                            <input type="hidden" name="role" value="<%= role %>">
                            <input type="hidden" name="halaman" value="adminPengguna.jsp">

                            <% } else if (role == 3 || role == 4) {%> 
                            <tr>
                                <td>Nama</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="nama" value="<%=nama%>"></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td>:</td>
                                <td><input class="form-control" type="Email" name="email" value="<%=email%>"></td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="password" value="<%=password%>"></td>
                            </tr>
                            <tr>
                                <td>Stok</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="stok" value="<%=stok%>"></td>
                            </tr>
                            
                            <input type="hidden" name="tanggal" value="<%= tanggal %>">
                            <input type="hidden" name="jenis" value="<%= jenis %>">
                            <input type="hidden" name="role" value="<%= role %>">
                            <% if(role == 3) {%>
                            <input type="hidden" name="halaman" value="adminRs.jsp">
                            <% } else {%>
                            <input type="hidden" name="halaman" value="adminUtd.jsp">
                            <% }%>
                            <% } else {%>
                            <tr>
                                <td>Nama</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="nama" value="<%=nama%>"></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td>:</td>
                                <td><input class="form-control" type="Email" name="email" value="<%=email%>"></td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td>:</td>
                                <td><input class="form-control" type="text" name="password" value="<%=password%>"></td>
                            </tr>
                            <% }%>
                            <tr>
                                <td></td>
                                <td></td>
                                <td><button type="submit" class="btn btn-primary">Simpan</button></td>
                            </tr>
                            <input type="hidden" name="tanggal" value="<%= tanggal %>">
                            <input type="hidden" name="jenis" value="<%= jenis %>">
                            <input type="hidden" name="role" value="<%= role %>">
                            <input type="hidden" name="stok" value="<%= stok %>">
                            <input type="hidden" name="halaman" value="adminAkun.jsp">
                        </table>
                        <input type="hidden" name="aksi" value="edit">
                    </form>
                </div>
            </div>


        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- End of Main Content -->

    <%@include file="templates/footerAdmin.jsp" %>
