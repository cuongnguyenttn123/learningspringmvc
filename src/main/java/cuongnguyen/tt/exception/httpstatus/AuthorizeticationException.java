package cuongnguyen.tt.exception.httpstatus;

import netscape.security.ForbiddenTargetException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Error 403")
public class AuthorizeticationException extends RuntimeException {
    public static final long serialVersionUID = 1L;
}
