package Lesson16.Fruits;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("olma","qizil",2);
        Peach peach = new Peach("shaftoli","sariq",3);
        Pomegranate pomegranate = new Pomegranate("anor","qizil",2);
        apple.showInfo();
        peach.showInfo();
        pomegranate.showInfo();
        Basket basket = new Basket(25);
        System.out.println(basket.addFruit(apple));
        System.out.println(basket.addFruit(peach));
        System.out.println(basket.addFruit(pomegranate));
        basket.showInfo();
        System.out.println(basket.isFull());
        System.out.println(basket.isImpty());
        System.out.println(basket.getImptySizes()+" savatdagi mevalar massai");


    }
}
