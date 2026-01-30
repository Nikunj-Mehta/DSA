package linkedList;

public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(10);
//        Node temp = new Node(10); // Deep copy
        Node temp = a; // Shallow Copy
        System.out.println(a);
        System.out.println(temp);
    }
}
