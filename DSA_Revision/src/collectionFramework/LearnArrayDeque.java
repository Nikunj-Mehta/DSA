package collectionFramework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(24);
        adq.offerLast(64);
        adq.add(55);
        adq.addFirst(57);
        adq.addLast(7);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq.remove());
        System.out.println(adq.removeFirst());
        System.out.println(adq.removeLast());
        adq.add(35);
        System.out.println(adq);
    }
}
