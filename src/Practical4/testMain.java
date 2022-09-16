package Practical4;

/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM:
Develop a Program that illustrate method overriding concept.*/
public class testMain extends Main {
        void run()
        {
            System.out.println("TestMain is  running");
        }

        public static void main(String[] args){
            testMain obj = new testMain();
            obj.run();
            System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
        }
}
