package Lesson13.uygavazifa1;

public class Milk {
    private double milk;
    private  double sum;

    public Milk(double milk, double sum) {
        this.milk = milk;
        this.sum = sum;
    }

    public Milk(Milk milk) {
    }
    public Milk(){

    }

    public double getMilk() {
        return milk;
    }

    public double getSum() {
        return sum;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
