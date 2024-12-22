package org.example;

public class Coat extends Decorator{
    Coat(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return avatar.getDescription() + ", 코트";
    }

    @Override
    public int getPrice() {
        return avatar.getPrice() + 5000;
    }
}
