import java.util.Scanner;
import java.lang.String;
public class reverse {//Program will reverse a string
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String reverse = input.next();
        int len = reverse.length();
        //length of the string will get through it and used for the reverse loop
        for (int i = (len - 1); i >= 0; i--) {
            System.out.print(reverse.charAt(i));//we will print the characters in reverse order
        }
    }
}
