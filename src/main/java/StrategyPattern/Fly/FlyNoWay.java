package StrategyPattern.Fly;

public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("못 난다.");
    }
}
