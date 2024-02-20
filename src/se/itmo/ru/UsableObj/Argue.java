package se.itmo.ru.UsableObj;

import se.itmo.ru.abstracts.*;
import se.itmo.ru.enums.HealthCondition;
import se.itmo.ru.exceptions.*;
import se.itmo.ru.interfaces.argue.*;

import java.util.Objects;

public class Argue implements WinAnArgue, CompleteArgue {
    private final Person person1;
    private final Person person2;

    private class Solution {
        private final int amount;

        public Solution(int amount) {
            this.amount = amount;
        }

        private void useMedicine() throws NegativeAmountException {
            if (amount < 0) {
                throw new NegativeAmountException("Количество лекарства отрицательное");
            }
            System.out.println(person2.getName() + " смешал " + amount + " дозу порошка и всыпал в рот " + person1.getName() +".");
            person1.usePowder(amount);
            System.out.println("Затем " + person1.getName() + " и " + person2.getName() + " снова уселись, замолчали и стали ждать.");

        }
    }

    public Argue(Person sick, Person good) {
        if (sick.getCondition() == HealthCondition.GOOD && good.getCondition() == HealthCondition.SICK) {
            this.person1 = good;
            this.person2 = sick;
        } else {
            this.person1 = sick;
            this.person2 = good;
        }
        System.out.println(person1.getName() + " и " + person2.getName() + " поспорили!");
    }

    @Override
    public String winAnArgue() {
        try {
            if ((person1.getTemperature() < 27) || (person1.getTemperature() > 41)) {
                throw new DeathOfPersonException(person1 + " умер");
            } else {
                if (person1.getTemperature() >= 36 && person1.getTemperature() <= 37) {
                    person1.setCondition(HealthCondition.GOOD);
                    person2.setWin(true);
                    System.out.println("Полминуты спустя " + person1 + " с сияющим видом соскочил с дивана.");
                    return person2 + " выиграл спор";

                } else {
                    person1.setWin(true);
                    System.out.println("Полминуты спустя c " + person1 + " ничего не произошло.");
                    return person1 + " выиграл спор";
                }
            }
        } catch (DeathOfPersonException e) {
            System.err.println(e.getMessage());
            person1.setWin(true);
            return person2 + " выиграл спор";
        }
    }

    @Override
    public void completeArgue(ReasonOfArgue reason, int amountOfMedicine) {
        try {
            Solution solution = new Solution(amountOfMedicine);
            solution.useMedicine();
            System.out.println(this.winAnArgue());
            reason.whoIsOwner(person1, person2);
            System.out.println(reason.getOwner() + " получил " + reason.getName());
            System.out.println("Температура " + person1.getName() + ": " + person1.getTemperature());
        } catch (NegativeAmountException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Конец истории.");
        }

    }

    @Override
    public String toString() {
        return "Argue{" +
                "person1=" + person1 +
                ", person2=" + person2 +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Argue argue = (Argue) object;
        return Objects.equals(person1, argue.person1) && Objects.equals(person2, argue.person2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person1, person2);
    }
}
