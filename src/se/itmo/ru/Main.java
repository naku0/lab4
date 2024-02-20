package se.itmo.ru;

import se.itmo.ru.enums.HealthCondition;
import se.itmo.ru.exceptions.WrongConditionException;
import se.itmo.ru.heroes.*;
import se.itmo.ru.UsableObj.*;
import se.itmo.ru.mainstory.Story;

public class Main {
    public static void main(String[] args) throws WrongConditionException {
        Hero karlson = new Hero("Карлсон", HealthCondition.SICK);
        Hero malysh = new Hero("Малыш", HealthCondition.GOOD);
        Argue newArgue = new Argue(karlson, malysh);
        Chocolate chocolate = new Chocolate();
        Story.story(karlson, malysh, chocolate);
        System.out.println();
        newArgue.completeArgue(chocolate, 2);
    }
}
/*
Ну да, пари выиграл Малыш, значит, Карлсону надо получить в утешение шоколадку. Нет справедливости на этом свете!
А Малыш всего-навсего гадкий мальчишка, он хочет съесть шоколад только потому, что у Карлсона не упала температура.
Малыш с неохотой протянул шоколадку Карлсону. Он мигом откусил половину.

Карлсон продолжал энергично работать челюстями и, проглотив последний кусок, откинулся на подушку и тяжело вздохнул:
Честное слово, теперь и Малышу было не грех немножко схитрить. Он, конечно, совершенно не верил,
что у Карлсона упадет температура даже и от тройной порции "приторного порошка",
но ведь ему так хотелось на этот раз проспорить! Осталась еще одна шоколадка,
и он ее получит, если Карлсон выиграет спор.

Малыш смешал двойную дозу порошка и всыпал его в широко раскрытый рот Карлсона.
Затем они снова уселись, замолчали и стали ждать. Полминуты спустя Карлсон с сияющим видом соскочил с дивана.
Малыш выиграл.
*/