import java.util.Scanner;
import java.lang.String;

public class Vowel {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Word");
        String vowel = input.next();

        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        for(int j=0; j<vowel.length(); j++)
        {
            if(vowel.charAt(j)==('A' | 'a'))
            {
                a++;
            }
            else if(vowel.charAt(j)==('E' | 'e'))
            {
                e++;
            }
            else if(vowel.charAt(j)==('I' | 'i'))
            {
                i++;
            }
            else if(vowel.charAt(j)==('o' | 'O'))
            {
                o++;
            }
            else if(vowel.charAt(j)==('U' | 'u'))
            {
                u++;
            }

        }
        System.out.println("A appeared in :"+a+" \n E appeared in :"+e+"  \n I appeared in :"+i+"  \n O appeared in :"+o+"  \n U appeared in :"+u);
    }
    }
