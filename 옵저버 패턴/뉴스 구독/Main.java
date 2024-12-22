public class Main {
    public static void main(String[] args) {
        News sportsNews = new News("스포츠");
        News politicsNews = new News("시사");

        Viewer viewer1 = new Viewer("김철수");
        Viewer viewer2 = new Viewer("임승택");

        sportsNews.registerObserver(viewer1);
        politicsNews.registerObserver(viewer2);

        sportsNews.publishNews("손흥민 골!");
        politicsNews.publishNews("트럼프 당선!");

        sportsNews.removeObserver(viewer1);
        sportsNews.publishNews("황희찬 골!");
    }
}
