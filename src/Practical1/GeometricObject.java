package Practical1;

public class GeometricObject {
    public double compare(double q,double w,double e, double r) {
        if (q > e) {
            System.out.println("The Area of Circle is More");
        }
        if (q < e) {
            System.out.println("The Area of Rectangle is More");
        }
        if (w > r) {
            System.out.println("The Perimeter of Circle is More");
        }
        if (w < r) {
            System.out.println("The Perimeter of Rectangle is More");
        }
        return 0;
    }
}
