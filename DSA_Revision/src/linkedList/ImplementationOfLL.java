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

    public void set(int idx, int value) throws Error{
        if(idx > size || idx < 0){
            throw new Error("Invalid index");
        }
        if(idx == size-1) {
            tail.value = value;
            return;
        }
        Node temp = head;
        for(int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    public void insert(int idx, int value) {
        if(idx > size || idx < 0){
            System.out.println("Error: Invalid index");
            return;
        }
        if(idx == 0) {
            insertAtHead(value);
            return;
        }
        if(idx == size) {
            insertAtEnd(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for(int i = 0; i < idx-1; i++) {
            temp = temp.next; // temp will stop on Node just before idx.
        }
        newNode.next = temp.next; // new node will point where temp is pointing that is to the next node
        temp.next = newNode; // Now temp will point to new node and new node is inserted in between successfully
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

    public void getElement(int idx) {
        if(idx >= size || idx < 0){
            System.out.println("Error: Invalid index");
            return;
        }
        if(idx == size - 1) {
            System.out.println(tail.value);
            return;
        }
        Node temp = head;
        for(int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public void deleteAtHead() throws Error{
        if(head == null) {
            throw new Error("Linked List is Empty");
        }
        head = head.next;
        size--;
    }

    public void deleteAtIndex(int idx) throws Error{
        if(idx >= size || idx < 0) {
            throw new Error("Invalid Index");
        }

        if(idx == 0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i = 0; i < idx-1; i++) { // Temp reaches at index - 1
            temp = temp.next;
        }
        temp.next = temp.next.next; // That is temp.next.next; skipping the middle node. Line of deletion

        if(idx == size - 1) tail = temp;

        size--;
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

        list.insert(0, -1);
        list.size();
        list.display();

        list.insert(3, 8);
        list.size();
        list.display();

        list.insert(9, 80);
        list.size();
        list.display();

        list.insert(11, 90);
        list.size();
        list.display();

        list.insert(12, 100);
        list.size();
        list.display();

        list.getElement(4);

        list.set(4, 9);
        list.display();
//        list.set(-1, 59); // User defined error

        list.set(12, 99);
        list.display();
        list.size();

        list.deleteAtIndex(4);
        list.display();
        list.size();

        System.out.println(list.tail.value);
        list.deleteAtIndex(11);
        System.out.println(list.tail.value);
        list.display();
        list.size();


        list.deleteAtIndex(0);
        list.display();
        list.size();

        list.deleteAtIndex(-1);
        list.deleteAtIndex(12);
    }
}
