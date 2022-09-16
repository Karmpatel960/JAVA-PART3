package Practical3;

/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM:
WAP that illustrate the interface inheritance. Interface

P is extended by P1 and P2 interfaces.

Interface P12 extends both P1 and P2. Each interface declares one method and
one constant. Create one class that implements P12. By using the object of the
class invokes each of its method and displays constant.*/
public class Main {
    public static void main(String[] args) {
        display q=new display();
        q.getP();
        q.getP1();
        q.getP2();
        q.getP12();
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
