package OOPS;

import com.sun.security.jgss.GSSUtil;

class Shape {
    String name;
    int sides;

    public Shape(String name, int sides) {
        this.name = name;
        this.sides = sides;
        System.out.println("Parameterized constructor called name: " + name + " No of sides: " + sides);
    }

    public Shape() {
        System.out.println("I am the non-parameterized constructor of parent class Shape");
    }

    public void area() {
        System.out.println("Every shapes has an area");
    }
}

class Triangle extends Shape{
    public Triangle() {
        super("Triangle", 3); // calling parent constructor and passing values
    }
    public void area() {
        System.out.println("My area is 1/2*b*h");
    }
}

class Square extends Shape {
    public Square() {
           super("Square", 4); // calling parent constructor and passing values
    }
    public Square(String name, int sides) {
        this.name = name;
        this.sides = sides;

        System.out.println("This is the parameterized constructor of Square");
    }
    public void area() {
        System.out.println("My area is side*side");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.name);
        System.out.println(shape.sides);
        shape.area();

        Shape newShape = new Shape("Pentagon", 5);
        System.out.println(newShape.name);
        System.out.println(newShape.sides);

        Shape tri = new Triangle();
        System.out.println(tri.name);
        System.out.println(tri.sides);
        tri.area();

        Square sq = new Square();
        System.out.println(sq.name);
        System.out.println(sq.sides);
        sq.area();

//        🔹 If a child constructor does not explicitly call super(...),
//        🔹 Java automatically calls super() (no-arg constructor),
//        🔹 And this happens before any code inside child constructor runs
        Square squ = new Square("Heptagon", 7); // Therefor first the Shape class non-parameterized constructor will be called.
        System.out.println(squ.name);
        System.out.println(squ.sides);
        squ.area();
    }
}