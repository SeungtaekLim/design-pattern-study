package org.example;

public class SLEEPING implements State{
    private Light light;
    public SLEEPING(Light light){
        this.light=light;
    }
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light ON!");
        light.setState(new ON(light));
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light OFF!");
        light.setState(new OFF(light));
    }
}
