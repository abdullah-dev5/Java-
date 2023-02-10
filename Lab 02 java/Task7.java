import java.util.Scanner;
public class Task7 {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
        System.out.println ("Enter a Dividend  number ");
        double dividend = input.nextInt();
        System.out.println("Enter a divisor number ");
        double divisor = input.nextInt();
         double quotient = dividend / divisor;
         System.out.println("The quotient is " +quotient);
         System.out.println("The Roundoff value is " +Math.round(quotient));
    }
}
