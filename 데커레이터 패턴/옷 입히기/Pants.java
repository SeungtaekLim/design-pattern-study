package org.example;

public class Pants extends Decorator{
    Pants(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return avatar.getDescription() + ", 바지";
    }

    @Override
    public int getPrice() {
        return avatar.getPrice() + 3000;
    }
}
