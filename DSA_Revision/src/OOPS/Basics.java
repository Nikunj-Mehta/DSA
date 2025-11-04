package OOPS;

class Student{
    String name;
    int rollNo;

    // Static method without parameters
    public static void hello() {
        System.out.println("I said hello...");
    }

    // Static method with parameters
    public static int add(int a, int b) {
        return a+b;
    }
    public void doSomething() {
        System.out.println("Do something");
    }
}
public class Basics {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ram";
        s1.rollNo = 231;
        s1.hello(); // Static method can be accessed via instance variable as well as
        Student.hello(); // It can be accessed just by using class Name and there is no need of creating object.
        s1.doSomething();
        s1.add(3, 5);
        Student.add(4, 6); // even if the static method takes some argument we can call it without creating object
    }

}
