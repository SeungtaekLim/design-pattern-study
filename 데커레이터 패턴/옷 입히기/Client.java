package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        Avatar avatar = new BasicAvatar();
        System.out.println(avatar.getDescription() + "비용:" + avatar.getPrice());
        avatar = new Shirts(avatar);
        System.out.println(avatar.getDescription() + "비용:" + avatar.getPrice());
        avatar=new Pants(avatar);
        System.out.println(avatar.getDescription() + "비용:" + avatar.getPrice());
        avatar=new Cardigan(avatar);
        System.out.println(avatar.getDescription()+"비용:" + avatar.getPrice());
        avatar=new Coat(avatar);
        System.out.println(avatar.getDescription()+"비용:" + avatar.getPrice());
        avatar=new Shoes(avatar);
        System.out.println(avatar.getDescription()+"비용:" + avatar.getPrice());

    }
}