package org.example;

public class Santa extends Decorator{
    Santa(Tree tree) {
        super(tree);
    }

    public String getDescription(){
        return tree.getDescription() + ", 산타";
    }

    public int getPrice(){
        return tree.getPrice() + 4000;
    }
}
