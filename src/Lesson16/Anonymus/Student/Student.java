package Lesson16.Anonymus.Student;

public class Student {
    private String name;
    private String lastName;
    private byte age;
    private byte curse;

    private Student(String name, String lastName, byte age, byte curse) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.curse = curse;
    }

    public  static  Student getInstance(String name,String lastName,byte age,byte curse){
        return new Student(name,lastName,age,curse);
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(curse);
    }
}
