package cuongnguyen.tt.exception;

public class NullPointException extends Exception {
    public NullPointException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Number age: " + super.getMessage();
    }
}
