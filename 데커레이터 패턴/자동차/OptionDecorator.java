public abstract class OptionDecorator extends Car {
    protected Car car;

    OptionDecorator(Car car) {
        this.car = car;
    }

    public abstract String getDescription();
}
