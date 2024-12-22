package org.example;

public class OFF implements State{
    private Light light;
    public OFF(Light light){
        this.light=light;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On!");
        light.setState(new ON(light));
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
    }
}
