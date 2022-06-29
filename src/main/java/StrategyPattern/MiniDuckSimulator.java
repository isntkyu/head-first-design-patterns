package StrategyPattern;

import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.MallardDuck;
import StrategyPattern.Duck.ModelDuck;
import StrategyPattern.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
