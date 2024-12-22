package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        light.off_button_pushed(); //"반응 없음"
        light.on_button_pushed(); //"Light ON!"
        light.on_button_pushed(); //"Light SLEEPING!"
        light.on_button_pushed(); //"LIGHT ON!"
        light.off_button_pushed();//"Light OFF!"

    }
}