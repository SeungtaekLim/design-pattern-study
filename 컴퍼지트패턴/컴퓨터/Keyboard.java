public class Keyboard extends ComputerDevice{
    private int price;
    private int power;

    public Keyboard(int price, int power) {
        this.power = power;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
