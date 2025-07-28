package collectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LearnCustomHashSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("rahul", 12));
        studentSet.add(new Student("Anuj", 23)); // as we are doing new Student so these two will be considered 2 new objects
        studentSet.add(new Student("Anuj", 24)); // and set will not be able to identify that they are same even though their values are same still the object is different.

        Student s1 = new Student("Ketan", 1);
        Student s2 = new Student("Rahil", 2);

        System.out.println(s1.compareTo(s2)); // Comparing on the basis of roll no.

        System.out.println(studentSet);
    }
}
