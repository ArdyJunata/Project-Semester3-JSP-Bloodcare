package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import helper.*;
import model.*;

public class SendMail extends HttpServlet {

    String nama, subject, email, mag, tgl;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        nama = request.getParameter("nama");
        subject = "Donor Darah Rutin";
        email = request.getParameter("email");
        tgl = dtf.format(now);
        mag = "Hai " + nama + ", \nSilahkan melakukan pendonoran darah rutin pada tanggal " + tgl + " dan lakukan pendonoran rutin setiap 2 bulan sekali";

        final String username = "ardy18ti@mahasiswa.pcr.ac.id";
        final String password = "NATAardyjunata12";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password); //To change body of generated methods, choose Tools | Templates.
            }
        });

        PendonoranHome home = new PendonoranHome();
        TransaksiHome trans = new TransaksiHome();
        Pendonoran donor = new Pendonoran();
        RequestDispatcher control = null;
        String jenis = home.selectRutin(email);
        if (jenis != null) {
            control = request.getRequestDispatcher("/gagalRutin.jsp");
            control.forward(request, response);
        } else if (jenis == null) {
            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(email));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
                MimeBodyPart textPart = new MimeBodyPart();
                Multipart multipart = new MimeMultipart();
                String final_text = mag;
                textPart.setText(final_text);
                message.setSubject(subject);
                multipart.addBodyPart(textPart);
                message.setContent(multipart);
                message.setSubject("Donor Darah Rutin BloodCare");
                Transport.send(message);

                

                donor.setJenis("rutin");
                donor.setUserId(email);
                if (home.insertDonorRutin(donor) == true) {
                    control = request.getRequestDispatcher("/transaksiController?aksi=rutin");
                    control.forward(request, response);
                }

            } catch (Exception ex) {
                out.println(ex);
            }
        } else {
            System.out.println("gagal");
        }

    }

}
