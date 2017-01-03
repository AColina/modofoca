package recovery;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Controlador_mail extends Thread{
    
  private final String Para;
  private final String A;
  private final String M;
  private final String mail="modofoca.server@gmail.com";
  private final Controlador_recovery cr;
  
  public Controlador_mail(String a, String asunto, String mensaje,Controlador_recovery cr)  {
    this.Para = a;
    this.A = asunto;
    this.M = mensaje;
    this.cr=cr;
  }
  
  @Override
  public void run()
  {
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");
    
    Session session = Session.getDefaultInstance(props, new Authenticator()
    {
      @Override
      protected PasswordAuthentication getPasswordAuthentication()
      {
        return new PasswordAuthentication(mail, "[0%7a$3%a");
      }
    });
    session.setDebug(true);
    try
    {
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress(mail, "ModoFoca"));
      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.Para));
      

      message.setSubject(this.A);
      message.setText(this.M);
      Transport.send(message);
      this.cr.envio(true);
      
    }
    catch (MessagingException |UnsupportedEncodingException e) {
      this.cr.envio(false);
      JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error, Porfavor contacte al \nadministrador del Sistema COD:EC001", "Contacto", 0);
      throw new RuntimeException(e);
    }
  }
}
