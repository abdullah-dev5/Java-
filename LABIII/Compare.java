import java.util.Scanner;
import java.lang.String;
public class Compare {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Word");
        String str1 = input.next();
        System.out.println("Enter another Word");
        String str2 = input.next();

       boolean check= str1.equalsIgnoreCase(str2);
        //we use equalIgnoreCase it will consider same capital and same
       //we can use equals  but it will differentiate b/w UpperCase and LowerCase3
        if(check==true)
        {
            System.out.println("The words are same ");
        }
        else
        {
            System.out.println("The words are not  same ");
        }
    }
}

