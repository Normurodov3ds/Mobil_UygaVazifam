package Lesson18.Collecton;

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

    public String getLastNmae() {
        return lastNmae;
    }

    public int getAge() {
        return age;
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
