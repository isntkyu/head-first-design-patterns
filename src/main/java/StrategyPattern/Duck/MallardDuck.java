package StrategyPattern.Duck;

import StrategyPattern.Fly.FlyWithWings;
import StrategyPattern.Quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display () {
        System.out.println("저는 물오리에요.");
    }
}
