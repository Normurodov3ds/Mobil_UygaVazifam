package Collektions.Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        Person person = new Person("Komil",(byte) 23,'M');
        Person person0 = new Person("Abdulaziz",(byte) 13,'M');
        Person person1 = new Person("Zoir",(byte) 22,'M');
        Person person2 = new Person("Bahrom",(byte) 22,'M');

        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(person0);
        list.add(person1);
        list.add(person2);

        Collections.sort(list);
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("abbos");
        list1.add("malik");
        list1.add("jamol");
        list1.add("zafar");
        list1.add("bahodir");

        Collections.sort(list1);
        System.out.println(list1);



    }
}
