public class SushiDelivery extends FoodDelivery {
    @Override
    protected void prepareFood() {
        System.out.println("스시를 준비하고 회와 초밥을 만듭니다.");
    }

    @Override
    protected void packFood() {
        System.out.println("스시를 작은 박스에 포장하고 간장과 와사비를 추가합니다.");
    }

    @Override
    protected void deliverToCustomer() {
        System.out.println("스시를 고객에게 배달합니다.");
    }
}

