public class LaneDecorator extends DisplayDecorator{
    public LaneDecorator(Display display) {
        super(display);
    }

    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("\t차선 표시");
    }
}
