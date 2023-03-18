import java.util.*;
public class GCD {


    public static int methodGCD(int num1, int num2) {
        int gcd=1;
       /* int size; //loop condition 1
        if(num1<num2)
            size = num1;
            else{
                size = num2;
        }
        for(int i=1;i<=size;i++)*/
        for(int i=1; i<=num1 && i<=num2; i++)// loop co ndition 2
        {
            //System.out.println(" "+i);
            if(num1%i == 0 && num2% i== 0)//if both the condition satisfy then it save i in gcd variable
                 gcd=i;

        }


    return gcd;}

    public static void main(String[] args)
    {
        Scanner  obj = new Scanner(System.in);
        System.out.println("Enter 1st Integer : ");
        int x=obj.nextInt();
        System.out.println("Enter 2nd Integer : ");
        int y=obj.nextInt();

        int results=methodGCD(x,y);
        System.out.println("The Greatest Common Divisor is :  "+results);

    }




}
