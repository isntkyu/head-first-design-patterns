package templatemethod;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    public void brew () {
        System.out.println("필터로 커피를 우려내는 중");
    }

    public void addCondiments(){
        System.out.println("우유와 설탕을 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
//        String answer = getUserInput();
        String answer = "Y";

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
}
