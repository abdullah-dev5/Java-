
import java.util.Scanner;
public class LabelBreak {

    public static void main(String[] args) {
        //A program in which user enter any negative or less than 0 program should terminate with iterations
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
            outer:// this is called label .. note outer and inner are not keywords we can labelize using word and after that we write colon( : )
        for(int i=0; i<5; i++)
        {
            System.out.println("i is "+ i);
            inner:
            for(int j=1; j<5; j++)
            {
                if(n<0)
                {
                    break outer;//if we use only break it will terminate inner or nested loop .
                    //instead of only break we use break with label . it helps us to terminate whole loop
                }
                System.out.println("j is "+ j);
            }
        }
    }
}
