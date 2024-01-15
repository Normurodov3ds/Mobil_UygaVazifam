package Lesson16.Students;

import Lesson16.Students.Location.Location;

public class Main {
    public static void main(String[] args) {
        Location location = new Location("O'zbekiston","Toshkent","Amir Temur",70);
        Unversty.Student student = new Unversty.Student("Komil","Normurodov",4,"TATU",location);

        Location location1 = new Location("O'zbekiston","Toshkent","Fargona yo'li",188);
        Unversty.Student student2 = new Unversty.Student("Alisher","Qo'qonov",4,"Amaliy fanlar",location1);

        student.showInfo();
        System.out.println("------------");
        student2.showInfo();
    }
}
