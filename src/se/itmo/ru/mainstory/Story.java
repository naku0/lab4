package se.itmo.ru.mainstory;

import se.itmo.ru.exceptions.*;
import se.itmo.ru.abstracts.*;
import se.itmo.ru.enums.HealthCondition;
import se.itmo.ru.interfaces.Remainable;

public class Story {
    public static void story(Person sick, Person good, ReasonOfArgue reasonOfArgue) throws WrongConditionException {
        class Justice {
            private final String name = "Справедливость";
            private final String not = " не ";

            public void exist(String not) {
                System.out.println(name + not + "существует!");
            }

            public void exist() {
                System.out.println(name + " существует!");
            }

        }
        ConditionChecker conditionChecker = new ConditionChecker(sick, good);
        Person person1 = conditionChecker.getPerson1();
        Person person2 = conditionChecker.getPerson2();

        person1.setTemperature(40);

        System.out.print("Ну да, ");
        person2.win("");
        if (person2.isWin()) {
            System.out.print(", значит, ");
            person1.needToGet(reasonOfArgue.getName(), "");
            person2.setWin(false);
        } else {
            System.out.print(", значит, ");
            person2.needToGet(reasonOfArgue.getName(), "");
        }
        Justice justice = new Justice();
        justice.exist(justice.not);

        person2.toBe("");
        person2.wants(reasonOfArgue.getName(), "", person1);
        person2.give(person1, reasonOfArgue.getName());
        person1.byted("");


        person1.continued();
        person1.chew("");
        System.out.print(" и,");
        person1.swallow("");
        person1.layed("");
        person1.gasped("");
        System.out.println(": ");

        System.out.print("Честное слово, теперь и ");
        person2.was();
        person2.trick("");
        System.out.print(". ");
        person2.trust("");
        System.out.println(", что у");

        person1.dropTemperature("");

        person2.wantedToLose();
        Remainable thing = new Remainable() {
            @Override
            public void remain() {
                System.out.print("Осталась ещё одна " + reasonOfArgue.toString() + ", ");
            }
        };
        thing.remain();

        System.out.print("и ");
        person2.willGetPrize(reasonOfArgue, person1);
    }

    public static class ConditionChecker {
        private final Person person1;
        private final Person person2;

        public ConditionChecker(Person person1, Person person2) throws WrongConditionException {
            if (person1.getCondition().equals(person2.getCondition())) {
                throw new WrongConditionException("Одинаковое состояние здоровья");
            } else {
                if ((person1.getCondition() == HealthCondition.GOOD) && (person2.getCondition() == HealthCondition.SICK)) {
                    this.person1 = person2;
                    this.person2 = person1;
                } else {
                    this.person1 = person1;
                    this.person2 = person2;
                }
            }
        }

        public Person getPerson1() {
            return person1;
        }

        public Person getPerson2() {
            return person2;
        }
    }
}