package se.itmo.ru.exceptions;

import java.io.IOException;

public class NegativeAmountException extends IOException {
    public NegativeAmountException(String description) {
        super(description);
    }
}
