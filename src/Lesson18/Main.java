package Lesson18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int getSum = 441_000;
        int a = getSum/1000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 1000;
        while (a!=0){
            arrayList.add((a%10)*i);
            a/=10;
            i*=10;
        }
        System.out.println(arrayList);

    }
}
