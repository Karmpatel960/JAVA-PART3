package Practical2;

import java.util.Scanner;
import java.util.Vector;

/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM:
Write a program to create a default method in an interface IPrinter. Create
an interface IPrinter and IScanner. You can assume variables and methods for both
interfaces. Create a concrete class to implement both the interfaces. Create 5 objects of the
class, store it in Vector and display the result of the vector.*/
interface IPrinter
{
    void method1();
}
interface IScanner
{
    void scanmethod1();
}
public class Main implements IPrinter,IScanner {
    Vector<Integer> v = new Vector<>();
    Scanner in = new Scanner(System.in);
    int n=5;

    public void scanmethod1()
    {
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(5);
        v.add(4);
    }
    public void method1()
    {
        System.out.println(v);
        System.out.println("implementation of Print method1");
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.scanmethod1();
        obj.method1();
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }

}
