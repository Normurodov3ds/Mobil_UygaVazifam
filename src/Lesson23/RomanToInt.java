package Lesson23;

import java.util.Arrays;

public class RomanToInt {
    public static void main(String[] args) {

        String s = "MCMXCIV"; // 1994
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {

        int n = s.length();
        int []a = new int[n];
        for (int i = 0; i < s.length(); i++) {
            int b = 0;
            switch (s.charAt(i)){
                case 'I'->b =1;
                case 'V'->b =5;
                case 'X'->b =10;
                case 'L'->b =50;
                case 'C'->b =100;
                case 'D'->b =500;
                case 'M'->b =1000;
            }
            a[i]  = b;
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n-1; i++) {
            if (a[i]<a[i+1]){
                a[i]  = a[i+1]-a[i];
                a[i+1] = 0;
                i++;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
        }
        return sum;
    }
}
