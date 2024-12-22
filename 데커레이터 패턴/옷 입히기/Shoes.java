package org.example;

public class Shoes extends Decorator{
    Shoes(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return avatar.getDescription() + ", 신발";
    }

    @Override
    public int getPrice() {
        return avatar.getPrice() + 3000;
    }
}
