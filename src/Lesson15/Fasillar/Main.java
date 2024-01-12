package Lesson15.Fasillar;

import Lesson15.Fasillar.Fasil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        while (true) {
            switch (in.nextLine()) {
                case "BAHOR": {
                    Fasil fasil = Fasil.BAHOR;
                    fasil.oy(3);
                }
                break;
                case "YOZ": {
                    Fasil fasil = Fasil.YOZ;
                    fasil.oy(6);
                }
                break;
                case "KUZ": {
                    Fasil fasil = Fasil.KUZ;
                    fasil.oy(9);
                }
                break;
                case "QISH": {
                    Fasil fasil = Fasil.QISH;
                    fasil.oy(12);
                }
                break;
            }
        }


    }
}
