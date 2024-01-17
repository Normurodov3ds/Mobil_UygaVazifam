
public class Main {
    public static void main(String[] args) {
        String s = "a1b22ccf";
        String []str = s.split("[12]");
        
        System.out.println(str.length);
        System.out.println(s.replaceAll("[1-9]", ""));


    }
}
