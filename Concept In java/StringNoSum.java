 //this Program will Extract the numbers from a given string the sum it
import java.util.Scanner;
import java.lang.*;

public class StringNoSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String with any numbers");
        String input = scanner.nextLine();
        int sum = sumMethod(input);
        System.out.println("The Sum is : "+sum);
    }
    public static int sumMethod(String name) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) > 47 && name.charAt(i) < 58)//we are only interested in numbers
                //so we are going to check if the character is a number the number is greater than 47 and less than 58
            {
                sum += Integer.parseInt(String.valueOf(name.charAt(i)));
                //name.charAt(i) is a character from the string
                //String.valueOf(name.charAt(i)) is a method to convert a character to a String
                //Integer.parseInt() is a method to convert String to an integer
            }
        }
        return sum;
    }
}
