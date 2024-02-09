package Lesson23;

public class Main10 {
    public static void main(String[] args) {
        int[] a = {555,901,482,1771};
        System.out.println(findNumbers(a));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int l = 0;
            while (a != 0) {
                a /= 10;
                l++;
            }
            if (l % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}