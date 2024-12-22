import java.util.ArrayList;
import java.util.List;

public class News implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String category;

    public News(String category) {
        this.category = category;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println(o + "님이 " + category + " 카테고리를 구독하였습니다.");
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println(o + "님이 " + category + " 카테고리 구독을 해지하였습니다.");
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(category + " 뉴스가 업데이트되었습니다!");
        }
    }

    public void publishNews(String news) {
        System.out.println(category + " 카테고리에서 새로운 뉴스가 발표되었습니다: " + news);
        notifyObservers();
    }
}
