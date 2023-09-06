package api.vtwspring.email.controller;

import api.vtwspring.email.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @GetMapping("/sendChkEmail")
    private boolean sendChkEmail(String email) throws MessagingException {

        return emailService.sendChkEmail(email);
    }

    @GetMapping("/chkEmail")
    private boolean chkEmail(String email, String code) {

        return emailService.chkEmail(email, code);
    }
}
