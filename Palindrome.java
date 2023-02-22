import java.util.Scanner;
import java.lang.String;

public class Palindrome {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[] inputArray = new String[5];
        System.out.println("Please Enter Five Words");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Enter Words NO " + (i + 1) + " : ");
            inputArray[i] = input.next();
        }
        System.out.println("==========================");
        System.out.println("Words \t" + "Palindrome ");
        System.out.println("==========================");
        for (int i = 0; i < inputArray.length; i++) {

            boolean results = palindromemethod(inputArray[i]);
            if (results == true) {
                System.out.println(inputArray[i] + "\t Yes ");
            } else {
                System.out.println(inputArray[i] + "\t No ");
            }
        }
    }
    public static boolean palindromemethod(String palindrome) {
        int index = (palindrome.length() - 1);
        boolean check = false;
        palindrome = palindrome.toLowerCase();//we converted the string to lowercase beacuse case doesn't matter matters'
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.charAt(i) == palindrome.charAt(index)) {
                check = true;
                index--;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }
}
