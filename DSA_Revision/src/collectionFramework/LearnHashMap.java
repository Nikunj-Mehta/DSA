package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
//        numbers.put("Two", 2);
        numbers.put("Three", 3);
//        numbers.put("Two", 5); // values will be overridden.
        if(!numbers.containsKey("Two")) {
            numbers.put("Two", 4);
        }
        numbers.putIfAbsent("Four", 4);

        System.out.println(numbers);

        for(Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: numbers.keySet()) {
            System.out.println(key + " ");
        }

        for(Integer value: numbers.values()) {
            System.out.println(value + " ");
        }

        numbers.remove( "Two");
        System.out.println(numbers);

    }
}
