package Lesson23;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i]>=target){
                count++;
            }
        }
        return count;
    }
}
