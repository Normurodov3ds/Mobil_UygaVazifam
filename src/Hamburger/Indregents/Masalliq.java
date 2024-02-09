package Hamburger.Indregents;

import Hamburger.Indregents.Drincks.Drincks;
import Hamburger.Indregents.Garner.Garners;
import Hamburger.Indregents.Meat.Meat;
import Hamburger.Indregents.Product.Product;

public class Masalliq {
    private Garners garners;
    private Product product;
    private Drincks drincks;
    private Meat meat;
    private int count;
    private  int price;

    public Masalliq(Garners garners, int count, int price) {
        this.garners = garners;
        this.count = count;
        this.price = price;
    }

    public Masalliq(Product product, int count, int price) {
        this.product = product;
        this.count = count;
        this.price = price;
    }

    public Masalliq(Drincks drincks, int count, int price) {
        this.drincks = drincks;
        this.count = count;
        this.price = price;
    }

    public Masalliq(Meat meat, int count, int price) {
        this.meat = meat;
        this.count = count;
        this.price = price;
    }

    public Masalliq(Meat meat) {
        this.meat = meat;
    }

    public Garners getGarners() {
        return garners;
    }

    public Product getProduct() {
        return product;
    }

    public Drincks getDrincks() {
        return drincks;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public void setGarners(Garners garners) {
        this.garners = garners;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setDrincks(Drincks drincks) {
        this.drincks = drincks;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Masalliq{" +
                "garners=" + garners +
                ", product=" + product +
                ", drincks=" + drincks +
                ", meat=" + meat +
                ", count=" + count +
                ", price=" + price +
                '}';
    }



}
