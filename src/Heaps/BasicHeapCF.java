package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // For MaxHeap
//        PriorityQueue<Integer> pq = new Priorit y Queue<>(); // For MinHeap

        pq.add(2);
        System.out.println(pq + " " + pq.peek());
        pq.add(10);
        System.out.println(pq + " " + pq.peek());
        pq.add(1);
        System.out.println(pq + " " + pq.peek());
        pq.remove();
        System.out.println(pq + " " + pq.peek());
        pq.add(0);
        System.out.println(pq + " " + pq.peek());
        pq.add(-34);
        System.out.println(pq + " " + pq.peek());
    }
}
