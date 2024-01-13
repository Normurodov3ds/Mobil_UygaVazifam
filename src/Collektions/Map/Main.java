package Collektions.Map;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0,"salom");
        map.put(1,"komil");
        map.put(2,"qanday");
        map.put(3,"san");
        Set<Integer> set = map.keySet();


        List<Integer> list = set.stream().filter(integer -> integer > 2).collect(Collectors.toList());
        System.out.println(list);

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<String> set1 = new HashSet<>(values);
        for (String s : set1) {
            System.out.println(s);
        }

        for (Integer i : set) {
            System.out.println(i+" -> "+map.get(i));
        }
/**
 *  map, set, list, linkedlist, sortList, ... hammasii Collections
 *  class dan extend qilgan demak biz otasiga to'g'ridan to'g'ri cast qilib
 *  ishlatib keta veramiz.
 *  map ning asosoy farqi bu key valusida key birxil bolib qolmasligi kerak
 *  keyda faqat no-premetiv toifa keladi! valueda ham, obyekt kelsa ham bo'ladi.
 *  obyekt faqat keyga tafsiya qilmayman sabab key ning ahamiyati qolmaydi
 */
    }
}
