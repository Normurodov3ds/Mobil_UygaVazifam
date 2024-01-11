package Lesson14.Remote_Car;

public class Main {
    public static void main(String[] args) {
        Battary battary = new Battary(2.5);
        Car car = new Car(4,3.4);
        System.out.println(car.add(battary));
        System.out.println(car.add(battary));
        System.out.println(car.add(battary));
        System.out.println(car.add(battary));
        System.out.println(car.add(battary));
        System.out.println(car.run(2));
        car.ShowInfio();
    }
}
