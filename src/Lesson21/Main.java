package Lesson21;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(); // 1 452 210 451,12
        long b = (long) a;
        int c = (int) ((a*100)%100); // 12

        // 1 222 333 444  300 30 3

        List<Integer> list = new LinkedList<>();
        list.add(c);
        while (b!=0){ list.add((int) (b%1000));
            b /=1000;
        }
        System.out.println(list);

        List<String> str0 = new ArrayList<>();
        str0.add("tiyn ");
        str0.add("so'm, ");
        str0.add("ming, ");
        str0.add("milyon, ");
        str0.add("mlyard, ");
        str0.add("tirilion, ");

        System.out.println(list);
        List<String> strr = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String string =fun(list.get(i));
            if (!string.isEmpty()){
                strr.addFirst(string+str0.get(i));
            }
        }
        for (String string : strr) {
            System.out.print(string);
        }
    }
    public static String fun(int a){
        StringBuilder s = new StringBuilder();
        switch (a/100){
            case 1-> {
                if (a%100==0){
                    s.append("yuz ");
                }else s.append("bir yuz ");
            }
            case 2-> s.append("ikki yuz ");
            case 3-> s.append("uch yuz ");
            case 4-> s.append("to'rtyuz ");
            case 5-> s.append("besh yuz ");
            case 6-> s.append("oltiyuz ");
            case 7-> s.append("yetiyuz ");
            case 8-> s.append("sakizyuz ");
            case 9-> s.append("to'qiz yuz ");
        }
        switch ((a%100)/10){
            case 1-> s.append("o'n ");
            case 2-> s.append("yigirma ");
            case 3-> s.append("o'ttiz ");
            case 4-> s.append("qirq ");
            case 5-> s.append("ellik ");
            case 6-> s.append("oltmish ");
            case 7-> s.append("yrtmish ");
            case 8-> s.append("sakson ");
            case 9-> s.append("to'qson ");
        }
        switch (a%10){
            case 1-> s.append("bir ");
            case 2-> s.append("ikki ");
            case 3-> s.append("uch ");
            case 4-> s.append("to'rt ");
            case 5-> s.append("besh ");
            case 6-> s.append("olti ");
            case 7-> s.append("yetii ");
            case 8-> s.append("sakiz ");
            case 9-> s.append("to'qiz ");
        }
        return s.toString();
    }
}
