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
        if (b){
            showInfoDeliux();
            addDrincs();
        }
    }
    private void addDrincs(){
        System.out.println("Siz faqat ichimlik qo'shimcha olishingiz mumkin.!");
        Scanner in = new Scanner(System.in);
        Drinks [] drinks = Drinks.values();
        int i = 0;
        for (Drinks drink : drinks) {
            System.out.println(i+") "+drink);
            i++;
        }
        int n = in.nextInt();
        if (n<0||n>=drinks.length){
            System.out.println("hechnarsa qo'shilmadi");
        }else {
            if (this.drinks.add(drinks[n])){
                System.out.println("ichimklik qo'shildi.!");
            }else System.out.println("ichimlik qo'shilmadi.!");
        }
    }

    public void showInfoDeliux(){
        System.out.println(meat);
        System.out.println(bread);
        int i = 0;
        System.out.println("Salatlar :");
        for (Salads salad : salads) {
            System.out.println("  "+(i)+") "+salad);
            i++;
        }
        i =0;
        System.out.println("Ichimliklar");
        for (Drinks drink : drinks) {
            System.out.println(" "+(i)+") "+drink);
        }
    }
    public int DeluxSum(){
        int sum = 0;
        return 0;
    }


}
