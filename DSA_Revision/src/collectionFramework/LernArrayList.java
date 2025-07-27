package collectionFramework;

import java.util.ArrayList;

public class LernArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.remove(1));
        System.out.println(al);
        al.add(30);
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
        System.out.println(al);
        System.out.println(al.reversed());
        System.out.println(al);
        al.forEach(a -> System.out.print(a + " ")); // This is the use of lambda expression
    }
}
