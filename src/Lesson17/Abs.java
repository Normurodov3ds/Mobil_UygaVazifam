package Lesson17;

public class Abs {
    private static Abs a = null;

    private Abs() {

    }
    public static Abs getInstance() {
        if (a == null) {
            a = new Abs();
        }
        return a;
    }
}
