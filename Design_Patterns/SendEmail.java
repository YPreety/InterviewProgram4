package Design_Patterns;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {
		// email ID of Recipient.
		String recipient = "preety.bit36@gmail.com";

		// email ID of Sender.
		String sender = "preety.bit36@gmail.com";

		// using host as localhost
		String host = "74.125.24.109";

		// Getting system properties
		Properties properties = System.getProperties();

		// Setting up mail server
		properties.setProperty("mail.smtp.host", host);
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.stmp.user", "preety.bit36@gmail.com");
		properties.setProperty("mail.smtp.password", "nikitayadav");

		// creating session object to get properties
		Authenticator auth = new SmtpAuthenticator();
		Session session = Session.getDefaultInstance(properties, auth);

		try {
			// MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From Field: adding senders email to from field.
			message.setFrom(new InternetAddress(sender));

			// Set To Field: adding recipient's email to from field.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

			// Set Subject: subject of the email
			message.setSubject("This is Suject");

			// set body of the email.
			message.setText("This is a test mail");

			// set body of the email.
			message.setContent("<h1>This is a HTML text</h1>", "text/html");

			// Send email.
			Transport.send(message);
			System.out.println("Mail successfully sent");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}

	}

	public PasswordAuthentication getPasswordAuthentication() {
		String username = "preety.bit36@gmail.com";
		String password = "nikitayadav";
		if ((username != null) && (username.length() > 0) && (password != null) && (password.length() > 0)) {

			return new PasswordAuthentication(username, password);
		}

		return null;
	}

}

class SmtpAuthenticator extends Authenticator {
	public SmtpAuthenticator() {

		super();
	}
}
