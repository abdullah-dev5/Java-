import java.util.Scanner;
public class Task5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a ");
        int a=sc.nextInt();
        if(a=!0)
        {
            System.out.println("Enter value of b ");
            int b=sc.nextInt();
            System.out.println("Enter value of c ");
            int c=sc.nextInt();

            double x=(- b + Math.sqrt(Math.abs(b*b) - 4*a*c) )/(2*a);
            double y=( - b - Math.sqrt(Math.abs(b*b) - 4*a*c) )/(2*a);
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
        else{
            System.out.print("Warning 'A' should not equal to 0 ");
        }
    }
}
