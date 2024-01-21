package Lesson19.Hamburger.KingBurgersDB;

import Lesson19.Hamburger.Products.BasProducts;
import Lesson19.Hamburger.Products.Bread;
import Lesson19.Hamburger.Products.Garnir;
import Lesson19.Hamburger.Products.Meat;
import Lesson19.Hamburger.ingredients.BreadE;
import Lesson19.Hamburger.ingredients.MeatE;
import Lesson19.Hamburger.ingredients.SaladsE;

import java.util.ArrayList;
import java.util.List;

public class BurgerDB {
    private static BurgerDB instance = null;
    private List<BasProducts> basProducts = new ArrayList<>();

    private BurgerDB() {
        basProducts.add(new Meat(MeatE.Beef,15_000,10));
        basProducts.add(new Bread(BreadE.BigBread,5_00,10));
        basProducts.add(new Garnir(SaladsE.Cheese,3_000,10));
        basProducts.add(new Garnir(SaladsE.Cabbage,3_000,10));
        basProducts.add(new Garnir(SaladsE.Tomato,3_000,10));
        basProducts.add(new Garnir(SaladsE.Onion,3_000,10));
    }
    public static BurgerDB getInstance() {
        if (instance == null) {
            instance = new BurgerDB();
        }
        return instance;
    }
    public void setBasProducts(List<BasProducts> basProducts){
        for (BasProducts basProduct : this.basProducts) {
            for (BasProducts product : basProducts) {
                if (basProduct.getBread().equals(product.getBread())&&basProduct.getBread()!=null&&product.getBread()!=null){
                    basProduct.setCount(product.getCount());
                }else if (basProduct.getMeat().equals(product.getMeat())&&basProduct.getMeat()!=null&&product.getMeat()!=null){
                    basProduct.setCount(product.getCount());
                }
            }
        }
    }

    public List<BasProducts> getBasProducts() {
        return basProducts;
    }
}
