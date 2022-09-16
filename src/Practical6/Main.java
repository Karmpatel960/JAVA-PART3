package Practical6;


/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM:
Write a program that demonstrates use of packages & import statements.*/
import static Practical6.sum.tosum;
import static Practical6.Multix.tomultiplay;


public class Main {
        public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=tosum(a,b);
        int d=tomultiplay(a,b);
        System.out.println(c+" "+d);
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }

}
