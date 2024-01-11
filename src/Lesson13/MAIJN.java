package Lesson13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class MAIJN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carta[] carts = Carta.values();
        System.out.println(Arrays.toString(carts));
        while (true){
            switch (in.nextLine()){
                case "UZKARD": {
                    Carta uzkard = Carta.UZKARD;
                    uzkard.setA(in.nextInt());
                    uzkard.setname(in.nextLine());
                } break;
                case "VIZA": {} break;
                case "HUMO": {} break;
                case "MASTER": {} break;
            }
        }
    }
}
