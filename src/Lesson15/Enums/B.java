package Lesson15.Enums;

public class B extends Ballar{
    private double a;
    private double b;
    private double c;
    private double d;

    public B(double a, double b, double c, double d,String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        super.neame = name;
    }

    @Override
    public double getprastage() {

        return ((a+b+c+d)/4)*2;
    }
}
