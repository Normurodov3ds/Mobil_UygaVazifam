package Lesson23;

public class Main12 {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "d"}, new String[]{"a", "bd"}));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        for (String string : word1) {
            str.append(string);
        }
        for (String string : word2) {
            str1.append(string);
        }
        return str.toString().equals(str1.toString());
    }
}
