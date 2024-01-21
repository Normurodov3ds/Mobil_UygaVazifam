package Lesson19.Hamburger.Products;

import Lesson19.Hamburger.ingredients.MeatE;

public class Meat extends BasProducts {
    public Meat(MeatE meat, int price, int count) {
        super(meat, price, count);
    }

    public Meat(MeatE meat, int count) {
        super(meat, count);
    }
}
