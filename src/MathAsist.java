import java.util.Scanner;

public class MathAsist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int k= in.nextInt();
        int[] array=new int[n];
        int a;
        for (int i = 0; i < n; i++) {
            a= in.nextInt();
            array[i]=a;
        }
        for (int i = k; i < n; i=i+k) {
            System.out.println(array[i]);
        }
    }
}
