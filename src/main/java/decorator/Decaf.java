package decorator;

public class Decaf extends Beverage{
    public Decaf(){
        description = "디 카페인";
    }

    public double cost(){
        return 1.05;
    }
}
