package adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        testDuck(duck);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
