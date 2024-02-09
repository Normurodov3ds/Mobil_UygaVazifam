package Hamburger.Indregents;

import Hamburger.Indregents.Drincks.Drincks;
import Hamburger.Indregents.Garner.Garners;
import Hamburger.Indregents.Meat.Meat;
import Hamburger.Indregents.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    private static ProductDB productDB = null;
    private static List<Masalliq> masalliqs = new ArrayList<>();

    public ProductDB() {
        masalliqs.add(new Masalliq(Product.AmericanBread, 4, 5_000));
        masalliqs.add(new Masalliq(Meat.Beef, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Cabbage, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Cheese, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Chili, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Onion, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Tomato, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Cucumber, 4, 5_000));
        masalliqs.add(new Masalliq(Drincks.Pulsar, 4, 5_000));
        masalliqs.add(new Masalliq(Drincks.Fanta, 4, 5_000));
        masalliqs.add(new Masalliq(Drincks.Pepse, 4, 5_000));
        masalliqs.add(new Masalliq(Drincks.Sarbast, 4, 5_000));
        masalliqs.add(new Masalliq(Drincks.Tarxun, 4, 5_000));
        masalliqs.add(new Masalliq(Drincks.Vino, 4, 5_000));
    }
    public static ProductDB getProductDB() {
        if (productDB == null) {
            productDB = new ProductDB();
        }
        return productDB;
    }

    public  List<Masalliq> getMasalliqs() {
        return masalliqs;
    }
    public static void addProducts(List<Masalliq> masalliq1){
        for (Masalliq masalliq : masalliq1) {
            for (Masalliq masalliq2 : masalliqs) {
                if (masalliq.getGarners()==(masalliq2.getGarners())&&masalliq.getGarners()!=null){
                    masalliqs.get(masalliqs.indexOf(masalliq2)).setCount(masalliq.getCount());

                } else if (masalliq.getDrincks()==(masalliq2.getDrincks())&&masalliq.getDrincks()!=null){
                    masalliqs.get(masalliqs.indexOf(masalliq2)).setCount(masalliq.getCount());
                }
               else if (masalliq.getProduct()==(masalliq2.getProduct())&&masalliq.getProduct()!=null){
                    masalliqs.get(masalliqs.indexOf(masalliq2)).setCount(masalliq.getCount());

                }
            }
        }
    }
}
