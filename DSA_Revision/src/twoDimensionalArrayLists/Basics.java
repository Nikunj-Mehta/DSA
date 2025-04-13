package twoDimensionalArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20);

        List<Integer> b = new ArrayList<>();
        b.add(30); b.add(40); b.add(50);

        List<Integer> c = new ArrayList<>();

        List<Integer> d = new ArrayList<>();
        d.add(60);

        List<List<Integer>> arrayList = new ArrayList<>(4);
        arrayList.add(a); arrayList.add(b); arrayList.add(c); arrayList.add(d);

        for(int i = 0; i < arrayList.size(); i++) {
            for(int j = 0; j < arrayList.get(i).size(); j++) {
                System.out.print(arrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        // simpler and better
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));;
        }
    }
}
