package Lesson15.Interfase;

public class Student {
    protected String name;
    protected float a;
    protected float b;
    protected float c;
    protected float d;

    public Student(String name, float a, float b, float c, float d) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Student(String name, float a, float b, float c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
