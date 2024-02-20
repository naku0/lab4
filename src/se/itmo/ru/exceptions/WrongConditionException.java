package se.itmo.ru.exceptions;

public class WrongConditionException extends Exception {
    public WrongConditionException(String description) {
        super(description);
    }
}
