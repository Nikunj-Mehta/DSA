package OOPS;

class Animal {
    String name;
    int age;

    public Animal() {
        System.out.println(" Default Constructor called");
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("Animal walks");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void intro() {
        System.out.println("Hi, I am a " + name + " and I am " + age + " years old.");
    }

}
public class Constructor {
    public static void main(String[] args) {
        Animal max = new Animal(); // Doing this will call default constructor
        Animal bruno = new Animal("dog", 4);
        int age = bruno.age;
        System.out.println(age);
        String name = bruno.name;
        System.out.println(name);
        bruno.intro();
        bruno.eat();
        bruno.drink();
        bruno.walk();
    }
}
