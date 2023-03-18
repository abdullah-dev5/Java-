import java.util.Random;

public class Recurrsive {
        int sum=0;
    static void rec(int n,int sum,int count)
    {
         count+=1;
        Random r =new Random();
        System.out.println(count+" : N is : "+n);
        sum+=n;

        System.out.println("The Sum is : "+ sum);
        if(n==2)
        {
            return ;
        }
        int ns= r.nextInt(8);

        rec(ns,sum,count);

    }


    public static void main (String []args)
    {
    int n=0;

        rec(n,0,0);


    }





}
class Main4 {




}