package epam.education.prog2.exceptionHandling;

/**
 * TODO docme.
 */
public class CustomException extends RuntimeException {

    private String message;

    CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
