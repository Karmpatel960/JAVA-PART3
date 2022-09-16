package Practical5;

/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM:
Write a java program which shows importing of classes from other user define
packages.*/
import static Practical6.Multix.tomultiplay;
import static Practical6.sum.tosum;
import static Practical5.division.todivide;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = tosum(a, b);
        int d = tomultiplay(a, b);
        int e = todivide(a,b);
        System.out.println(c + " " + d + " " + e);
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
