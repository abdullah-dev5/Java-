import java.util.Scanner;
import java.lang.String;
public class Palindrome {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Word");
        String palindrome = input.next();
       int index=(palindrome.length()-1);//this index will use for the inverse iterations of the strings
        //ands helps us to compare the string
       boolean check=false;
        for (int i =0 ; i <palindrome.length() ; i++)
        {
            if(palindrome.charAt(i)==palindrome.charAt(index))
            {
                check=true;//it will true if the character at the index is the same as the character at the index of the inverse iteration
                index--;
            }
            else
            {
                check = false ;
                break;//if the character at the index is not the same as the character at the index of the inverse iteration it teriminate checking
            }
        }
                if(check==true)
                {
                    System.out.println("palindrome");
                }
            else {
                System.out.print("not palindrome");
                }
    }

}
