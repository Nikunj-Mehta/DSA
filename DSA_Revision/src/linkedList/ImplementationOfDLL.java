package linkedList;

class DLL {
    DNode head;
    DNode tail;
    int size;

    void display() {
        DNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtHead(int val) {
        DNode temp = new DNode(val);
        if(size == 0) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val) {
        DNode temp = new DNode(val);
        if(size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtIndex(int idx, int val) {
        if(idx > size || idx < 0) System.out.println("Invalid Index");
        else if(idx == size) insertAtTail(val);
        else if(idx == 0) insertAtHead(val);
        else {
            DNode newNode = new DNode(val);
            DNode temp = head;
            for(int i = 1; i < idx; i++) temp = temp.next; // move to 1 node before idx
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }
    }

    void deleteAtHead() {
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        else if(head == tail) head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void deleteAtTail() {
        if(tail == null) {
            System.out.println("Linked List is empty");
            return;
        }
        else if(head == tail) head = tail = null; // only one element in linked list
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void delete(int idx) {
        if(idx >= size || idx < 0) System.out.println("Invalid Index");
        else if(idx == size-1) deleteAtTail();
        else if(idx == 0) deleteAtHead();
        else {
            DNode temp = head;
            for(int i = 1; i < idx; i++) temp = temp.next; // move to 1 node before idx
            temp.next = temp.next.next;
            temp = temp.next;
            temp.prev = temp.prev.prev;
            size--;
        }
    }

    void getHead() {
        if(head == null) System.out.println("List is empty");
        else System.out.println(head.val);
    }

    void getTail() {
        if(tail == null) System.out.println("List is empty");
        else System.out.println(tail.val);
    }

    void get(int idx) {
        if(idx >= size || idx < 0) System.out.println("Invalid index");
        else if(idx == 0) getTail();
        else if(idx == size-1) getTail();
        else {
            DNode temp = head;
            for(int i = 0; i < idx; i++) temp = temp.next;
            System.out.println(temp.val);
        }
    }

    void setHead(int val) {
        if(head == null) System.out.println("List is empty");
        else head.val = val;
    }

    void setTail(int val) {
        if(tail == null) System.out.println("List is empty");
        else tail.val = val;
    }

    void set(int idx, int val) {
        if(idx >= size || idx < 0) System.out.println("Invalid index");
        else if(idx == 0) setHead(val);
        else if(idx == size-1) setTail(val);
        else {
            DNode temp = head;
            for(int i = 0; i < idx; i++) temp = temp.next;
            temp.val = val;
        }
    }

}

public class ImplementationOfDLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        System.out.println(list.size);
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(9);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(5);
        list.display();
        System.out.println(list.size);
        list.insertAtIndex(0, 2);
        list.display();
        System.out.println(list.size);
        list.insertAtIndex(7, 50);
        list.display();
        System.out.println(list.size);

        list.insertAtIndex(4, 15);
        list.display();
        System.out.println(list.size);

        list.deleteAtHead();
        list.display();
        System.out.println(list.size);

        list.deleteAtTail();
        list.display();
        System.out.println(list.size);

        list.delete(3);
        list.display();
        System.out.println(list.size);

        list.getHead();
        list.getTail();
        list.get(2);

        list.setHead(1);
        list.display();
        System.out.println(list.size);

        list.setTail(100);
        list.display();
        System.out.println(list.size);

        list.set(2, 42);
        list.display();
        System.out.println(list.size);
    }
}
