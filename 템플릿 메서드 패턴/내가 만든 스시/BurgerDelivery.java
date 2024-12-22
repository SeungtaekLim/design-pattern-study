public class BurgerDelivery extends FoodDelivery {
    @Override
    protected void prepareFood() {
        System.out.println("버거 패티를 굽고 빵과 재료를 준비합니다.");
    }

    @Override
    protected void packFood() {
        System.out.println("버거를 포장지에 싸고 소스를 따로 넣습니다.");
    }

    @Override
    protected void deliverToCustomer() {
        System.out.println("버거를 고객에게 배달합니다.");
    }
}

