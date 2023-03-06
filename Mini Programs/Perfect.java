/*
perfect number, a positive integer that is equal to the sum of its proper divisors.
 The smallest perfect number is 6, which is the sum of 1, 2, and 3
 */
import java.util.Scanner;
public class Perfect {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int save=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(i<n) {
                    System.out.println(i);
                    save+=i;
                }
            }
        }
        if(save==n)
        {
            System.out.println("it's a perfect number");
        }
        else {
            System.out.println("it's not a perfect number");
        }
    }


}
