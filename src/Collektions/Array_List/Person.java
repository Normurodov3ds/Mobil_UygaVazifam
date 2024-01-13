package Collektions.Array_List;

public class Person implements Comparable<Person> {
    private String name;
    private byte age;
    private char ch;

    public Person(String name, byte age, char ch) {
        this.name = name;
        this.age = age;
        this.ch = ch;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ch=" + ch +
                '}';
    }
}
