package se.itmo.ru.interfaces.argue;

import se.itmo.ru.abstracts.ReasonOfArgue;
import se.itmo.ru.exceptions.DeathOfPersonException;
import se.itmo.ru.exceptions.NegativeAmountException;

public interface CompleteArgue {
    void completeArgue(ReasonOfArgue reason, int amount) throws NegativeAmountException, DeathOfPersonException;
}
