<%-- 
    Document   : adminPengguna
    Created on : Jan 5, 2020, 9:56:57 AM
    Author     : ardyj
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/headerAdmin.jsp" %>
<%@include file="templates/sidebar.jsp" %>
<%@page import="helper.*"%>
<%@page import="model.*"%>
<%

    ArrayList<User> list = UserHome.getUserByRole(2);
    String pesan = (String) request.getAttribute("pesan");

%>

<!-- Content Wrapper -->
<div id="content-wrapper" class="d-flex flex-column">

    <!-- Main Content -->
    <div id="content" style="margin-top:60px;">
        <!-- Begin Page Content -->
        <div class="container-fluid">

            <!-- Page Heading -->
            
            <h1 class="h3 mb-4 text-gray-800">Akun Pengguna</h1>
            <%                
                if (pesan != null) {
                    if (pesan.equals("berhasil")) {
            %>
            <div class="alert alert-success" role="alert">
                Aksi Berhasil!
            </div>
            <% } else if (pesan.equals("gagal")) { %>
            <div class="alert alert-danger" role="alert">
                Aksi Gagal!
            </div>
            <% }
                } %>
            <button type="button" class="btn btn-primary" style="margin-bottom: 20px;" data-toggle="modal" data-target="#exampleModal">
               Tambah Pengguna
            </button>

            <%@include file="templates/modalTambahPengguna.jsp" %>
            <input type="hidden" name="role" value="2">
            <input type="hidden" name="halaman" value="adminPengguna.jsp">
            <button type="submit" class="btn btn-primary">Simpan</button>
            </form>
        </div>
    </div>
</div>
</div>

<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Nama</th>
            <th scope="col">Email</th>
            <th scope="col">Password</th>
            <th scope="col">Tanggal Lahir</th>
            <th scope="col">Jenis Kelamin</th>
            <th scope="col">Aksi</th>
        </tr>
    </thead>
    <%                    for (int i = 0; i < list.size(); i++) {
            list.get(i);
    %>
    <tbody>
        <tr>
            <th scope="row"><%= i + 1%></th>
            <td><%= list.get(i).getNama()%></td>
            <td><%= list.get(i).getEmail()%></td>
            <td><%= list.get(i).getPassword()%></td>
            <td><%= list.get(i).getTanggal()%></td>
            <td><%= list.get(i).getJenisKelamin()%></td>
            <td><a href="adminEdit.jsp?email=<%= list.get(i).getEmail()%>" class="btn btn-primary btn-sm text-white">edit</a> 
                <a href="userController?aksi=hapus&halaman=adminPengguna.jsp&email=<%= list.get(i).getEmail()%>" class="btn btn-danger btn-sm text-white">hapus</a> 
            </td>
        </tr>
    </tbody>
    <% }%>
</table>

</div>
<!-- /.container-fluid -->

</div>



<%@include file="templates/footerAdmin.jsp" %>
