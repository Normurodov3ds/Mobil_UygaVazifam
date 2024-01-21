package Lesson19.Hamburger.Products;

import Lesson19.Hamburger.ingredients.DrinksE;

public class Drinks extends BasProducts{
    public Drinks(DrinksE drinks, int price, int count) {
        super(drinks, price, count);
    }

    public Drinks(DrinksE drinks, int count) {
        super(drinks, count);
    }
}
