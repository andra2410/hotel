package ro.itschool.service.email;

import org.springframework.stereotype.Service;

@Service
public interface EmailSender {
    void sendEmail(String toEmail, String subject, String body);
}
