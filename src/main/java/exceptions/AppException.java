package exceptions;

public class AppException extends RuntimeException {

    // Конструктор с сообщением
    public AppException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор только с причиной (опционально)
    public AppException(Throwable cause) {
        super(cause);
    }
}