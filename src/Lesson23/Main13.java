package Lesson23;

import java.util.ArrayList;
import java.util.List;

public class Main13 {
    public static void main(String[] args) {
        String []s = new String[]{"leet","code"};
        char c = 'e';
        System.out.println(findWordsContaining(s, c));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        for (String word : words) {
             if (word.contains(Character.toString(x))){
                 list.add(i);
             }
             i++;
        }
        return list;
    }
}
