package command;

public class Light {
    public String name;

    public Light (String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("조명이 켜졌습니다.");
    };
    public void off(){
        System.out.println("조명이 꺼졌습니다.");
    };
}
