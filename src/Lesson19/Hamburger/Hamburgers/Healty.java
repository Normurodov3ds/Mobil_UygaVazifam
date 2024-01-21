package Lesson19.Hamburger.Hamburgers;

import Lesson19.Hamburger.ingredients.Bread;
import Lesson19.Hamburger.ingredients.Drinks;
import Lesson19.Hamburger.ingredients.Meat;
import Lesson19.Hamburger.ingredients.Salads;

import java.util.HashSet;
import java.util.Scanner;

public class Healty {
    private Meat meat;
    private Bread bread;
    private HashSet<Salads> salads = new HashSet<>();
    private HashSet<Drinks> drinks = new HashSet<>();
    private boolean b;

    public Healty(boolean b) {
        this.b = b;
        this.meat = Meat.Beef;
        this.bread = Bread.SimpleBread;
        salads.add(Salads.Cheese);
        salads.add(Salads.Cabbage);
        salads.add(Salads.Chili);
        salads.add(Salads.Tomato);
        System.out.println(" Healty burger ");
        showHealty();
        if (b) {
            Scanner in = new Scanner(System.in);
            while (true) {
                System.out.println(" 1 - salat qo'sasizmi? \n 2 -> o'zgartirasizmi ?\n 3 -> ichimlikar 3 \n chiqish hohlagan boshqa raqam kiriting...");
                int i = in.nextInt();
                if (i == 2) {
                    editBurger();
                } else if (i == 1) {
                    addBurgerSalads();
                } else if (i == 3) {
                    addDrinks();
                } else {
                    System.out.println("Buyurtmangiz tayyor.!");
                    break;
                }
            }
        }
        System.out.println("==========");
        showHealty();
        System.out.println("summa : " + healtySum() + " so'm");
        System.out.println("==========");
    }

    private void addBurgerSalads() {

        System.out.println("Salatlarni tanlanag 2 tagacha mahsulot qo'shishingiz mumkin");
        Scanner in = new Scanner(System.in);
        Salads[] array = Salads.values();
        for (Salads salads1 : array) {
            System.out.println((salads1.ordinal()) + ") " + salads1);
        }

        for (int i = 0; i < 2; i++) {
            int a = in.nextInt();
            if (a < 0 || a >= array.length) {
                break;
            }
            boolean add = salads.add(array[a]);
            if (add) {
                System.out.println("Massaliq qo'shildi.! " + add);
            } else {
                System.out.println("Burgerda bu massaliq bor.! " + add);
            }
        }

    }

    private void editBurger() {
        Scanner in = new Scanner(System.in);
        System.out.println("Salatlarni tanlanag 2 tagacha mahsulot o'zgartirishingiz mumkin");
        Salads[] array = Salads.values();
        for (Salads salads1 : array) {
            System.out.println((salads1.ordinal())+") "+salads1);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Olib tashlamoqchi bo'lhan salatingizni tanlang");
            int a = in.nextInt();
            System.out.println("Qo'shmoqchi bo'lgan salatingizni tanlang");
            int b = in.nextInt();
            if (a < 0 || a >= array.length) {
                break;
            }
            salads.remove(array[a]);
            boolean add = salads.add(array[b]);
            if (add) {
                System.out.println("Massaliq qo'shildi.! " + add);
            } else {
                System.out.println("Burgerda bu massaliq bor.! " + add);
            }
        }
    }

    private void addDrinks() {
        Drinks[] drinks1 = Drinks.values();
        int i = 0;
        System.out.println("ichimlik tanlang!");
        for (Drinks drinks2 : drinks1) {
            System.out.println(i + ") " + drinks2);
            i++;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("=============");
        int a = in.nextInt();
        if (a < 0 || a >= drinks1.length) {
            System.out.println("ichimlik qo'shilmadi");
        } else {
            if (drinks.add(drinks1[a])) {
                System.out.println("ichimlik qo'shildi");
            } else System.out.println("ichimlik qo'shilmadi");
        }
    }

    private void showHealty() {
        System.out.println("1) G'sht " + meat);
        System.out.println("2) Non " + bread);
        int a = 0;
        System.out.println("Salatlar:");
        for (Salads salad : salads) {
            System.out.println("   " + (a) + ") " + salad);
            a++;
        }

        a = 0;
        if (!drinks.isEmpty()) {
            System.out.println("Ichimliklar :");
            for (Drinks drink : drinks) {
                System.out.println("   " + (a) + ") " + drink);
                a++;
            }
        }
    }
    public int healtySum() {
        int sum = 0;
        sum += meat.getSum();
        sum += bread.getSum();
        for (Salads salad : salads) {
            sum += salad.getSum();
        }
        for (Drinks drink : drinks) {
            sum += drink.getSum();
        }
        return sum;
    }


}
