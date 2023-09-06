package api.vtwspring.email.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService{

    private final JavaMailSender javaMailSender;
    private final HttpSession session;

    @Override
    public boolean sendChkEmail(String email) throws MessagingException {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        String code = createCode();

        session.setAttribute(email, code);

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, false, "UTF-8");
        mimeMessageHelper.setTo(email);
        mimeMessageHelper.setSubject("testSubject");
        mimeMessageHelper.setText("인증코드 : " + code);

        javaMailSender.send(mimeMessage);

        return true;
    }

    @Override
    public boolean chkEmail(String email, String code) {

        String findCode = (String) session.getAttribute(email);

        return code.equals(findCode);
    }


    //인증코드 생성 함수(6자리)
    public String createCode() {
        char[] tmp = new char[6];
        for(int i=0; i<tmp.length; i++) {
            int div = (int) Math.floor( Math.random() * 2 );
            if(div == 0) { // 0이면 숫자로
                tmp[i] = (char) (Math.random() * 10 + '0') ;
            }else { //1이면 알파벳
                tmp[i] = (char) (Math.random() * 26 + 'A') ;
            }
        }
        return new String(tmp);
    }
}
