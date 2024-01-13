package Lesson16.Fruits;

public class Apple extends Fruit{

    public Apple(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public void showInfo() {
        System.out.println(super.toString());
    }

}
