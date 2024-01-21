package Lesson19.Hamburger.Products;

import Lesson19.Hamburger.ingredients.BreadE;
import Lesson19.Hamburger.ingredients.DrinksE;
import Lesson19.Hamburger.ingredients.MeatE;
import Lesson19.Hamburger.ingredients.SaladsE;

public abstract class BasProducts  {
    private MeatE meat;
    private BreadE bread;
    private SaladsE garnir;
    private DrinksE drinks;
    private int price;
    private int count;

    public BasProducts(MeatE meat, int price, int count) {
        this.meat = meat;
        this.price = price;
        this.count = count;
    }

    public BasProducts(BreadE bread, int price, int count) {
        this.bread = bread;
        this.price = price;
        this.count = count;
    }

    public BasProducts(SaladsE garnir, int price, int count) {
        this.garnir = garnir;
        this.price = price;
        this.count = count;
    }

    public BasProducts(DrinksE drinks, int price, int count) {
        this.drinks = drinks;
        this.price = price;
        this.count = count;
    }

    public BasProducts(MeatE meat, int count) {
        this.meat = meat;
        this.count = count;
    }

    public BasProducts(BreadE bread, int count) {
        this.bread = bread;
        this.count = count;
    }

    public BasProducts(SaladsE garnir, int count) {
        this.garnir = garnir;
        this.count = count;
    }

    public BasProducts(DrinksE drinks, int count) {
        this.drinks = drinks;
        this.count = count;
    }

    public MeatE getMeat() {
        return meat;
    }

    public BreadE getBread() {
        return bread;
    }

    public SaladsE getGarnir() {
        return garnir;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setMeat(MeatE meat) {
        this.meat = meat;
    }

    public void setBread(BreadE bread) {
        this.bread = bread;
    }

    public void setGarnir(SaladsE garnir) {
        this.garnir = garnir;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count += count;
    }

}
