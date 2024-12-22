import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice{
    private List<ComputerDevice> computers = new ArrayList<>();
    public void addComponent(ComputerDevice component) {
        computers.add(component);
    }

    public void removeComponent(Computer computer) {
        computers.remove(computer);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (ComputerDevice computer : computers) {
            price += computer.getPrice();
        }
        return price;
    }

    @Override
    public int getPower() {
        int power = 0;
        for (ComputerDevice computer : computers) {
            power += computer.getPower();
        }
        return power;
    }
}
