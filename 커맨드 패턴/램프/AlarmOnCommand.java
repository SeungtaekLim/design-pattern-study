public class AlarmOnCommand implements Command {
    private Alarm alarm;
    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    public void execute() {
        alarm.start();
    }
}
