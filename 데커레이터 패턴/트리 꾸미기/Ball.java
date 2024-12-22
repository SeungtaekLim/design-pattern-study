package org.example;

public class Ball extends Decorator{
    Ball(Tree tree) {
        super(tree);
    }

    public String getDescription(){
        return tree.getDescription() + ", 구슬";
    }

    public int getPrice(){
        return tree.getPrice() + 10000;
    }
}
