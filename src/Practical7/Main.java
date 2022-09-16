package Practical7;


/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM:
Write a program that illustrates the significance of interface default method.*/
interface Testmain
{
    default void show()
    {
        System.out.print("Default Method Executed and\nMultiplication is ");
    }
}
public class Main implements Testmain{
    public void square(int a)
    {
        System.out.print(a*a);
    }
    public static void main(String[] args) {
        Main a = new Main();
        a.show();
        a.square(5);
        System.out.println("\nPrepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
