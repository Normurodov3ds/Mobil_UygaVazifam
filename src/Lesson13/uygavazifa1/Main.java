package Lesson13.uygavazifa1;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(80,2000);
        Sugar sugar = new Sugar(120,6000);
        Retsept retsept = new Retsept(2,1);
        Prise prise = new Prise(0.2,2000);
        IceCream iceCream = new IceCream(retsept,prise);
        iceCream.addMilk(milk);
        iceCream.addSugar(sugar);
        System.out.println("men "+iceCream.count()+" ta muzqaymoq tayorlay olaman.!");
        System.out.print("muzqaymoq sota olamanmi? :"+iceCream.buy(5));
        iceCream.buy(25);
        iceCream.buy(10);
        iceCream.buy(12);
        iceCream.buy(12);
        System.out.println();
        System.out.println("mening ballansim "+iceCream.getBallanse());
        System.out.print("muzqaymoq tayyorlay olamanmi ? :"+iceCream.hasIcream());
        System.out.println();
        iceCream.getInfo();

    }
}
