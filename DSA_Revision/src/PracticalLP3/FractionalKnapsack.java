package PracticalLP3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Item {
    int weight, value;
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(Item[] items, int capacity) {

        // Sort by value/weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / a.weight;
                double r2 = (double) b.value / b.weight;
                return Double.compare(r2, r1); // descending
            }
        });

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity == 0) break;

            if (item.weight <= capacity) {
                totalValue += item.value;      // take full item
                capacity -= item.weight;
            } else {
                double fraction = (double) capacity / item.weight;
                totalValue += item.value * fraction;   // take fractional part
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        Item[] items = new Item[n];

        System.out.println("Enter weight and value for each item:");
        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i+1) + " weight: ");
            int w = sc.nextInt();
            System.out.print("Item " + (i+1) + " value: ");
            int v = sc.nextInt();
            items[i] = new Item(w, v);
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        double maxProfit = getMaxValue(items, capacity);
        System.out.println("Maximum profit = " + maxProfit);

        sc.close();
    }
}

