public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Stereo stereo = new Stereo();
        TV tv = new TV();

        Command turnOnDevice = new TurnOnCommand(device);
        Command turnOffDevice = new TurnOffCommand(device);
        Command adjustVolumeStereo = new AbjustVolumeCommand(stereo);
        Command changeChannelTV = new ChangeChannelCommand(tv);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnDevice);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffDevice);
        remoteControl.pressButton();
        remoteControl.setCommand(adjustVolumeStereo);
        remoteControl.pressButton();
        remoteControl.setCommand(changeChannelTV);
        remoteControl.pressButton();



    }
}
