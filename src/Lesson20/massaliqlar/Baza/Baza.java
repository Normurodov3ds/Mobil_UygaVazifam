package Lesson20.massaliqlar.Baza;

import Lesson20.massaliqlar.Masaliq;

import Lesson20.massaliqlar.Masaliqlar;

import java.util.ArrayList;
import java.util.List;

public class Baza {
    private static Baza baza = null;
   private List<Masaliqlar> masaliqlars = new ArrayList<>();

    private Baza() {
      masaliqlars.add(new Masaliqlar(Masaliq.AmericanBread,10,5_000));
      masaliqlars.add(new Masaliqlar(Masaliq.BigBread,10,5_000));
      masaliqlars.add(new Masaliqlar(Masaliq.SimpleBread,10,5_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Beef,10,15_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Mutton,10,15_000));
      masaliqlars.add(new Masaliqlar(Masaliq.HorseMeat,10,15_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Onion,10,15_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Cabbage,10,3_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Cheese,10,4_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Chili,10,2_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Cucumber,10,2_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Chips,10,3_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Pepse,10,11_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Fanta,10,8_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Tomato,10,3_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Sarbast,10,18_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Vino,10,22_000));
      masaliqlars.add(new Masaliqlar(Masaliq.Tarxun,10,6_000));


    }
    public static Baza getInstance(){
        if (baza==null){
            baza = new Baza();
        }
        return baza;
    }


    public List<Masaliqlar> getMasaliqlars() {
        return masaliqlars;
    }

    public void addBaza(List<Masaliqlar> masaliqlars){
        for (Masaliqlar masaliqlar : masaliqlars){
            if (this.masaliqlars.contains(masaliqlar) && masaliqlar!=null){
                this.masaliqlars.get(this.masaliqlars.indexOf(masaliqlar)).setCount(masaliqlar.getCount());
            }else if (masaliqlar!=null&&masaliqlar.getCount()!=0){
                this.masaliqlars.add(masaliqlar);
            }
        }
    }


}
