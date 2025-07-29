package collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // Same as hash set just all elements will be in sorted order

        set.add(10);
        set.add(3);
        set.add(56);
        set.add(53);
        set.add(35);
        System.out.println(set);
        set.remove(3);
        System.out.println(set);
        System.out.println(set.contains(100));
        System.out.println(set.contains(10));
    }
}
