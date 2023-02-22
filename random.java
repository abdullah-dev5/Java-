import java.util.Scanner;
import java.util.Random;

public class random {

    public static void main(String[] args)
    {
        Scanner  obj = new Scanner(System.in);
        Random r = new Random();


        byte option=1;
        while (1==option)
        {

            String st="";
            for(int i = 0; i < 12; i++)
            {
                if(i==0 ||i==1 || i==2)
                {
                    st+=r.nextInt(8);
                }
                else if(i==3 || i==7)
                    st+="-";
                else if( i<7&& i>3)
                { if(i==4)
                    st+=r.nextInt(9);
                else if(i==5)
                    st+=r.nextInt(4);
                else
                    st+=r.nextInt(2);
                }
                else
                {
                    st=st + r.nextInt(10);
                }
            }

            System.out.println(st);

            System.out.println("Do you wanna generate more .. press 1 to generate more");
            option=obj.nextByte();


        }


       }
}
