package Lesson16.Students;

import Lesson16.Students.Location.Location;

public class Unversty {
    private String name;
    private Location location;

    private Unversty(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    private String getName() {
        return name;
    }

    private Location getLocation() {
        return location;
    }

    static class Student{
        private String name;
        private String lastName;
        private int curse;
        private Unversty unversty;
        public Student(String name, String lastName, int curse,String unvrName,Location location) {
            this.name = name;
            this.lastName = lastName;
            this.curse = curse;
            this.unversty = new Unversty(unvrName,location);
        }

        public void showInfo(){
            System.out.println("Unvewstet{"+this.unversty.getName()+"}");
            System.out.println("Location= { "+unversty.getLocation().toString()+"}");
            System.out.println("Student{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", curse=" + curse +
                    ""+
                    '}');
        }


    }

}
