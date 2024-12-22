public class Navigation extends OptionDecorator {
    public Navigation(final Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "with Navigation";
    }

    @Override
    public int getCost() {
        return 300 + car.getCost();
    }
}
