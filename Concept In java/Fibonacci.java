import java.util.Scanner;
public class Fibonacci {

    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the nth terms to find : ");
        int nthTerm=input.nextInt();
        int p=0;
        int q=1;
        int count =2 ;//we start with 2 as we know that the first two numbers are 0 and 1
        while (count<=nthTerm)
        {
            //by swapping  values
            int temp = q;
            q=q+p;
            p=temp;
            count++;
            System.out.println(q);

        }

    }
}
