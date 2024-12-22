package org.example;

public class ON implements State {
    private Light light;
    public ON(Light light){
        this.light=light;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light SLEEPING!");
        light.setState(new SLEEPING(light));
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light OFF!");
        light.setState(new OFF(light));
    }
}
