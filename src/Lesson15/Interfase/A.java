package Lesson15.Interfase;

public class A extends Student implements Ballar {
    public A(Student student) {
        super(student.name, student.a, student.b, student.c);
    }

    @Override
    public double getball() {
        return ((super.a+super.b+super.c)/3)*2;
    }
}
