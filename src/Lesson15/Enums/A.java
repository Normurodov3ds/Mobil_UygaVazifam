package Lesson15.Enums;

public class A  extends Ballar{
    private double a;
    private double b;
    private double c;

    public A(double a, double b, double c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        super.neame = name;
    }

    @Override
    public double getprastage() {
        return ((a+b+c)/3)*2;
    }
}
