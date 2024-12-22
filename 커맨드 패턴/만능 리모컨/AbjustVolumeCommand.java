public class AbjustVolumeCommand implements Command {
    private Stereo stereo;

    public AbjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.abjustVolume();
    }
}
