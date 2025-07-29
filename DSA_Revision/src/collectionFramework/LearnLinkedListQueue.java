package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // LinkedList is implementing queue therefor we can write LinkedList.

        queue.offer(12);
        queue.add(24);
        queue.add(36);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.add(12);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.element()); // same as peek.
    }
}
