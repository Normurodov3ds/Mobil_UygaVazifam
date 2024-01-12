package Lesson15.Hayvonlar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String s = in.nextLine();
            Animals animals = Animals.valueOf(s);
            animals.vois();
        }
    }
}
