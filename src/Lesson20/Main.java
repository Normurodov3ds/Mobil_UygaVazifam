package Lesson20;

import Lesson20.massaliqlar.Baza.Baza;
import Lesson20.massaliqlar.DeluxBur;
import Lesson20.massaliqlar.HealtyBurg;
import Lesson20.massaliqlar.Masaliqlar;
import Lesson20.massaliqlar.SimpleBur;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Baza baza = Baza.getInstance();
        Scanner in = new Scanner(System.in);

        boolean b =true;
        while (b) {
            System.out.println("Gamburger tanlaysizmi.?");
            System.out.println("1) Ha 2) Yo'q 3) Chiqish");
            switch (in.nextInt()) {
                case 1 -> {
                    System.out.println("1) SimpleBurger 2) Boshqa 3) Bekorqilish");
                    switch (in.nextInt()) {
                        case 1 -> {
                            System.out.println("massaliq tanlaysizmi?");
                            System.out.println("1) Ha 2) Yo'q");
                            SimpleBur simpleBur = new SimpleBur();
                            if (in.nextInt() == 1) {
                            SimpleBur simpleBur1 = new SimpleBur(choseM(simpleBur.getMasaliqlars(),baza.getMasaliqlars()));
                                System.out.println("summa : "+simpleBur1.getSum()+" so'm");
                            } else {
                                System.out.println("summa : "+simpleBur.getSum()+" so'm");
                            }
                        }
                        case 2 -> {
                            System.out.println("Burgerlar :");
                            System.out.printf("1) DeluxeBurger 2) Healty Burger");
                            switch (in.nextInt()) {
                                case 1 -> {
                                    // deluxe burgr

                                    System.out.println("massaliq tanlaysizmi?");
                                    System.out.println("1) Ha 2) Yo'q");
                                    DeluxBur deluxBur  = new DeluxBur();
                                    if (in.nextInt() == 1) {
                                        DeluxBur deluxBur1 = new DeluxBur(choseM(deluxBur.getMasaliqlars(),baza.getMasaliqlars()));
                                        System.out.println("summa : "+deluxBur1.getSum()+" so'm");
                                    } else {
                                        System.out.println("summa : "+deluxBur.getSum()+" so'm");
                                    }
                                }
                                case 2 -> {
                                    // heality burger
                                    System.out.println("massaliq tanlaysizmi?");
                                    System.out.println("1) Ha 2) Yo'q");
                                    HealtyBurg healtyBurg = new HealtyBurg();
                                    if (in.nextInt() == 1) {
                                        HealtyBurg healtyBurg1 = new HealtyBurg(choseM(healtyBurg.getMasaliqlars(),baza.getMasaliqlars()));
                                        System.out.println("summa : "+healtyBurg1.getSum()+" so'm");
                                    } else {
                                        System.out.println("summa : "+healtyBurg.getSum()+" so'm");
                                    }
                                }

                            }
                        }
                        case 3 -> {
                            System.out.println("Siz dasturdan chiqdingiz.!");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("nechta olasiz?"); // simple burger
                }
                case 3 -> {
                    b = false;
                    System.out.println("siz dasturdan chiqdingiz.! ");
                }
            }
            for (Masaliqlar masaliqlar : baza.getMasaliqlars()) {
                System.out.println(masaliqlar);
            }
        }
    }

    public static List<Masaliqlar> choseM(List<Masaliqlar> masaliqlars,List<Masaliqlar> baza) {
        Scanner in = new Scanner(System.in);
        System.out.println("Siztanlagan burger masalliqlari.!");
        int i = 0;
        for (Masaliqlar masaliqlar : masaliqlars) {
            System.out.println((i) + " " + masaliqlar.getMasaliq() + " 1 dona " + masaliqlar.getPrise());
            i++;
        }
        boolean b = true;
        while (b) {
            System.out.println("1) O'zgartirasizmi 2) Qo'shasizmi ? 3) Tugatish ");
            switch (in.nextInt()) {
                case 1 -> {
                    System.out.println("o'zgartirmoqchi bo'lgan salatni tanlang");
                    int index = in.nextInt();
                    int l = 0;
                    for (Masaliqlar masaliqlar : baza) {
                        System.out.println((l)+" "+masaliqlar.getMasaliq()+" "+masaliqlar.getPrise()+" so'm");
                        l++;
                    }
                    System.out.println("qo'shmoqchi bo'lgan salatni tanlang.!");
                    int index1 = in.nextInt();
                    if (!masaliqlars.contains(baza.get(index1))&&baza.get(index1).getCount()>0){
                        masaliqlars.remove(index);
                        masaliqlars.add(baza.get(index1));
                        baza.get(index1).setCount(-1);}
                    else System.out.println("bu masalliq qo'shilgan yoki qolmagan bolishi mumkin");
                }
                case 2 -> {
                    int l = 0;
                    for (Masaliqlar masaliqlar : baza) {
                        System.out.println((l)+" "+masaliqlar.getMasaliq()+" "+masaliqlar.getPrise()+" so'm");
                        l++;
                    }
                    System.out.println("qo'shmoqchi bo'lgan salatni tanlang.!");
                    int index1 = in.nextInt();
                    if (!masaliqlars.contains(baza.get(index1))&&baza.get(index1).getCount()>0){
                    masaliqlars.add(baza.get(index1));
                    baza.get(index1).setCount(-1);}
                    else System.out.println("bu masalliq qo'shilgan yoki qolmagan bolishi mumkin");
                }
                case 3 -> {
                    b = false;
                }
            }
        }
        return masaliqlars;
    }


}
