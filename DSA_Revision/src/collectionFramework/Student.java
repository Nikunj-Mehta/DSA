package collectionFramework;

import java.util.Objects;

public class Student implements Comparable<Student> {

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{ " + "name= " + name + ", rollNo= " + rollNo +"}";
    }

    // HashSet uses equals method to check if the elements are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
}
