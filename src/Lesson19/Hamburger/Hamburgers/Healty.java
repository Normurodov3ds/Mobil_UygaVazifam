package Lesson19.Hamburger.Hamburgers;

import Lesson19.Hamburger.ingredients.Bread;
import Lesson19.Hamburger.ingredients.Meat;
import Lesson19.Hamburger.ingredients.Salads;
import java.util.HashSet;
import java.util.Scanner;

public class Healty {
    private Meat meat;
    private Bread bread;
    private HashSet<Salads> salads = new HashSet<>();
    private boolean b;

    public Healty(boolean b) {
        this.b = b;
        this.meat = Meat.Beef;
        this.bread = Bread.SimpleBread;
        salads.add(Salads.Cheese);
        salads.add(Salads.Cabbage);
        salads.add(Salads.Chili);
        salads.add(Salads.Tomato);
        if(b){
            Scanner in = new Scanner(System.in);
            System.out.println(" qo'shimcha massaliq qoshasizmi? 1 o'zgartirasizmi ? 2");
            int i = in.nextInt();
            if (i==2){
            editBurger();}
            else {
                addBurgerSalads();
            }
        }
    }
    private  void addBurgerSalads(){
        System.out.println(" Healty burger ");
        System.out.println("==============");
        for (Salads salad : salads) {
            System.out.println(salad+" ");
        }
        System.out.println("==============");
        System.out.println("Salatlarni tanlanag 2 tagacha mahsulot qo'shishingiz mumkin");
        Scanner in = new Scanner(System.in);
        Salads[] array = Salads.values();
        for (Salads salads1 : array) {
            System.out.println((salads1.ordinal())+") "+salads1);
        }

        for (int i = 0; i < 2; i++) {
            int a = in.nextInt();
            if (a<0||a>=array.length){
                break;
            }
            boolean add = salads.add(array[a]);
            if (add){
                System.out.println("Massaliq qo'shildi.! "+add);
            }else {
                System.out.println("Burgerda bu massaliq bor.! "+add);
            }

        }

    }
    private  void editBurger(){
        Scanner in = new Scanner(System.in);

        System.out.println("Healty burger ");

        int index = 0;
        for (Salads salad : salads) {
            System.out.println(salad+" "+index++);
        }
        System.out.println("Salatlarni tanlanag 2 tagacha mahsulot o'zgartirishingiz mumkin");
        Salads[] array = Salads.values();
        for (Salads salads1 : array) {
            System.out.println(salads1+" "+(salads1.ordinal()));
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("olib tashlamoqchi bo'lhan salatingiz ni tanlang");
            int a = in.nextInt();
            System.out.println("qo'shmoqchi bo'lgansalatingizni tanlang");
            int b = in.nextInt();
            if (a<0||a>=array.length){
                break;
            }
            salads.remove(array[a]);
           boolean add = salads.add(array[b]);
           if (add){
               System.out.println("Massaliq qo'shildi.! "+add);
           }else {
               System.out.println("Burgerda bu massaliq bor.! "+add);
           }
        }

    }


}
