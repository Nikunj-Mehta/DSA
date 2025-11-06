package PracticalLP3;

import java.util.PriorityQueue;
import java.util.Scanner;

// Node class for Huffman Tree
class Node implements Comparable<Node> {
    char ch;
    int freq;
    Node left, right;

    public Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public int compareTo(Node n) {
        return this.freq - n.freq; // Min-Heap based on frequency
    }
}

public class HuffmanEncoding {

    // Recursive function to print Huffman Codes
    public static void printCodes(Node root, String code) {
        if (root == null)
            return;

        // Print only leaf nodes (characters)
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + code);
        }
        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter characters: ");
        String chars = sc.nextLine();

        System.out.print("Enter frequencies (space separated): ");
        String[] freqStr = sc.nextLine().split(" ");

        int n = chars.length();
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[i] = Integer.parseInt(freqStr[i]);
        }

        // Min-Heap
        PriorityQueue<Node> pq = new PriorityQueue<>();

        // Step 1: insert nodes into heap
        for (int i = 0; i < n; i++) {
            pq.add(new Node(chars.charAt(i), freq[i]));
        }

        // Step 2: build Huffman Tree
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node newNode = new Node('-', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;

            pq.add(newNode);
        }

        // Final root node
        Node root = pq.poll();

        System.out.println("\nHuffman Codes:");
        printCodes(root, "");

        sc.close();
    }
}
