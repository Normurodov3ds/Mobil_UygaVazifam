package Lesson15.Interfase;

public class B extends Student implements Ballar{

    public B(Student student) {
        super(student.name, student.a, student.b, student.c, student.d);
    }

    @Override
    public double getball() {
        return ((super.a+super.b+super.c+super.d)/4)*2;
    }
}
