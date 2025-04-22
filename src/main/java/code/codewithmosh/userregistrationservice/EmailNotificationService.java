package code.codewithmosh.userregistrationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("urs-EmailService")
public class EmailNotificationService implements NotificationService {

    @Value("${user.registration.service.mailserver-host}")
    private String mailServerHost;

    @Value("${user.registration.service.mailserver-port}")
    private int mailServerPort;

    @Override
    public void send(String message, String emailRecipient) {
        System.out.println("Sending email to: " + emailRecipient);
        System.out.println("Message: " + message);
        System.out.println("Mail server host: " + mailServerHost);
        System.out.println("Mail server port: " + mailServerPort);
    }
}
