public class Exception extends IllegalArgumentException {

    public Exception() {
        super();
    }

    public Exception(String message) {
        super(message);
    }

    public Exception(Throwable cause) {
        super(cause);
    }

    public Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
