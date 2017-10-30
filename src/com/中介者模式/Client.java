package com.中介者模式;

/**
 * Created by mu on 2017/10/19.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();
        Colleague colleagueA=new ConcreteColleagueA(mediator);
        Colleague colleagueB=new ConcreteColleagueB(mediator);
        Colleague colleagueC=new ConcreteColleagueC(mediator);
        mediator.setColleague1(colleagueA);
        mediator.setColleague2(colleagueB);
        mediator.setColleague3(colleagueC);

        colleagueA.send("A 发送");
        colleagueB.send("B 发送");
        colleagueC.send("C 发送");
    }
}
