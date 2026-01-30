package linkedList;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class ListNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; // a -> b now a is linked to b n.next = null but a.next is b and b is f582394, some address of b, we can sout(a.next) and sout(b) it's same.
        b.next = c; // a -> b -> c
        c.next = d; // a -> b -> c -> d
        d.next = e; // a -> b -> c -> d -> e

        System.out.println(a.value); // a
        System.out.println(a.next.value); // b
        System.out.println(a.next.next.value); // c
        System.out.println(a.next.next.next.value); // d
        System.out.println(a.next.next.next.next.value); // e
    }
}
