package org.example;

public class Shirts extends Decorator{
    public Shirts(Avatar avatar){
        super(avatar);
    }
    @Override
    public String getDescription() {
        return avatar.getDescription() + ", 셔츠";
    }

    @Override
    public int getPrice() {
        return avatar.getPrice() + 2000;
    }
}
