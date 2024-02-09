package Lesson23;

import java.util.Arrays;

public class Main11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));

    }
    public static int[] getConcatenation(int[] nums) {
        int []a = new int[nums.length*2];
        int n = nums.length;
        for (int i = 0; i <nums.length; i++) {
            a[i] = nums[i];
            a[n] = nums[i];
            n++;
        }
        return a;

    }
}
