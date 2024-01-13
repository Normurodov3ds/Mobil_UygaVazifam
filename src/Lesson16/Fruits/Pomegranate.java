package Lesson16.Fruits;

public class Pomegranate extends Fruit {
    public Pomegranate(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    protected void showInfo() {
        System.out.println(super.toString());
    }
}
