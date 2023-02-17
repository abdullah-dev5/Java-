import java.util.Scanner;
public class Prct {
    //int c=input.nextInt();
    public static void main(String[] args) {
        int character[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            character[i]=input.nextInt();
        }
        for (int i = 0; i<5; i++)
        {
            character[i]=character[i]+1;

        }

        for(int i=0; i<5; i++)
        {
            System.out.println(character[i]);
        }
    }
}