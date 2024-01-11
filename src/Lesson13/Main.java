package Lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println("   C   |" + "   √  |" + "   ∜ ");
        System.out.println(" clear | sqrt |  sqrt4 ");
        System.out.println("   %   |" + "  X²  |" + "   1/X  ");
        System.out.println(" paset | pow2 | pow(x) ");
        System.out.println("  *  " + "  /  " + "  -  " + "  +  ");
        Scanner in = new Scanner(System.in);
        double sum = 0.0;
        String[] history = new String[]{};
        while (true) {
            String x = in.nextLine();
            if (x.contains("clear")) {
                sum = 0;
                System.out.print(sum);
                history = new String[]{};
                b = false;
                continue;
            } else if (x.contains("history")) {
                tarix(history);
                System.out.print(sum);
                b = false;
                continue;
            }
            if (!b) {
                x = sum + x;
            }
            String[] h = new String[history.length + 1];
            System.arraycopy(history, 0, h, 0, history.length);
            h[history.length] = x + " = ";
            history = h;

            String[] s = x.split("[+*/-]");
            if (s.length == 1 || containsA(s[0])) {
                sum = containsM(s[0]);
            } else {
                sum = Double.parseDouble(s[0]);
            }
            for (int i = 1; i < s.length; i++) {
                x = x.replace(s[i - 1], "");
                double d;
                if (containsA(s[i])) {
                    d = containsM(s[i]);
                } else {
                    d = Double.parseDouble(s[i]);
                }

                switch (x.charAt(i - 1)) {
                    case '+': {
                        sum += d;
                    }
                    break;
                    case '-': {
                        sum -= d;
                    }
                    break;
                    case '*': {
                        sum *= d;
                    }
                    break;
                    case '/': {
                        sum /= d;
                    }
                    break;
                }
            }
            //sum = Math.floor(sum);
            System.out.print(sum);
            history[history.length - 1] += sum;
            b = false;
        }
    }

    private static void tarix(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println("-------------");
            System.out.println((i + 1) + " - math ");
            System.out.println(s[i]);
        }
    }

    private static boolean containsA(String s) {
        if (s.contains("sqrt") || s.contains("pow2") ||
                s.contains("sqrt4") || s.contains("paset") || s.contains("pow(")) {
            return true;
        }
        return false;
    }

    public static double containsM(String s) {
        if (s.contains("sqrt")) {
            return Math.sqrt(Double.parseDouble(s.replace("sqrt", "")));
        } else if (s.contains("sqrt4")) {
            return Math.sqrt(Math.sqrt(Double.parseDouble(s.replace("sqrt4", ""))));
        } else if (s.contains("paset")) {
            return (Double.parseDouble(s.replace("paset", "")) * 0.01);
        } else if (s.contains("pow2")) {
            return Math.pow(Double.parseDouble(s.replace("pow2", "")), 2);
        } else if (s.contains("pow(")) {
            double a = Double.parseDouble(s.substring(s.indexOf("(") + 1, s.lastIndexOf(")")));
            s = s.substring(0, s.indexOf("("));
            return Math.pow(Double.parseDouble(s.replace("pow", "")), a);
        }
        return 0;
    }
}
