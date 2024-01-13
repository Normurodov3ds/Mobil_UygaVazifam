package Lesson16.Fruits;

import java.util.List;

public abstract class  Fruit {
    private String name;
    private String color;
    private double weight;
    protected abstract void showInfo();

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "meva {" +
                " nomi = " + name + '\'' +
                ", rangi = " + color + '\'' +
                ", massasi = " + weight +" kg"+
                '}';
    }
    public boolean contains(List<Fruit> fruit){
        boolean b = true;
        for (Fruit fruit1 : fruit) {
            if (fruit1.getName().equalsIgnoreCase(this.getName())){
                b = false;
            }
        }
        return b;
    }

}
