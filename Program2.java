abstract class Shape {
    public abstract void numberOfSides();
}

class Rectangle extends Shape {
    public void numberOfSides() {
        System.out.println("Number of sides of a rectangle is 4.");
    }
}

class Triangle extends Shape {
    public void numberOfSides() {
        System.out.println("Number of sides of a triangle is 3.");
    }
}

class Hexagon extends Shape {
    public void numberOfSides() {
        System.out.println("Number of sides of a hexagon is 6.");
    }
}

class Program2 {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.numberOfSides();
        Triangle t = new Triangle();
        t.numberOfSides();
        Hexagon h = new Hexagon();
        h.numberOfSides();
    }
}