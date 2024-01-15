package Lesson16.Anonymus.Anonims;

import Lesson16.Anonymus.Anonims.Anonymus;

public class Main {
    public static void main(String[] args) {
        Anonymus anonymus = Anonymus.getInstance();

        System.out.println(anonymus.show());

        Anonymus anonymus1 = Anonymus.getInstance();

        System.out.println(anonymus1.show());

    }
}
