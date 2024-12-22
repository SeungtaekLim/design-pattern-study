public class Main {
    public static void main(String[] args) {
        Subject publisher = new Channel();

        Observer o1 = new BigFan("s1");
        Observer o2 = new BigFan("s2");
        publisher.registerObserver(o1);
        publisher.registerObserver(o2);

        publisher.notifyObservers();
        publisher.removeObserver(o2);
        publisher.notifyObservers();
    }
}
