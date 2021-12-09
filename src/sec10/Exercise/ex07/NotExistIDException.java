package sec10.Exercise.ex07;

public class NotExistIDException extends Exception{
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }
}
