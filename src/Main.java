
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);





    }

    private static String teskari(String ch) {
        switch (ch) {
            case "(":
                return ")";
            case ")":
                return "(";
            case "[":
                return "]";
            case "]":
                return "[";
            case "{":
                return "}";
            case "}":
                return "{";
            default:
                return "";
        }
    }
}
