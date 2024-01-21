package Lesson19.Hamburger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hamburger hamburger;
        System.out.println("Kingb Burgers");
        System.out.println("Simple Burger") ;
        System.out.println("Burgerni o'zgartirasizmi?");
        System.out.println("1) Ha");
        System.out.println("2) Yo'q");
        if (in.nextInt()==1){
            System.out.println("Burger tanlang.!");
            System.out.println("1) Healty Burger") ;
            System.out.println("2) Delux Burger") ;
            if (in.nextInt()==1){
                 hamburger = new Hamburger(1);
            }else {
                 hamburger = new Hamburger(2);
            }
        }else {
             hamburger = new Hamburger();
        }
        System.out.println(hamburger.showSum());
    }
}
