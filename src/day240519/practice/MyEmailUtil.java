package day240519.practice;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.util.Properties;

public class MyEmailUtil {
    // 1. state (filed、variable)
    private static final String FROM = "1925918787@qq.com";
    private static final String SECRET_TOKEN = "hywfeosldxficjgd"; // 找 QQ 邮箱申请

    // 2. behavior (method、function)
    public static void send(String name, String email, String content) throws Exception {
        System.out.println("已经成功把【"+content+"】发给了【" + name + " <" + email+">");
        // 真正的发
        // 第三方
        send(email, content);
    }

    public static void send(String email, String content)  throws Exception {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.qq.com");
        prop.put("mail.smtp.port", "587");

        // https://wx.mail.qq.com/list/readtemplate?name=app_intro.html#/agreement/authorizationCode
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, SECRET_TOKEN);
            }
        });

        Message message = new MimeMessage(session);
        // who you are
        message.setFrom(new InternetAddress(FROM));
        // send to ...
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));

        message.setSubject("来自Java的提醒");

        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(content, "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);

        System.out.println("邮件发送成功");
    }

    // 3. constructor
}
