package Lesson19;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("12");
        queue.add("4");
        queue.add("01");
        queue.add("9");
        queue.add("9");
        System.out.println(queue);
        System.out.println(queue.offer("4"));

    }
}
