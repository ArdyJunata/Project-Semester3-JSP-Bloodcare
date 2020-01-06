<%-- 
    Document   : adminIndex
    Created on : Jan 5, 2020, 4:20:25 AM
    Author     : ardyj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/headerAdmin.jsp" %>
<%@include file="templates/sidebar.jsp" %>
<%@page import="helper.*"%>
<%@page import="model.*"%>
<%
    int admin = UserHome.countUser(1);
    int pendonor = UserHome.countUser(2);
    int rs = UserHome.countUser(3);
    int utd = UserHome.countUser(4);
%>

<!-- Content Wrapper -->
<div id="content-wrapper" class="d-flex flex-column">

    <!-- Main Content -->
    <div id="content" style="margin-top:60px;">
        <!-- Begin Page Content -->
        <div class="container-fluid">

            <!-- Page Heading -->
            <h1 class="h3 mb-4 text-gray-800">Dashboard Page</h1>
            <div class="row">
                <div class="col-md-2 text-center">
                    <div class="card border-primary mb-3" style="max-width: 13rem;">
                        <div class="card-header">Pendonor</div>
                        <div class="card-body text-primary">
                            <h5 class="card-title" style="font-size: 40px;"><%=pendonor%> User</h5>
                        </div>
                    </div>
                </div>
                <div class="col-md-2 text-center">
                    <div class="card border-success mb-3" style="max-width: 13rem;">
                        <div class="card-header">Rumah Sakit</div>
                        <div class="card-body text-success">
                            <h5 class="card-title" style="font-size: 40px;"><%=rs%> User</h5>
                        </div>
                    </div>
                </div>
                <div class="col-md-2 text-center">
                    <div class="card border-warning mb-3" style="max-width: 13rem;">
                        <div class="card-header">UTD</div>
                        <div class="card-body text-warning">
                            <h5 class="card-title" style="font-size: 40px;"><%=utd%> User</h5>
                        </div>
                    </div>
                </div>
                <div class="col-md-2 text-center">
                    <div class="card border-danger mb-3" style="max-width: 13rem;">
                        <div class="card-header">Admin</div>
                        <div class="card-body text-danger">
                            <h5 class="card-title" style="font-size: 40px;"><%=admin%> User</h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- End of Main Content -->

    <%@include file="templates/footerAdmin.jsp" %>