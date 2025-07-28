package collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // This is min heap ie the smallest ele will be on top and will be the first to be removed.
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // This makes max heap that is the largest ele will be on top and will be the first to be removed.

        pq.add(48);
        pq.add(12);
        pq.add(36);
        pq.add(24);
        System.out.println(pq); // Min ele will always be on top
        System.out.println(pq.poll());
        System.out.println(pq); // Smallest ele will be removed and the next smallest ele will be on top. Rest order doesn't matters first ele will be smallest.
        pq.add(10);
        System.out.println(pq.peek());
    }
}
