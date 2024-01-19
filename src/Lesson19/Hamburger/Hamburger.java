package Lesson19.Hamburger;

import Lesson19.Hamburger.ingredients.Bread;
import Lesson19.Hamburger.ingredients.Meat;
import Lesson19.Hamburger.ingredients.Salads;

import java.util.HashSet;

public class Hamburger {
    private Meat meat;
    private Bread bread;
    private int money_forSalads;
    private HashSet<Enum> salads = new HashSet<>();

    public Hamburger(Meat meat, Bread bread, int money_forSalads) {
        this.meat = meat;
        this.bread = bread;
        this.money_forSalads = money_forSalads;
       Salads[] salads1 =  Salads.values();
        for (Salads salads : salads1) {
            System.out.println(salads);
        }
    }




}
