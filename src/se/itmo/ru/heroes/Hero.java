package se.itmo.ru.heroes;

import se.itmo.ru.abstracts.Person;
import se.itmo.ru.abstracts.ReasonOfArgue;
import se.itmo.ru.enums.*;

public class Hero extends Person {
    public Hero(String name, HealthCondition condition) {
        super(name, condition);
    }

    @Override
    public void win(String what) {
        what = "пари";
        super.win(what);
    }

    @Override
    public void needToGet(String what, String why) {
        why = " в утешение. ";
        super.needToGet(what, why);
    }

    @Override
    public void toBe(String who) {
        who = " гадкий мальчишка ";
        super.toBe(who);
    }

    @Override
    public void wants(String what, String why, Person opponent) {
        why = " потому, что у " + opponent.toString() + " не упала температура. ";
        super.wants(what, why, opponent);
    }

    @Override
    public void chew(String how) {
        how = How.ENERGETICLY.getName();
        super.chew(how);
    }

    @Override
    public void swallow(String what) {
        what = (Adjectives.LAST.getName() + "кусок,");
        super.swallow(what);
    }

    @Override
    public void layed(String location) {
        location = " на подушку";
        super.layed(location);
    }

    @Override
    public void gasped(String how) {
        how = How.HARD.getName();
        super.gasped(how);
    }

    @Override
    public void dropTemperature(String why) {
        why = (Adjectives.TRIPLE.getName() + "порции" + Adjectives.SUGARY.getName() + "порошка");
        super.dropTemperature(why);
    }

    //dsds
    @Override
    public void trick(String how) {
        how = (How.ALITTLE.getName());
        super.trick(how);
    }

    @Override
    public void trust(String how) {
        how = How.COMPLETELY.getName();
        super.trust(how);
    }

    @Override
    public void give(Person who, String what) {
        super.give(who, what);
    }

    @Override
    public void byted(String what) {
        what = "половину. ";
        super.byted(what);
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
}
