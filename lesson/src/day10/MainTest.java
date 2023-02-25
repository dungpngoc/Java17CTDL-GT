package day10;

import java.util.LinkedList;
import java.util.Queue;

public class MainTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(4);

        queue.peek(); //~ getFirst

        queue.poll(); //! remove first

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
