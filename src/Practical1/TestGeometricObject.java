package Practical1;
/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM:
Create an abstract class GeometricObject as the superclass for Circle and
        Rectangle. GeometricObject models common features of geometric objects. Both
        Circle and Rectangle contain the getArea() and getPerimeter() methods for
        computing the area and perimeter of a circle and a rectangle. Since you can
        compute areas and perimeters for all geometric objects, so define the getArea() and
        getPerimeter() methods in the GeometricObject class. Give implementation in the
        specific type of geometric object. Create TestGeometricObject class to display area
        and perimeter of Rectangle and Triangle, compare area of both and display results.
        Design of all classes are given in the following UML diagram.*/
import java.util.Scanner;

public class TestGeometricObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle a = new Circle();
        Rectangle b = new Rectangle();
        System.out.println("Enter the Radius for Circle & Perimeter :");
        double qe = in.nextInt();
        double q = a.getarea(qe);
        double w = a.getPerimeter(qe);
        System.out.println("Enter the Length For Rectangle :");
        double l = in.nextInt();
        System.out.println("Enter the Height For Rectangle :");
        double h = in.nextInt();
        double e = b.getarea(l, h);
        double r = b.getPerimeter(l, h);
        GeometricObject n = new GeometricObject();
        n.compare(q,w,e,r);
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
