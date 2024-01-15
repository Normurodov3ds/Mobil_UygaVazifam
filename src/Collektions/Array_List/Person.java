package Collektions.Array_List;

public class Person implements Comparable {
    private String name;
    private byte age;
    private char ch;

    public Person(String name, byte age, char ch) {
        this.name = name;
        this.age = age;
        this.ch = ch;
    }


    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public char getCh() {
        return ch;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ch=" + ch +
                '}';
    }
}
