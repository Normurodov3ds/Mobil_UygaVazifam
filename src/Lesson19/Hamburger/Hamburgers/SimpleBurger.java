package Lesson19.Hamburger.Hamburgers;

import Lesson19.Hamburger.Products.BasProducts;
import Lesson19.Hamburger.ingredients.SaladsE;

import java.util.ArrayList;
import java.util.List;

public class SimpleBurger implements Hamburger {
    private int count;
    List<BasProducts> basProducts = new ArrayList<>();

    public SimpleBurger(int count, SaladsE saladsE) {
        this.count = count;

    }

    public SimpleBurger(int count) {
        this.count = count;
    }
}
