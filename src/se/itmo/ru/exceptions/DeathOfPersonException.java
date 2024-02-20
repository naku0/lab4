package se.itmo.ru.exceptions;

public class DeathOfPersonException extends RuntimeException {
    public DeathOfPersonException(String description) {
        super(description);
    }
}
