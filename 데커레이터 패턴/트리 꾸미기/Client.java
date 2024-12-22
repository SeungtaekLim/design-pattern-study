package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        Tree tree = new ChristmasTree();
        System.out.println(tree.getDescription() + "비용:" + tree.getPrice());
        tree = new Star(tree);
        System.out.println(tree.getDescription() + "비용:" + tree.getPrice());
        tree = new Ball(tree);
        System.out.println(tree.getDescription() + "비용:" + tree.getPrice());
        tree = new Bulb(tree);
        System.out.println(tree.getDescription() + "비용:" + tree.getPrice());
        tree = new Santa(tree);
        System.out.println(tree.getDescription() + "비용:" + tree.getPrice());

    }
}