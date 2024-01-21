package Lesson19.Hamburger.Products;

import Lesson19.Hamburger.ingredients.SaladsE;

public class Garnir extends BasProducts{
    public Garnir(SaladsE garnir, int price, int count) {
        super(garnir, price, count);
    }

    public Garnir(SaladsE garnir, int count) {
        super(garnir, count);
    }
}
