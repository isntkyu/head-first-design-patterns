package command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorDown);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();



        RemoteControl remoteControl2 = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        remoteControl2.setCommand(0, ceilingFanHighCommand, ceilingFanHighCommand);

        remoteControl2.onButtonWasPushed(0);
        System.out.println(remoteControl2);
        remoteControl2.undoButtonWasPushed();

        Command[] patryOn = {livingRoomLightOn, kitchenLightOn, stereoOnWithCD, garageDoorOpen};
        Command[] patryOff = {livingRoomLightOff, kitchenLightOff, stereoOff, garageDoorDown};

        MacroCommand patryOnMacro = new MacroCommand(patryOn);
        MacroCommand patryOffMacro = new MacroCommand(patryOff);

        remoteControl.setCommand(6, patryOnMacro, patryOffMacro);

        System.out.println(remoteControl);

        System.out.println("---매크로 ON---");
        remoteControl.onButtonWasPushed(6);
        System.out.println("---매크로 OFF---");
        remoteControl.offButtonWasPushed(6);
    }
}
