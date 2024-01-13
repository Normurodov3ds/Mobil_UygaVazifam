package Lesson16.Fruits;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final double maxWeight;

    public Basket(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    List<Fruit> fruits = new ArrayList<>();

    public boolean addFruit(Fruit fruit) {
        if (getImptySize() < fruit.getWeight() || !fruit.contains(fruits)) {
            return false;
        }
        fruits.add(fruit);
        return true;
    }

    public boolean addFruit(Fruit[] fruits) {
        boolean b = false;
        for (Fruit fruit : fruits) {
            if (fruit.contains(this.fruits) && fruit.getWeight() <= (maxWeight - getImptySize())) {
                this.fruits.add(fruit);
                b = true;
            }
        }
        return b;

    }

    private double getImptySize() {
        double sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.getWeight();
        }
        return maxWeight - sum;
    }

    public void showInfo() {
        for (Fruit fruit : fruits) {
            System.out.println("===========");
            System.out.println("meva : " + fruit.getName());
            System.out.println("massa: " + fruit.getWeight() + " kg");
            System.out.println("rangi : " + fruit.getColor());
        }
    }

    public boolean isImpty() {
        return fruits.size() == 0;
    }

    public boolean isFull() {
        return getImptySize() == maxWeight;
    }
    public double getImptySizes(){
        return maxWeight-getImptySize();
    }

}
