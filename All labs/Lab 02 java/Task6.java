import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter range ");
      int len=0;
      //Following Loop will take the Length for the Array in which we save Odds Numbers
        for(int k=0; k<num; k++)
        {
            if(k% 2==1 )
            {
                len++;
            }
        }

        int odds[] = new int[len];
        int index = 0;// index is iteration for the array's index
        //following loop will save odd numbers into array
        for (int i = 1; i <= num; i++) {

            if (i % 2 == 1) {
                odds[index] = i;
                index++;
            }
        }//Following Loop will Print array value's
        for (int j = 0; j < odds.length; j++) {
            System.out.println(odds[j]);
        }
    }
}

