package Lesson23;

import java.util.LinkedList;

public class Main9 {
    public static void main(String[] args) {
        int []a = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        System.out.println(prefixesDivBy5(a));
    }
    public static LinkedList<Boolean> prefixesDivBy5(int[] nums) {
        LinkedList<Boolean> list = new LinkedList();
        for (int i = 0; i <nums.length ; i++) {
            int a = 0;
            int sum = 0;
            for (int j = nums.length-1-i; j >=0 ; j--) {
                sum+= (int) (Math.pow(2,a)*nums[j]);
                a++;
            }
            System.out.println(sum);
            if (sum%5==0){
                list.addFirst(true);
            }else list.addFirst(false);
        }
        return list;
    }
}
