public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        System.out.println(sedan.getDescription() + " Cost: " + sedan.getCost() + "만원");

        Car sedanWithNavigation = new Navigation(new Sedan());
        System.out.println(sedanWithNavigation.getDescription() + " Cost: " + sedanWithNavigation.getCost() + "만원");

        Car SUVWithNavigation = new Navigation(new SUV());
        System.out.println(SUVWithNavigation.getDescription() + " Cost: " + SUVWithNavigation.getCost() + "만원" );

        Car sedanFullOption = new Navigation(new heatedSeat(new Sedan()));
        System.out.println(sedanFullOption.getDescription() + " Cost: " + sedanFullOption.getCost() + "만원");
    }
}
