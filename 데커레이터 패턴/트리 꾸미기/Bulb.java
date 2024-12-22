package org.example;

public class Bulb extends Decorator{
    Bulb(Tree tree) {
        super(tree);
    }

    public String getDescription(){
        return tree.getDescription() + ", 전구";
    }

    public int getPrice(){
        return tree.getPrice() + 15000;
    }
}
