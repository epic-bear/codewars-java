package kata.kyu_7;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

public class CartesianCoordinatesFromDegreeAngle {

    public static void main(String[] args) {
        System.out.println(coordinates(45.0, 1.0));
    }

    public static Point2D coordinates(double degrees, double radius) {
        double radians = Math.toRadians(degrees);
        return new Double(Math.round(radius * Math.cos(radians) * 10000000000L) / 10000000000.,
                Math.round(radius * Math.sin(radians) * 10000000000L) / 10000000000.);
    }
}
