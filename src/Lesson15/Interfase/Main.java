package Lesson15.Interfase;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Komil",45,26,38);
        Student student1 = new Student("Sarvar",15,35,40,45);
        A a = new A(student);
        B b = new B(student1);
        System.out.print(a.name);
        System.out.printf(": %.1f%n",a.getball());
        System.out.print(b.name);
        System.out.printf(": %.1f",b.getball());
    }
}
