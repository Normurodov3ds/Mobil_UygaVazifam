package Lesson23;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int []a = {5,2,2,2};
        System.out.println(thirdMax(a));

    }
    public static int thirdMax(int[] nums) {

        int n = nums.length;
        if (n>3){
            return nums[2];
        }
        for (int i = 0; i < n-1; i++) {
            int index = i+1;
            for (int j = i+1; j < n; j++) {
                if (nums[i]!=nums[j]){
                    nums[index] = nums[j];
                    index++;
                }
            }
            n = index;
        }
        if (n<3){
            int max = nums[0];
            for (int i = 1; i < n; i++) {
                if (nums[i]>max){
                    max = nums[i];
                }
            }
            return max;
        }else {
            return nums[2];
        }
    }
}
