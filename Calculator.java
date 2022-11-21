import java.util.Scanner;

public class Calculator {
    public static int add1(int x,int y){
        int sum=x+y;
        return sum;
    }
    static int sub(int x,int y){
        int sub=x-y;
        return  sub;
    }
    static int mul(int x,int y){
        int mul=x*y;
        return mul;
    }
    public static void main(String[] args) {
        System.out.println("Enter number 1,2,3,4.../n 1 -Addition /n 2- Substraction /n 3-Multiplication /n 4-Division /n 5-Exit");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 1:
            System.out.println("Enter 2 numbers..");
            Scanner sc1=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);
            add1(sc1.nextInt(),sc2.nextInt());
            case 2:
                System.out.println("Enter 2 numbers..");
                Scanner sc3=new Scanner(System.in);
                Scanner sc4=new Scanner(System.in);
                System.out.println(sub(sc3.nextInt(),sc4.nextInt()));
            case 3:
                System.out.println("Enter 2 numbers..");
                Scanner sc5=new Scanner(System.in);
                Scanner sc6=new Scanner(System.in);
                System.out.println(mul(sc5.nextInt(),sc6.nextInt()));




        }

    }
}
