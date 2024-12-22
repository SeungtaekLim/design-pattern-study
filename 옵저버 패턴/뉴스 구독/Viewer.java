public class Viewer implements Observer{
    private String name;
    public Viewer(String name) {
        this.name = name;
    }
    @Override
    public void update(String news) {
        System.out.println(name + "님, 새로운 뉴스" + news);
    }
}
