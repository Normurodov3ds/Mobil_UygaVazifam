package Lesson19.Hamburger.Products;

import Lesson19.Hamburger.ingredients.BreadE;

public class Bread extends BasProducts{
    public Bread(BreadE bread, int price, int count) {
        super(bread, price, count);
    }

    public Bread(BreadE bread, int count) {
        super(bread, count);
    }
}
