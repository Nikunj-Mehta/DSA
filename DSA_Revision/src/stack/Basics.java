package stack;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st);
        System.out.println(st.size());

        // To get the first element of stack
//        while(st.size() != 1) st.pop();
//        System.out.println(st.peek());

        // To reverse a stack
        Stack<Integer> reverseSt = new Stack<>();
        while(!st.isEmpty()) reverseSt.push(st.pop());
        System.out.println(reverseSt);
    }
}
