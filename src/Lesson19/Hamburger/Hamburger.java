package Lesson19.Hamburger;

import Lesson19.Hamburger.Hamburgers.Deluxe;
import Lesson19.Hamburger.Hamburgers.Healty;
import Lesson19.Hamburger.Hamburgers.SimpleBurger;

import java.util.Scanner;

public class Hamburger {
    int b = 0;
    private Deluxe deluxe = null;
    private Healty healty = null;
    private SimpleBurger simpleBurger;

    public Hamburger() {
        simpleBurger = new SimpleBurger();
    }

    public Hamburger(int b) {
        this.b = b;
        if (b == 1) {
            Scanner in = new Scanner(System.in);
            System.out.println("Healty burgerga qo'shimcha qo'shasizmi?");
            System.out.println("1) Ha");
            System.out.println("2) Yo'q");
            int a = in.nextInt();
            if (a == 1) {
                healty = new Healty(true);
            } else healty = new Healty(false);
        } else if (b == 2) {
            Scanner in = new Scanner(System.in);
            System.out.println("Delux burgerga qo'shimcha qo'shasizmi?");
            System.out.println("1) Ha");
            System.out.println("2) Yo'q");
            int a = in.nextInt();
            if (a == 1) {
                deluxe = new Deluxe(true);
            } else deluxe = new Deluxe(false);
        }
    }

    public int showSum() {
        if (b == 1) {
            return healty.healtySum();
        } else if (b == 2) return deluxe.deluxSum();
        return simpleBurger.getSum();
    }

}
