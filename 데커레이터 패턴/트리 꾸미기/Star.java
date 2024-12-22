package org.example;

public class Star extends Decorator{

    public Star(final Tree tree){
        super(tree);
    }

    public String getDescription(){
        return tree.getDescription() + ", 별장식";
    }

    public int getPrice(){
        return tree.getPrice() + 5000;
    }
}
