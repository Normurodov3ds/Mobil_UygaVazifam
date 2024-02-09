package Lesson23;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int []a = new int[]{9,8,9};
        System.out.println(Arrays.toString(plusOne(a)));

    }
    public static int[] plusOne(int[] digits) {
       if (digits[digits.length-1]<9){
           digits[digits.length-1]++;
           return digits;
       }
       digits[digits.length-1]++;
        for (int i = digits.length-1; i > 0; i--) {
            if (digits[i]>9){
                digits[i-1]++;
                digits[i] = 0;
            }else break;
        }
        if (digits[0]>9) {
            int[] array = new int[digits.length + 1];
            array[0] = 1;
            return array;
        }
        return digits;
    }
}
