package Lesson22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (Enums value : Enums.values()) {
            System.out.println("=============");
            System.out.println("Hafta kuni: "+value);
            System.out.println("ishchi: "+value.ismi);
            System.out.println("soat : "+value.soat);
            System.out.println();
        }
    }
}
