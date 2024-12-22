public class Main {
    public static void main(String[] args) {
        FoodDelivery sushiDelivery = new SushiDelivery();
        System.out.println("스시 배달 프로세스:");
        sushiDelivery.deliverFood();

        System.out.println();

        FoodDelivery burgerDelivery = new BurgerDelivery();
        System.out.println("버거 배달 프로세스:");
        burgerDelivery.deliverFood();
    }
}

