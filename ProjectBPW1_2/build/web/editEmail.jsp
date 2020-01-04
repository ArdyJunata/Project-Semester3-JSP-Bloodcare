<%-- 
    Document   : editEmail
    Created on : Jan 4, 2020, 12:32:16 PM
    Author     : ardyj
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp" %>
<%@include file="templates/navbar.jsp" %>
<%
    String email = user.getEmail();
    UserHome home = new UserHome();
    User users = home.getUserByEmail(email);
    email = users.getEmail();
%>

<div class="section" style="margin-top: 60px;">
    <div class="white">
        <div class="container" style="height: 100%">
            <div class="row center-align">
                <h4>Ubah Email</h4>
                Merubah email artinya merubah email pada saat login
            </div>
            <div class="row">
                <form action="editProfileController" method="get" class="col s12">
                    <div class="row">
                        <div class="input-field col s6 offset-s3 align-center">
                            <input id="newEmail" name="newEmail" value="<%=email%>" type="text" class="validate">
                            <input id="oldEmail" name="oldEmail" value="<%=email%>" type="hidden" class="validate">
                            <label for="newEmail">Email Anda</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s12 center-align">
                            <button class="btn red lighten-1 btn-join">Ubah Email</button>
                        </div>
                    </div>
            </div>
        </div>
    </div>
</div>
</div>

<script>

    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("select");
        M.FormSelect.init(box, {});
    });

    document.addEventListener("DOMContentLoaded", function () {
        const date = document.querySelectorAll(".datepicker");
        M.Datepicker.init(date, {
            format: 'yyyy-mm-dd'
        });
    });

    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("select");
        M.FormSelect.init(box, {});
    });


</script>
<%@include file="templates/footer.jsp" %>
