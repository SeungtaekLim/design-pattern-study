public class heatedSeat extends OptionDecorator {
    public heatedSeat(final Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "with heated seat";
    }

    @Override
    public int getCost() {
        return 400 + car.getCost();
    }
}
