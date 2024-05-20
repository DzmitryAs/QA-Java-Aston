public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super("Incorrect data " + message);
    }
}