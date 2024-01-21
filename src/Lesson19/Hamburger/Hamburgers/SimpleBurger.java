package Lesson19.Hamburger.Hamburgers;

import Lesson19.Hamburger.ingredients.Bread;
import Lesson19.Hamburger.ingredients.Meat;
import Lesson19.Hamburger.ingredients.Salads;

import java.util.ArrayList;

public class SimpleBurger {
    private Meat meat = Meat.Mutton;
    private Bread bread = Bread.SimpleBread;
    private ArrayList<Salads> salads = new ArrayList<>();

    public SimpleBurger() {
        salads.add(Salads.Onion);
        salads.add(Salads.Tomato);
        salads.add(Salads.Cabbage);
        salads.add(Salads.Cheese);
        showInfo();
        System.out.println("Summa :"+getSum());

    }
    private void showInfo(){
        System.out.println("SimpleBurger");
        System.out.println("==============");
        System.out.println("1) "+ "Go'sht "+meat);
        System.out.println("2) "+ "Non "+bread);
        System.out.println("3)"+" Salatlar:");
        int i = 0;
        for (Salads salad : salads) {
            System.out.println("  "+(i)+") "+salad);
            i++;
        }
        System.out.println("==============");
    }
    public int getSum(){
        int sum = 0;
        sum+=meat.getSum();
        sum+=bread.getSum();
        for (Salads salad : salads) {
            sum+=salad.getSum();
        }
        return sum;
    }
}
