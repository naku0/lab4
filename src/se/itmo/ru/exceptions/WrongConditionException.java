package se.itmo.ru.exceptions;

public class WrongConditionException extends RuntimeException {
    public WrongConditionException(String description) {
        super(description);
    }
}
