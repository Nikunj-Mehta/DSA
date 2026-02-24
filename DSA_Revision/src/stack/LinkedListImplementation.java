package stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class StackUsingLinkedList {
    Node head = null;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int ele) {
        Node temp = new Node(ele);
        temp.next = head;
        head = temp;
        size++;
    }

    public int peek() {
        if(head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
    }

    public int pop() {
        if(head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayRec() {
        displayRevRecursively(head);
        System.out.println();
    }
    public void displayRevRecursively(Node head) {
        if(head == null) return;
        displayRevRecursively(head.next);
        System.out.print(head.val + " ");
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        StackUsingLinkedList st = new StackUsingLinkedList();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());

        st.push(10);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        st.displayRec();

        System.out.println(st.peek());
        st.push(70);
        st.display();
    }
}
