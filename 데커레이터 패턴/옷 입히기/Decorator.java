package org.example;

public abstract class Decorator extends Avatar{
    protected Avatar avatar;
    Decorator(final Avatar avatar){
        this.avatar=avatar;
    }

    public String getDescription(){
        return avatar.getDescription();
    }

    public int getPrice(){
        return avatar.getPrice();
    }
}
