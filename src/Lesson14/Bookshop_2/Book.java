package Lesson14.Bookshop_2;

public class Book {
    private  String name;
    private  int cost;
    private int count;

    public Book(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
