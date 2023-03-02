import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter 3 Digits Number");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int compare=num;
        int rem, qout;
        rem = num % 100;
        qout = num / 100;
        int hun = qout;
        num = rem;

        rem = num % 10;
        qout = num / 10;
        int ten = qout;
        num = rem;

        rem = num % 1;
        qout = num / 1;
        int once = qout;
        num = rem;
        int total = 0, fac = 1;
        for (int i = 1; i <= hun; i++) {
            fac = i * fac;

        }
        total = total + fac;
        fac=1;
        for (int i = 1; i <= ten; i++) {
            fac = i * fac;

        }
        total = total + fac;
        fac=1;
        for (int i = 1; i <= once; i++) {
            fac = i * fac;

        }
        total = total + fac;
        System.out.println("The factorial of  is " + total);
        if(compare==total)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }


    }
}