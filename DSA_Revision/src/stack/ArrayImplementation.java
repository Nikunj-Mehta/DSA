package stack;

class StackUsingArray {
    int size;
    int idx;
    int[] arr;

    StackUsingArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return idx == 0;
    }

    public boolean isFull() {
        return idx == size;
    }

    public int size() {
        if(idx == 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return idx;
    }

    public void push(int ele) {
        if(idx == size) {
            System.out.println("Stack Overflow: Stack is full");
            return;
        }
        arr[idx++] = ele;
    }

    public int pop() {
        if(idx == 0) {
            System.out.println("Stack Underflow: Stack is empty");
            return -1;
        }
        idx--;
        return arr[idx];
    }

    public int peek() {
        if(idx == 0) {
            System.out.println("Stack underflow: Stack is empty");
            return -1;
        }
        return arr[idx-1];
    }

    public void display() {
        for(int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class ArrayImplementation {
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);
//        System.out.println(st.isEmpty());
//        System.out.println(st.isFull());
//        System.out.println(st.size());
//        System.out.println(st.pop());
//        System.out.println(st.peek());

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.size());
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());

        st.push(60);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.size());
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());
        st.display();
        st.push(70);
        st.display();
        st.push(80);
        st.display();
    }
}
