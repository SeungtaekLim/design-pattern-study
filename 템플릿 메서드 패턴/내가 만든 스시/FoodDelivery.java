public abstract class FoodDelivery {
    public final void deliverFood() {
        chooseFood();            // 음식 선택
        makePayment();           // 결제 처리
        prepareFood();           // 음식 준비
        packFood();              // 음식 포장
        deliverToCustomer();     // 배달
        sendConfirmationEmail(); // 확인 이메일 발송
    }

    private void chooseFood() {
        System.out.println("고객이 음식을 선택합니다.");
    }

    private void makePayment() {
        System.out.println("결제를 처리합니다.");
    }

    private void sendConfirmationEmail() {
        System.out.println("주문 확인 이메일을 보냅니다.");
    }

    protected abstract void prepareFood(); // 음식 준비
    protected abstract void packFood();    // 음식 포장
    protected abstract void deliverToCustomer(); // 음식 배달
}


