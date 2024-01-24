package Lesson20.massaliqlar.Baza;

import Lesson20.massaliqlar.Masaliqlar;

import java.util.ArrayList;
import java.util.List;

public class Baza {
    private static Baza baza = null;
   private List<Masaliqlar> masaliqlars = new ArrayList<>();

    private Baza() {
      masaliqlars.add(new )
    }
    public static Baza getInstance(){
        if (baza==null){
            baza = new Baza();
        }
        return baza;
    }
}
