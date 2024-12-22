public abstract class ToppingDecorator extends Pizza{
    protected Pizza pizza;

    ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
