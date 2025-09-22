package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//        ArrayList <Integer> al = new ArrayList<>();
        List<Integer> al = new LinkedList<>(); // This way we can use linkedList all features are similar to arraylist.
        al.add(10);
        al.add(20);
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.remove(1));
        System.out.println(al);
        al.add(30); // adds ele at end
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al);
        System.out.println(al.remove(2));
        System.out.println(al);
        al.addLast(70);
        al.addFirst(10);
        System.out.println(al);
        al.add(2, 20);
        System.out.println(al);
        System.out.println(al.removeFirst());
        System.out.println(al.remove(Integer.valueOf(30))); // this way we can remove element using value
        System.out.println(al);
        System.out.println(al.reversed());
        System.out.println(al);
        al.forEach(a -> System.out.print(a + " ")); // This is the use of lambda expression
        System.out.println();
        System.out.println(al.get(4));
        // We can create a new list and add all the elements of the list using
        // al.addAll(newList);
        System.out.println(al.contains(70));
        System.out.println(al.contains(100));
        System.out.println(al.get(3));
        System.out.println(al.set(3, 25));

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
