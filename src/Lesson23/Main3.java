package Lesson23;

public class Main3 {
    public static void main(String[] args) {
        int []a = new int[]{1,3,5,6};
        int s = 7;
        System.out.println(searchInsert(a, s));
    }
    public static int searchInsert(int[] nums, int target) {
        if (nums.length==0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                return i;
            }else if (nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
