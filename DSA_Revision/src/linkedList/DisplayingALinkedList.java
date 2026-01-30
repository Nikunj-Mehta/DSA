package linkedList;

public class DisplayingALinkedList {
    public static void print(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value); // print temp's value. print a.value, print b.value ...
            temp = temp.next; // Move to next node, move to a.next = b, move to b.next = c ...
        }
    }

    public static void printRecursive(Node temp) {
        if(temp == null) return;
        System.out.println(temp.value);
        printRecursive(temp.next);
    }

    public static void printRecursiveReverse(Node temp) {
        if(temp == null) return;
        printRecursiveReverse(temp.next);
        System.out.println(temp.value);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        print(a);

        printRecursive(a);

        printRecursiveReverse(a);
    }
}
