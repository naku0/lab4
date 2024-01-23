package se.itmo.ru.UsableObj;

import se.itmo.ru.abstracts.*;

public class Chocolate extends ReasonOfArgue {
    public Chocolate(String name) {
        super(name);
    }

    public Chocolate() {
        super("шоколадка");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public void remain() {

    }
}
