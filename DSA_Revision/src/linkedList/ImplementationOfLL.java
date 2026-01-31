package linkedList;

class SLL { // User defined Data Structure
    private Node head; // Initially both head and tail are on null
    private Node tail;
    private int size;

    public void display() { // TC = O(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void size() { // TC = O(1)
        System.out.println("Length of Linked List is: " + size);
    }

    public void insertAtHead(int value) { // TC = O(1)
        Node temp = new Node(value);

        if(size == 0) head = tail = temp; // When linked list is empty
        else { // when linked list is not empty
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void insertAtEnd(int value) { // TC = O(1)
        Node temp = new Node(value);
        if(head == null) head = tail = temp; // Linked List is empty
        else { // Linked List is not empty
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
}

public class ImplementationOfLL {
    public static void main(String[] args) {
        SLL list = new SLL(); // created an object of SinglyLinkedList

//        System.out.println(list.size); // There is no need to create size method just maintain the variable. Just make size var public first
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.size(); // Also we can create a function to do the same
        list.display();

        list.insertAtEnd(24);
        list.size();
        list.display();

        list.insertAtHead(5);
        list.size();
        list.display();
        list.insertAtHead(1);
        list.size();
        list.display();
    }
}
