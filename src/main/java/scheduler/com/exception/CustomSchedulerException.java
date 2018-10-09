package scheduler.com.exception;

import org.springframework.http.HttpStatus;

public class CustomSchedulerException extends  RuntimeException {
    private HttpStatus httpStatus;
    private String message;

    public CustomSchedulerException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }



    public String getMessage() {
        return message;
    }
}
