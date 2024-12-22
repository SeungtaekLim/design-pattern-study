import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    List<Component> components = new ArrayList<Component>();

    public void addComponent(Component c) {
        components.add(c);
    }

    public void removeComponent(Component c) {
        components.remove(c);
    }


    @Override
    public void operation() {
        System.out.println(this + "호출");

        for (Component c : components) {
            c.operation();
        }
    }

        public List<Component> getChild() {
        return components;
    }
}
