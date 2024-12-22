public class CrossingDecorator extends DisplayDecorator{
    public CrossingDecorator(Display decoratorDisplay) {
        super(decoratorDisplay);

    }

    public void draw(){
        super.draw();
        drawCrossing();
    }

    private void drawCrossing(){
        System.out.println("횡단보도 표시");
    }
}
