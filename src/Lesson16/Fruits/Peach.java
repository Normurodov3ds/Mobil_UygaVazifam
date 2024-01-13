package Lesson16.Fruits;

public class Peach extends Fruit {
    public Peach(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    protected void showInfo() {
        System.out.println(super.toString());
    }

}
