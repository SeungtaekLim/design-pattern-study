public class Coffee extends Beverage{

    @Override
    void brew() {
            System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding coffee and milk");
    }
}
