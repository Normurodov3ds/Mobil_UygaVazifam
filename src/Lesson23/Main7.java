package Lesson23;

public class Main7 {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }
    public static String truncateSentence(String s, int k) {
        String []str = s.split(" ");
        String s1 = "";
        for (int i = 0; i < str.length; i++) {
            if (i<k){
               s1 = s1.concat(str[i]+" ");
            }else break;
        }
        return s1.trim();
    }
}
