public class Main {
    public static void main(String[] args) {
        Composite composite1 = new Composite();

        Leaf leaf = new Leaf();
        Composite composite2 = new Composite();

        composite1.addComponent(leaf);
        composite1.addComponent(composite2);

        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Leaf leaf4 = new Leaf();

        composite2.addComponent(leaf2);
        composite2.addComponent(leaf3);
        composite2.addComponent(leaf4);

        composite1.operation();
    }
}
