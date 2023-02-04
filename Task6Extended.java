import java.util.Scanner;

public class Task6Extended {

    public static void main(String[] args)
    {
        System.out.println("Enter the Number you want ");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int index=0;
        //below loop will help us to know the length of array
        //every time loop find odd number will increment in index
        // and it will use as length of array
        for(int i = 1 ; i <= limit; i++)
        {
            if(i % 2 == 1)
            {
                index++;
            }
        }
        //here we declare the array
        int odds []=new int[index];

        index=0;
        //intial value of index will be zero
        //here index varaible is used for different purpose
        //every time loop find odd number will increment in index and save into array
        for(int h=1; h<limit; h++)
        {
            if(h%2 == 1) {
                odds[index] = h;
                index++;
            }
        }
        //this loop print out the array values
        for(int  j=0; j <odds.length; j++)
        {
            System.out.println(odds[j]);
        }
    }

}

