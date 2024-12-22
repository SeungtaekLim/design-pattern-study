package org.example;

public class BasicAvatar extends Avatar{
    @Override
    public String getDescription() {
        return "기본 아바타";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
