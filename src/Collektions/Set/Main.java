package Collektions.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Set<String> set  = new HashSet<>();
        set.add("komil");
        set.add("dilshot");
        set.add("bahrom");
        set.add("komil");
        System.out.println(set);

        /**
         * set bu yunikal malumotlarni saqlash uchun samarali
         * set da faqat argumentida obyekt kelsa va obyekt class ichida
         * hash equals owerride qilingan bo'lsa nima boladi?
         * setda index degan tushuncha yo'q
         * malumotlar tartiblanishi ketma ketlikda emas hashkode larning  usishi tartibida
         *
         */
        Iterator iterator =  set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
