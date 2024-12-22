import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println(o + "님이 구독을 시작하였습니다.");
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println(o + "님이 구독을 해지하였습니다.");
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
