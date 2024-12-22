public class Olive extends ToppingDecorator{
    public Olive(final Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "with Olive Pizza";
    }

    @Override
    public int getCost() {
        return 400 + pizza.getCost();
    }


}
