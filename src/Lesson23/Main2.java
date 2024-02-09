package Lesson23;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String [] s = new String[]{"5","-2","4","C"};
        System.out.println(calPoints(s));
    }
    public static int calPoints(String[] operations) {
        int []a = new int[operations.length];
        int index = 0;
        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("C")&&!operations[i].equals("D")&&!operations[i].equals("+")){
                a[index++] = Integer.parseInt(operations[i]);
            }else{
                if (operations[i].equals("C")){
                    index--;
                    a[index] = 0;
                }else if (operations[i].equals("D")){
                    int s = a[index-1]*2;
                    a[index] = s;
                    index++;
                }else if (operations.equals("+")){
                    int s = a[index-2]+a[index-1];
                    a[index] = s;
                    index++;
                }
            }
        }

        System.out.println(Arrays.toString(a));
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum+=a[j];
        }
        System.out.println(sum);
        return 0;
    }
}
