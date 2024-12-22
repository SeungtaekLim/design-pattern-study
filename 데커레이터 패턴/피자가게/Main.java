public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        System.out.println(cheesePizza.getDescription() + " Cost: " + cheesePizza.getCost());

        Pizza cheesePizzaWithTomato = new FreshTomato(new CheesePizza());
        System.out.println(cheesePizzaWithTomato.getDescription() + " Cost: " + cheesePizzaWithTomato.getCost());

        Pizza combinationPizzaWithTomato = new FreshTomato(new CombinationPizza());
        System.out.println(combinationPizzaWithTomato.getDescription() + " Cost: " + combinationPizzaWithTomato.getCost());


        Pizza cheesePizzaWithTomatoAndOlive = new FreshTomato(new Olive(new CheesePizza()));
        System.out.println(cheesePizzaWithTomatoAndOlive.getDescription() + " Cost: " + cheesePizzaWithTomatoAndOlive.getCost());
    }
}
