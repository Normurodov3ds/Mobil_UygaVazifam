package Lesson16.Anonymus.Student;

public class Main {
    public static void main(String[] args) {
        Student student = Student.getInstance("Abbos","Normuratov",(byte) 22,(byte) 4);
        student.showInfo();
    }
}
