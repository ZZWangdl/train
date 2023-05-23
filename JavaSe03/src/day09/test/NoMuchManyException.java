package day09.test;

public class NoMuchManyException extends RuntimeException{
    public NoMuchManyException() {
    }

    public NoMuchManyException(String message) {
        super(message);
    }
}
