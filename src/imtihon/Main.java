package imtihon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = "";
        for (int i = s.length()-1; i >=0; i--) {
            s1+=(s.charAt(i));
        }
        System.out.println(s1);
    }
}
