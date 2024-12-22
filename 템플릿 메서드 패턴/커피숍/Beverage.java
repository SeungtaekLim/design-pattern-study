public abstract class Beverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("물이 끓습니다.");
    }

    void pourInCup() {
        System.out.println("컵에 붓숩니다");
    }

    abstract void brew();
    abstract void addCondiments();
}
