package bilet5;

public class bilet5Main {
    public static void main(String[] args) {
        MaKeIceCream iceCream=new MaKeIceCream(800, 700);
        iceCream.addMilk(300);
        iceCream.addSugar(300);
        System.out.println(iceCream.maxIceCreamCount(30, 50));
        iceCream.showInfo();
    }
}
