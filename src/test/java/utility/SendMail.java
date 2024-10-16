package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class SendMail {
	
	 public void sendmail(boolean featureFailed) throws Exception {
	String path =System.getProperty("user.dir")+"//xls//Intervation.xlsx";

String report = System.getProperty("user.dir")+"//test output//PdfReport//ExtentPdf.pdf";

	ExcelReader reader = new ExcelReader();
	List<Map<String,String>>testData = reader.getData(path, "SendMail");
	
	final String user1 = "xss.be";
	final String user = "Automation@xss.be";
    final String password = "Z1eygaqzStPigwPN";
    final String toGroup = testData.get(0).get("Send_Mail");	
    		
    //============= Get the session object
    Properties props = new Properties();
    props.put("mail.smtp.host", "mail.smtp2go.com");
    props.put("mail.smtp.port", "2525");
    props.put("mail.smtp.socketFactory.port", "2525");				
    
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "false");
    //=============
    Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(user1, password);
        }
    });
    
    
    try{
    Date dt = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate= formatter.format(dt);  
    // Compose the message
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(user));
        message.addRecipients(Message.RecipientType.TO, toGroup);
        String TodaysDate = new SimpleDateFormat("dd-MM-yyyy hh:ss:mm").format(new Date());
        message.setSubject("Automation Execution Report of Bidding " +dt);
    //  Subject line modification based on execution status
        if (featureFailed) {
            message.setSubject("Failed Automation Execution Report of Intervention " + strDate);
        } else {
            message.setSubject("Passed Automation Execution Report of Intervention " + strDate);
        }

        BodyPart messageBodyPart1 = new MimeBodyPart();	
        messageBodyPart1.setText("Hello, Good day! \n"
    			+ "\n"
    			+ "Scenarios have been executed. Please find the attached report of the execution.  \n"
    			+ "\n"
    			+ "Thanks,\n"
    			+ "Automation Team.");	 
        Multipart multipart1 = new MimeMultipart();
    	multipart1.addBodyPart(messageBodyPart1);
       
        File file2 = new File(report);
    	messageBodyPart1 = new MimeBodyPart();
    	DataSource source = new FileDataSource(file2.getAbsolutePath());
        messageBodyPart1.setDataHandler(new DataHandler(source));
        messageBodyPart1.setFileName("Report_"+dt+".pdf");
        multipart1.addBodyPart(messageBodyPart1);
        message.setContent(multipart1);
        Transport trans = session.getTransport("smtp");
       //trans.send(message);

    } catch (MessagingException e) {
        e.printStackTrace();
    }
}
}

