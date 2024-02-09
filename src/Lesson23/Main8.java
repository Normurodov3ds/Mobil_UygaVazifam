package Lesson23;

public class Main8 {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }
    public static int mostWordsFound(String[] sentences) {
        int max = sentences[0].split(" ").length;
        for (int i = 1; i < sentences.length; i++) {
            int a = sentences[i].split(" ").length;
           if (max<a){
              max = a;
           }
        }
        return max;
    }
}
