package command;

public class GarageDoor {
    public String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("차고 문이 열렸습니다.");
    }

    public void down() {
        System.out.println("차고 문이 닫혔습니다.");
    }
}
