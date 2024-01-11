package Lesson13;

import java.util.Random;

public class MathOperation {
    static String randomMth(int a) {
        Random random = new Random();

        int b;
        int c;

        b = random.nextInt(a) + 1;
        c = random.nextInt(a) + 1;

        int s = random.nextInt(4) + 1;
        switch (s) {
            case 1: {

                return b + " * " + c + " - " + s + " = " + (b * c - s);
            }
            case 2: {
                return b + " + " + c + " - " + s + " = " + (b + c - s);
            }
            case 3: {

                return b + " + " + c + " = " + (b + c);
            }
            case 4: {

                return b + " - " + c + " = " + (b - c);
            }

            default:
                return "0";
        }

    }
}
