package org.example;

public abstract class Decorator extends Tree{
    protected Tree tree;
    Decorator(Tree tree){
        this.tree=tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription();
    }

    public int getPrice(){
        return tree.getPrice();
    }
}
