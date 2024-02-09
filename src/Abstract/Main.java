package Abstract;

import java.util.LinkedList;

public class Main extends Abstract{

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(1);
        System.out.println(list.offer(1));


    }
}
