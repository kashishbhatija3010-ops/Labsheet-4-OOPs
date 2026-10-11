package labsheet4;
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

class Circle extends Shape {
    double radius = 7;

    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

public class Q14 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.area();
        c.area();
    }
}
