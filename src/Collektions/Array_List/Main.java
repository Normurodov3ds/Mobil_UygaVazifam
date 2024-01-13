package Collektions.Array_List;

import java.util.*;

public class Main{

    public static void main(String[] args) {
//        List<Object> list = new ArrayList<>();
//        list.add("Komil");
//        list.add("dasturchi");
//        list.add('M');
//        list.add(23);
//        list.add("Jasur");
//        list.add("mashinest");
//        list.add('M');
//        list.add(24);
//        list.add("Iymona");
//        list.add("o'qituvchi");
//        list.add('F');
//        list.add(20);
//
//        System.out.println(list.size());
//        System.out.println(list);
//        System.out.println(list.contains("Komil"));
//        list.clear();
//        System.out.println(list);
        Person person = new Person("Komil", (byte) 23, 'M');
        Person person1 = new Person("Abdulloh", (byte) 24, 'M');
        Person person2 = new Person("Iymona", (byte) 20, 'F');
        Person person3 = new Person("Bahrom", (byte) 25, 'M');
        Person person4 = new Person("Nilufar", (byte) 22, 'F');

        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        List<Person> list1 = new ArrayList<>();
        for (Person person5 : list) {
            list1.add(person5);
        }

        Set<Person> set = new TreeSet<>(list);
        System.out.println(set);

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list);

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list1);

    }
}
