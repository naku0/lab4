package se.itmo.ru.interfaces.argue;

import se.itmo.ru.exceptions.DeathOfPersonException;
import se.itmo.ru.exceptions.NegativeAmountException;

public interface WinAnArgue {
    String winAnArgue() throws DeathOfPersonException;
}
