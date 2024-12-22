public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.description = "Cheese Pizza";
    }

    @Override
    public int getCost() {
        return 10000;
    }
}
