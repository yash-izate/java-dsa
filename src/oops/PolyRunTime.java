package oops;

// Type 2: Method Overriding called Dynamic Binding
class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class PolyRunTime {
    public static void main(String[] args) {

        /* Dynamic Method Dispatch:- When a parent reference points to a child object,
           the JVM decides at runtime which overridden method to execute. */

        Shape[] shapes = {
                new Circle(),
                new Rectangle(),
                new Triangle()
        };

        for (Shape s : shapes) {
            s.draw();
        }
    }
}