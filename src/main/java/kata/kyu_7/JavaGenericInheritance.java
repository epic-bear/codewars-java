package kata.kyu_7;

import java.util.List;

public class JavaGenericInheritance {

    public static void main(String[] args) {
        System.out.println(sumAllAreas(List.of(new Circle(2), new Circle(1), new Circle(5))));
    }
    public static double sumAllAreas(List<Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes)
            totalArea += shape.getArea();
        return totalArea;
    }

    abstract static class Shape {
        public abstract double getArea();
    }

    static class Circle extends Shape {
        public final double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
}
