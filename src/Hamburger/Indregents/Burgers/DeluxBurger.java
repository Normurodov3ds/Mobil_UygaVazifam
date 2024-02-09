package Hamburger.Indregents.Burgers;

import Hamburger.Indregents.Garner.Garners;
import Hamburger.Indregents.Masalliq;
import Hamburger.Indregents.Meat.Meat;
import Hamburger.Indregents.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class DeluxBurger implements FatherBurger {

    private List<Masalliq> masalliqs = new ArrayList<>();

    public DeluxBurger() {
        masalliqs.add(new Masalliq(Product.AmericanBread, 4, 5_000));
        masalliqs.add(new Masalliq(Meat.Beef, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Cabbage, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Cheese, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Chili, 4, 5_000));
        masalliqs.add(new Masalliq(Garners.Onion, 4, 5_000));
    }

    public List<Masalliq> getMasalliqs() {
        return masalliqs;
    }

    public DeluxBurger(List<Masalliq> masalliqs) {
        for (Masalliq masalliq : masalliqs) {
            this.masalliqs.add(masalliq);
        }
    }

    public int getSumm() {
        int sum = 0;
        for (Masalliq masalliq : masalliqs) {
            sum += masalliq.getPrice();
        }
        return sum;
    }
}

