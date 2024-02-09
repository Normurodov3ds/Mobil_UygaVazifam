package Lesson23;

import java.util.LinkedList;
import java.util.List;
public class Paskal_I {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) { 

        List<List<Integer>> list = new LinkedList<>();
        LinkedList<Integer> list0 = new LinkedList<>();

        for (int i = 0; i < numRows; i++) {
            LinkedList<Integer> list1 = new LinkedList<>();
            for (int j = 0; j <i-1; j++) {
                int a = list0.get(j);
                int b = list0.get(j+1);
                list1.add(a+b);
            }
            if (!list0.isEmpty()){
                list1.addFirst(1);
                list1.addLast(1);
            }else {
                list1.add(1);
            }
            list0 = new LinkedList<>(list1);
            list.add(list1);
            System.out.println(list0);
        }
        return list;
    }
}
