package main;
import poupee.Poupee;

class Main {
    public static void main(String[] args) {
        Poupee poupee1 = new Poupee(1);
        Poupee poupee2 = new Poupee(2);
        Poupee poupee3 = new Poupee(3);
        System.out.println(poupee1.placerDans(poupee2));
        System.out.println(poupee1.ouvrir());
        System.out.println(poupee1.isOpened());
        System.out.println();
    }
}
