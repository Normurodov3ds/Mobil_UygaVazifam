package Lesson17;

public class Main {
    public static void main(String[] args) {
        Abs abs = Abs.getInstance();
        Abs ds = Abs.getInstance();

        System.out.println(abs.equals(ds));

    }
}

