<%-- 
    Document   : index
    Created on : Nov 11, 2019, 10:06:57 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="helper.*"%>
<%@include file="templates/header.jsp" %>
<%@include file="templates/navbar.jsp" %>
<%

    String email = user.getEmail();

%>

<div class="section">
    <div class="red lighten-1">
        <div class="container"> 
            <br>
            <div class="col s2"></div>
            <div class="col s8">
                <div class="heading1 center-align">
                    <h2>5,2 JUTA KANTONG DARAH</h2>
                    <h2>DIBUTUHKAN INDONESIA SETIAP TAHUNNYA</h2>
                    <p>donor darah sekarang untuk selamatkan nyawa mereka  -   cari pendonor darah yang sesuai cepat dan tepat</p>
                    <a class="waves-effect white btn-large btn-home" href="halamanPostingan.jsp">Donor Darah</a>
                    <button class="waves-effect white btn-large btn-home modal-trigger" data-target="cari">Cari Pendonor</button>
                </div>
            </div>
        </div>
    </div>
</div>
<% if (cekLogin == false) { %>
<!--ABOUT-->
<div class="section about">
    <div class="container center-align">
        <h3>BERGABUNG DENGAN BLOODCARE</h3>
        <p>miliki akun bloodcare anda untuk membantu donor darah dan cari pendonor anda</p>
        <a href="daftar.jsp" class="waves-effect red lighten-1 btn-large btn-join">Daftar Akun</a>
    </div>
</div>
<% } else { %>

<!--Donor Rutin -->
<div class="section about">
    <div class="container center-align">
        <h3>DONOR DARAH RUTIN</h3>
        <p>donor darah rutin untuk menjaga kesehatan dan kebugaran tubuh anda</p>
        <button class="waves-effect red lighten-1 btn-large btn-join modal-trigger" data-target="rutin">Cari Pendonor</button>
    </div>
</div>
<% } %>

<!--siapa saja-->
<div class="section candon red lighten-1">
    <div class="container center-align">
        <h3>SIAPA YANG BISA DONOR DARAH ?</h3>
        <p>ketahui syarat dan ketentuan donor darah</p>
        <button class="waves-effect white btn-large btn-home modal-trigger" data-target="syarat">Pelajari Lebih Lanjut</button>
    </div>
</div>

<script>
    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("#cari");
        M.Modal.init(box, {});
    });

    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("#syarat");
        M.Modal.init(box, {});
    });
    
    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("#rutin");
        M.Modal.init(box, {});
    });

    document.addEventListener("DOMContentLoaded", function () {
        const box = document.querySelectorAll("select");
        M.FormSelect.init(box, {});
    });

</script>

<%@include file="templates/modalPencarianDarah.jsp" %>
            <input type="hidden" name="email" value="<%=email%>">
        </form>
    </div>
</div>
<%@include file="templates/modalDonorRutin.jsp" %>
                <input type="hidden" name="email" value="<%=email%>">
                <input type="hidden" name="nama" value="<%=nama%>">
                
            <button class="btn waves-effect waves-ligh modal-closet btn-join red lighten-1 modal-close" type="submit" name="action">ya</button>
        </form>
    </div>
</div>
<%@include file="templates/modalSyaratDonor.jsp" %>
<%@include file="templates/footer.jsp" %>