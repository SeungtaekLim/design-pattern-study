public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        Motor hyundaiMotor = new HyundaiMotor(door);
        hyundaiMotor.move(Direction.UP);

        Motor LGMotor = new LGMotor(door);
        LGMotor.move(Direction.DOWN);
    }
}
