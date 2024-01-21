package Lesson19.Hamburger.Hamburgers;

import Lesson19.Hamburger.ingredients.Bread;
import Lesson19.Hamburger.ingredients.Drinks;
import Lesson19.Hamburger.ingredients.Meat;
import Lesson19.Hamburger.ingredients.Salads;

import java.util.HashSet;
import java.util.Scanner;

public class Deluxe {
    private Meat meat = Meat.HorseMeat;
    private Bread bread = Bread.BigBread;
    private HashSet<Salads> salads = new HashSet<>();
    private HashSet<Drinks> drinks = new HashSet<>();

    public Deluxe(boolean b) {
        salads.add(Salads.Tomato);
        salads.add(Salads.Chili);
        salads.add(Salads.Cheese);
        salads.add(Salads.Onion);

        salads.add(Salads.Cheese); // majburiy
        drinks.add(Drinks.Pepse);  // majburiy
        if (b) {
            System.out.println("Deluxe burger!");
            showInfoDeliux();
            System.out.println("ichimlik qoshasizmi !");
            System.out.println("1) Ha");
            System.out.println("2) Yo'q");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a == 1){
                addDrincs();
            }
            System.out.println("==========");
            showInfoDeliux();
            System.out.println("Buyurtmangiz tayyor.!");
            System.out.println("Sizga bonus :" +Salads.Cheese+" +"+Salads.Cheese.getSum()+", "+Drinks.Pepse+" +"+Drinks.Pepse.getSum());
            System.out.println("Summa : " + deluxSum() + " so'm");
            System.out.println("==========");

        }
    }

    private void addDrincs() {
        System.out.println("Siz faqat ichimlik qo'shimcha olishingiz mumkin.!");
        Scanner in = new Scanner(System.in);
        Drinks[] drinks = Drinks.values();
        int i = 0;
        for (Drinks drink : drinks) {
            System.out.println((i) + ") " + drink);
            i++;
        }
        while (true) {
            int n = in.nextInt();
            if (n < 0 || n >= drinks.length) {
                System.out.println("Tanlovingiz uchun rahmat.!");
                break;
            } else {
                if (this.drinks.add(drinks[n])) {
                    System.out.println("Ichimklik qo'shildi.!");
                } else System.out.println("Ichimlik qo'shilmadi.!");
            }
            System.out.println("Chiqish uchun boshqa raqam kriting..");
        }
    }

    public void showInfoDeliux() {
        System.out.println("1) Go'sht " + meat);
        System.out.println("2) Non " + bread);
        int i = 0;
        System.out.println("3) Salatlar :");
        for (Salads salad : salads) {
            System.out.println("   " + (i) + ") " + salad);
            i++;
        }
        i = 0;
        System.out.println("4) Ichimliklar");
        for (Drinks drink : drinks) {
            System.out.println(" " + (i) + ") " + drink);
        }
    }

    public int deluxSum() {
        int sum = 0;
        sum += meat.getSum();
        sum += bread.getSum();
        for (Salads salad : salads) {
            if (salad.equals(Salads.Cheese)){
                continue;
            }
            sum += salad.getSum();
        }
        for (Drinks drink : drinks) {
            if (drink.equals(Drinks.Pepse)){
                continue;
            }
            sum += drink.getSum();
        }
        return sum;
    }


}
