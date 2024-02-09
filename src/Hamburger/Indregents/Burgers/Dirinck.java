package Hamburger.Indregents.Burgers;

import Hamburger.Indregents.Drincks.Drincks;
import Hamburger.Indregents.Masalliq;

import java.util.ArrayList;
import java.util.List;

public class Dirinck implements FatherBurger {
    private List<Masalliq> drincks = new ArrayList<>();

    public Dirinck(List<Masalliq> drincks) {
        for (Masalliq drinck : drincks) {
            this.drincks.add(drinck);
        }
    }
    public int getSumm(){
        int sum = 0;
        for (Masalliq masalliq : drincks) {
            sum+=masalliq.getPrice();
        }
        return sum;
    }
}
