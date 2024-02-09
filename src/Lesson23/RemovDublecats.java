package Lesson23;

public class RemovDublecats {
    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));

    }
    public static int removeDuplicates(int[] a) {
        int n = a.length;
        if (n==0) return 0;
        for (int i = 0; i < n-1; i++) {
            int k = i+1;
            for (int j = i+1; j < n; j++) {
                if (a[i]!=a[j]){
                    a[k] = a[j];
                    k++;
                }
            }
            n = k;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        return n;
    }
}
