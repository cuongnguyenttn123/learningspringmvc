package cuongnguyen.tt.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mail/")
public class SentMailController {
    @Autowired
    private Environment environment;

    @Autowired
    JavaMailSender javaMailSender;
    @GetMapping("simple")
    @ResponseBody
    public String sentMailSimple(){
        String response = environment.getProperty("reponse.seccess");
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo("giahan23021995@mail.com");
            simpleMailMessage.setSubject("Thu cai thoi gi ma cang");
            simpleMailMessage.setText("[ĐN] CHÀO THÁNG TÁM, KHÔNG CÒN NỖI SỢ THIẾU VIỆC LÀM ❤️\n" +
                    "\"Cơ hội việc làm hot nhất tháng 8 dành cho các bạn sinh viên vừa, sắp ra trường khối ngành Công Nghệ\"");
            
            this.javaMailSender.send(simpleMailMessage);
        }catch (Exception e){
            response = environment.getProperty("reponse.error");
        }
        return response;
    }
}
