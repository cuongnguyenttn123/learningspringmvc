package cuongnguyen.tt.controller;

import cuongnguyen.tt.exception.httpstatus.UnauthorizedException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@RequestMapping("/exception")
@Controller
public class ExceptionController {
    @GetMapping("/v1")
    public String getException () throws IOException {
        throw new UnauthorizedException();

    }

    @GetMapping("/error")
    public String getForBidden(){
        return "error/error_403";
    }
}
