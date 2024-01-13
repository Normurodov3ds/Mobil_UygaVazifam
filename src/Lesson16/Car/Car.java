package Lesson16.Car;

public class Car {
    private static Car car = null;
    private final String name;
    private final int maxCapasity;
    private int busiyCapasity;

    private Car(String name, int maxCapasity, int busiyCapasity) {
        this.name = name;
        this.maxCapasity = maxCapasity;
        this.busiyCapasity = busiyCapasity;
    }

    public static Car getCar(String name, int maxCapasity, int busiyCapasity) {
        if (car == null) {
            car = new Car(name, maxCapasity, busiyCapasity);
        }
        return car;
    }

    public boolean isActiv() {
        return busiyCapasity > 0;
    }

    public boolean refuel(int addPetrol) {
        if (maxCapasity == busiyCapasity || maxCapasity - busiyCapasity < addPetrol) {
            return false;
        }
        busiyCapasity += addPetrol;
        return true;
    }

    public int maxWay() {
        int count = 0;
        int max = busiyCapasity;
        while (max != 0) {
            count += 15;
            max--;
        }
        return count;
    }

    public String getName() {
        return name;
    }
}
