package Hamburger;

import Hamburger.Indregents.Burgers.*;
import Hamburger.Indregents.Masalliq;
import Hamburger.Indregents.ProductDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductDB productDB = ProductDB.getProductDB();
        // ProductDB.addProducts(); -> product qo'shish
        boolean b = true;
        Scanner in = new Scanner(System.in);
        while (b) {
            System.out.println("Burger Market");
            System.out.println("1) Burgerlar 2) Ichimliklar 3) Chiqish");
            switch (in.nextInt()) {
                case 1 -> {
                    System.out.println("Burger tanlang");
                    System.out.println("1) Simple Burger 2) Delux Burger 3) Healty Burger");
                    switch (in.nextInt()) {
                        case 1 -> {
                            // simpe
                            SimpleBurger simpleBurger = new SimpleBurger();
                            System.out.println("Sizning burgeringiz: SimpleBurger");
                            System.out.print("Nechta olasiz: ");
                            int count = in.nextInt();
                            for (int i = 0; i < count; i++) {
                                System.out.println((i + 1) + "- Qo'shimcha qo'shasizmi?");
                                System.out.println("1) Ha 2) Yo'q");
                                if (in.nextInt() == 1) {
                                    SimpleBurger simpleBurger1 = new SimpleBurger(choseProduct(simpleBurger.getMasalliqs(), productDB.getMasalliqs()));
                                    System.out.println("Burgeringiz tayyor: SimpleBurger+");
                                    System.out.println(simpleBurger1.getSumm() + " so'm");
                                    burgerinfo(simpleBurger);
                                } else {
                                    System.out.println("Burgeringiz tayyor: SimpleBurger");
                                    System.out.println(simpleBurger.getSumm() + " so'm");
                                    burgerinfo(simpleBurger);
                                }
                            }
                        }
                        case 2 -> {
                            //deluxe

                            DeluxBurger deluxBurger = new DeluxBurger();
                            System.out.println("Sizning burgeringiz: SimpleBurger");
                            System.out.print("Nechta olasiz: ");
                            int count = in.nextInt();
                            for (int i = 0; i < count; i++) {
                                System.out.println((i + 1) + "- Qo'shimcha qo'shasizmi?");
                                System.out.println("1) Ha 2) Yo'q");
                                if (in.nextInt() == 1) {
                                    DeluxBurger deluxBurger1 = new DeluxBurger(choseProduct(deluxBurger.getMasalliqs(), productDB.getMasalliqs()));
                                    System.out.println("Burgeringiz tayyor: DeluxBurger +");
                                    System.out.println(deluxBurger1.getSumm() + " so'm");
                                    burgerinfo(deluxBurger1);
                                } else {
                                    System.out.println("Burgeringiz tayyor: SimpleBurger");
                                    System.out.println(deluxBurger.getSumm() + " so'm");
                                    burgerinfo(deluxBurger);
                                }
                            }
                        }
                        case 3 -> {
                            // heality
                            HealtyBurger healtyburger = new HealtyBurger();
                            System.out.println("Sizning burgeringiz: SimpleBurger");
                            System.out.print("Nechta olasiz: ");
                            int count = in.nextInt();
                            for (int i = 0; i < count; i++) {
                                System.out.println((i+1)+"- Qo'shimcha qo'shasizmi?");
                                System.out.println("1) Ha 2) Yo'q");
                                if (in.nextInt() == 1) {
                                    HealtyBurger healtyburger1 = new HealtyBurger(choseProduct(healtyburger.getMasalliqs(), productDB.getMasalliqs()));
                                    System.out.println("Burgeringiz tayyor: DeluxBurger +");
                                    System.out.println(healtyburger1.getSumm() + " so'm");
                                } else {
                                    System.out.println("Burgeringiz tayyor: SimpleBurger");
                                    System.out.println(healtyburger.getSumm() + " so'm");
                                }
                            }
                        }
                    }
                }
                case 2 -> {
                    // ichimlik qoshish
                    Dirinck dirinck = new Dirinck(adddrincks(productDB));
                    System.out.println(dirinck.getSumm() + " so'm");

                }
                case 3 -> {
                    b = false;
                }
            }
        }


    }

    public static List<Masalliq> choseProduct(List<Masalliq> masalliqs, List<Masalliq> productDB) {
        boolean b = true;
        Scanner in = new Scanner(System.in);
        while (b) {
            System.out.println("Salat qo'shasizmi o'zgartirasizmi?");
            System.out.println("1) o'zgartiramiz 2) qo'shamiz 3) chiqish");
            switch (in.nextInt()) {
                case 1 -> {
                    System.out.println("Tanlang.!");
                    int i = 0;
                    for (Masalliq masalliq : masalliqs) {
                        if (masalliq.getGarners() != null) {
                            System.out.println((i) + ") " + masalliq.getGarners() + " " + masalliq.getPrice() + " so'm");
                            i++;
                        }
                    }
                    int index = in.nextInt();
                    int l = 0;
                    for (Masalliq masalliq : productDB) {
                        if (masalliq.getGarners() != null && masalliq.getCount() > 0) {
                            System.out.println((l) + ") " + masalliq.getGarners() + " " + masalliq.getPrice() + " so'm");
                            l++;
                        }
                    }
                    int index1 = in.nextInt();
                    i = 0;
                    for (Masalliq masalliq : masalliqs) {
                        if (masalliq.getGarners() != null) {
                            if (index == i) {
                                masalliqs.remove(masalliq);
                                break;
                            }
                            i++;
                        }
                    }
                    l = 0;
                    for (Masalliq masalliq : productDB) {
                        if (masalliq.getGarners() != null && masalliq.getCount() > 0) {
                            if (l == index1) {
                                masalliqs.add(productDB.get(l));
                                productDB.get(l).setCount(-1);
                                break;
                            }
                            l++;
                        }
                    }

                }
                case 2 -> {
                    int l = 0;
                    System.out.println("Tanlang.!");
                    for (Masalliq masalliq : productDB) {
                        if (masalliq.getGarners() != null && masalliq.getCount() > 0) {
                            System.out.println((l) + ") " + masalliq.getGarners() + " " + masalliq.getPrice() + " so'm");
                            l++;
                        }
                    }
                    int index2 = in.nextInt();
                    l = 0;
                    for (Masalliq masalliq : productDB) {
                        if (masalliq.getGarners() != null && masalliq.getCount() > 0) {
                            if (l == index2) {
                                masalliqs.add(productDB.get(l));
                                productDB.get(l).setCount(-1);
                                break;
                            }
                            l++;
                        }
                    }
                }
                case 3 -> {
                    b = false;
                }
            }
        }
        return masalliqs;
    }

    private static List adddrincks(ProductDB productDB) {
        Scanner in = new Scanner(System.in);
        List<Masalliq> masalliqs = new ArrayList<>();
        while (true) {
            System.out.println("Ichimlik Tanlang!");
            System.out.println("-1" + " chiqish");
            int i = 0;
            for (Masalliq masalliq : productDB.getMasalliqs()) {
                if (masalliq.getDrincks() != null && masalliq.getCount() > 0) {
                    System.out.println((i) + " " + masalliq.getDrincks() + " " + masalliq.getPrice() + " so'm");
                    i++;

                }
            }
            int index = in.nextInt();

            if (index == -1) {
                break;
            } else {
                masalliqs.add(productDB.getMasalliqs().get(index));
            }
        }
        return masalliqs;
    }
    public static void burgerinfo(FatherBurger fatherBurger) {
        SimpleBurger simpleBurger = (SimpleBurger) fatherBurger;

        for (Masalliq masalliq : simpleBurger.getMasalliqs()) {
            System.out.println(masalliq);
        }
    }


}
