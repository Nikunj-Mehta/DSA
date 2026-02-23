package stack;

import java.util.Stack;

public class Basics {
    public static Stack<Integer> reverseStack(Stack<Integer> st) {
        Stack<Integer> reverseSt = new Stack<>();
        while(!st.isEmpty()) reverseSt.push(st.pop());
        return reverseSt;
    }

    public static Stack<Integer> duplicateStack(Stack<Integer> reverseSt) {
        Stack<Integer> duplicateSt = new Stack<>();
        while(!reverseSt.isEmpty()) duplicateSt.push(reverseSt.pop());
        return duplicateSt;
    }

    public static void addAtIdx(int idx, int ele, Stack<Integer> st) {
        if(idx > st.size() || idx < 0) return;
        Stack<Integer> helper = new Stack<>();
        while(st.size() > idx) helper.push(st.pop());
        st.push(ele);

        while(!helper.isEmpty()) st.push(helper.pop());
    }

    public static void reverseRecursively(Stack<Integer> st) {
        if(st.isEmpty()) return;
        int top = st.pop();
        reverseRecursively(st);
        System.out.println(top);
        st.push(top);
    }
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
        Stack<Integer> reverseSt = reverseStack(st);
        System.out.println(reverseSt);

        // Duplicate the stack in some order
        Stack<Integer> duplicateSt = duplicateStack(reverseSt);
        System.out.println(duplicateSt);

        addAtIdx(3, 35, duplicateSt);
        System.out.println(duplicateSt);

        reverseRecursively(duplicateSt);
        System.out.println(duplicateSt);
    }
}
