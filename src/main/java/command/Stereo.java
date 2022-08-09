package command;

public class Stereo {
    public int volume;
    public String location;

    public Stereo (String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("오디오가 켜졌습니다.");
    }
    public void off(){
        System.out.println("오디오가 꺼졌습니다");
    }
    public void setCd(){
        System.out.println("cd가 들어감.");
    }
    public void setDvd(){
        System.out.println("dvd 셋팅");
    }
    public void setRadio(){
        System.out.println("라디오셋팅");
    }
    public void setVolume(int volume){
        System.out.println("볼륨 세팅");
        this.volume = volume;
    }
}
