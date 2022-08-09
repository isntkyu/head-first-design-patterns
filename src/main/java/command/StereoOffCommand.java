package command;

public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute(){
        stereo.off();
        stereo.setVolume(0);
    }
    public void undo(){
        stereo.on();
    }
}
