package Lesson20.massaliqlar;

import Lesson20.massaliqlar.Baza.Baza;

import java.util.ArrayList;
import java.util.List;

public class DeluxBur {
    private List<Masaliqlar> masaliqlars = new ArrayList<>();
    public DeluxBur() {
        masaliqlars.add(new Masaliqlar(Masaliq.AmericanBread,1,5_000));
        masaliqlars.add(new Masaliqlar(Masaliq.Beef,1,15_000));
        masaliqlars.add(new Masaliqlar(Masaliq.Cucumber,1,3_000));
        masaliqlars.add(new Masaliqlar(Masaliq.Cheese,1,4_000));
        masaliqlars.add(new Masaliqlar(Masaliq.Chili,1,2_000));
        masaliqlars.add(new Masaliqlar(Masaliq.Cabbage,1,1_000));
    }
    public DeluxBur(List<Masaliqlar> masaliq) {
        for (Masaliqlar masaliqlar : masaliq) {
            masaliqlars.add(masaliqlar);
        }
    }

    public List<Masaliqlar> getMasaliqlars() {
        return masaliqlars;
    }
    public int getSum(){


        int sum = 0;
        for (Masaliqlar masaliqlar : masaliqlars) {
            sum+=masaliqlar.getPrise();
        }
        return sum;
    }
}
