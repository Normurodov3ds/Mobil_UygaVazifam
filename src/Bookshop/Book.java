package Bookshop;

public class Book {
    private  String name;
    private  int cost;
    private int sum;
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

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int  getSum() {
        return sum;
    }
}
