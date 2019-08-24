package cuongnguyen.tt.exception;

import cuongnguyen.tt.exception.httpstatus.AuthorizeticationException;
import cuongnguyen.tt.exception.httpstatus.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionPage {
    @ExceptionHandler(NullPointerException.class)
    public String getPageNUllPointException(){
        return "error/error_401";
    }

    @ExceptionHandler(InternalError.class)
    public String getPageInternalError(){
        return "error/error_500";
    }

    @ExceptionHandler(UnauthorizedException.class)
    public String getUnauthorizedException(){
        return "error/error_401";
    }

    @ExceptionHandler(AuthorizeticationException.class)
    public String getAuthorizedException(){
        return "error/error_403";
    }
}
