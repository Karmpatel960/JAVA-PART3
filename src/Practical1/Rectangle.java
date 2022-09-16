package Practical1;

public class Rectangle {
    public double getarea(double l,double h){
        System.out.println("The Area of Rectangle is "+l*h);
        return(l*h);
    }
    public double getPerimeter(double l,double h){
        System.out.println("The Perimeter of Rectangle is "+2*(l+h));
        return(2*(l+h));
    }
}
