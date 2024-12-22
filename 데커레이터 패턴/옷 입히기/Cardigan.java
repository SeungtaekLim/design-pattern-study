package org.example;

public class Cardigan extends Decorator{
    Cardigan(Avatar avatar) {
        super(avatar);
    }
    @Override
    public String getDescription() {
        return avatar.getDescription() + ", 가디건";
    }

    @Override
    public int getPrice() {
        return avatar.getPrice() + 4000;
    }
}
