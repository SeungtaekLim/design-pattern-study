package org.example;

public class ChristmasTree extends Tree{
    protected Tree tree;

    @Override
    public String getDescription() {
        return "크리스마스 트리";
    }

    @Override
    public int getPrice() {
        return 100000;
    }
}
