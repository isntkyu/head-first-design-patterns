package adapter;

public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("날고있어요");
    }

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
