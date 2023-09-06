package api.vtwspring.email.service;

import javax.mail.MessagingException;

public interface EmailService {
    boolean sendChkEmail(String email) throws MessagingException;

    boolean chkEmail(String email, String code);
}
