package Lesson16.Car;

public class Main {
    public static void main(String[] args) {
        Car car = Car.getCar("Malibu",80,20);
        Car car1 = Car.getCar("Cobalt",60,35);

        System.out.println(car.isActiv());
        System.out.println(car.refuel(0));
        System.out.println(car.maxWay());

        System.out.println();

        System.out.println(car1.isActiv());
        System.out.println(car1.refuel(0));
        System.out.println(car1.maxWay());

        System.out.println();
        System.out.println(car.getName());
        System.out.println(car1.getName());
    }
}
