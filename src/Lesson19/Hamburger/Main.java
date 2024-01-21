package Lesson19.Hamburger;
import Lesson19.Hamburger.KingBurgersDB.BurgerDB;
import Lesson19.Hamburger.Products.BasProducts;
import Lesson19.Hamburger.Products.Garnir;
import Lesson19.Hamburger.ingredients.SaladsE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BurgerDB burgerDB =  BurgerDB.getInstance();
        boolean choseBurger = true;
        boolean notChoseburger = true;
        while (notChoseburger){
            if (choseBurger){
            System.out.println("Burger tanlang.!");
            System.out.println("1) Simple Burger 2) Other Burgers 3) Quit");
            choseBurger= false;
            }else {
                System.out.println("Burger yana tanlayzimi?");
                System.out.println("1) Simple Burger 2) Other Burgers 3) Quit");
            }
            switch (in.nextInt()){
                case 1->{
                    System.out.println("Nechta olasiz?");
                    int count = in.nextInt();


                }
                case 2->{

                }
                case 3->{
                    notChoseburger = false;
                    System.out.println("Siz tizimdan chiqdingiz.!");
                }
            }
        }



    }
    private  static List<Garnir> burgerChoseGarner(BurgerDB burgerDB, int count){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " - Burger");
            System.out.println("Garner tanlaysizmi?");
            System.out.println("1) Ha 2) Yoq");
            while (true) {
                switch (in.nextInt()) {
                    case 1 -> {
                        List<SaladsE> garnirs = new ArrayList<>();
                        for (BasProducts basProduct : burgerDB.getBasProducts()) {
                            if (basProduct.getGarnir() != null) {
                                garnirs.add(basProduct.getGarnir());
                            }
                        }
                        int l = 0;
                        for (SaladsE garnir : garnirs) {
                            System.out.println(l+") "+garnir);
                        }
                        int index = in.nextInt();
                        List<Garnir> garnirs1 = new ArrayList<>();
                        SaladsE garnir = garnirs.get(index);
                    }
                }

            }
        }
        return new ArrayList<>();
    }
}
