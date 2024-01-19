package Lesson18.Collecton;

import java.util.Objects;

public class SportMan {
    private String name;
    private String lastNmae;
    private int age;

    public SportMan(String name, String lastNmae, int age) {
        this.name = name;
        this.lastNmae = lastNmae;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportMan sportMan = (SportMan) o;
        return age == sportMan.age && Objects.equals(name, sportMan.name) && Objects.equals(lastNmae, sportMan.lastNmae);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastNmae, age);
    }

    @Override
    public String toString() {
        return "SportMan{" +
                "name='" + name + '\'' +
                ", lastNmae='" + lastNmae + '\'' +
                ", age=" + age +
                '}';
    }
}
