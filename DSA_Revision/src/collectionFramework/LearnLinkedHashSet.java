package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

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
