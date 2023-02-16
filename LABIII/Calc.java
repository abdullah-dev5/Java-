import java.util.Scanner;
import java.lang.String;
//this Program will perform the Substraction,Addition,Multiplication,Division,Modulus operation on two numbers.
//Square root of a number,And aslo power of a number.
public class Calc {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        char operation;
        int range;
        double out = 1;
        char option = 'y';
        while (option != 'n') {
            int save;
            System.out.println("1.Addition\n2.Subtraction\n3.Multi\n4.Division \5.Modulus \n6.Squareroot \n7.Power");
            operation = input.next().charAt(0);
            if (operation == '1') {
                System.out.println("Enter the range of numbers you wanna ADD: ");
                range = input.nextInt();
                out = 0;
                while (range > 0) {
                    System.out.println("Enter the number: ");
                    save = input.nextInt();
                    out = out + save;
                    range--;
                }
                System.out.println(out);
            } else if (operation == '2') {
                System.out.println("Enter the range of numbers ypu wanna Substract : ");
                range = input.nextInt();
                out = 0;
                while (range > 0) {
                    System.out.println("Enter the number: ");
                    save = input.nextInt();
                    out = out - save;
                    range--;
                }
                System.out.println(out);
            }
            if (operation == '3') {
                System.out.println("Enter the range of numbers ypu wanna Multi: ");
                range = input.nextInt();
                while (range > 0) {
                    System.out.println("Enter the number: ");
                    save = input.nextInt();
                    out = out * save;
                    range--;
                }
                System.out.println(out);
            } else if (operation == '4') {
                System.out.println("Enter the 1st  number  wanna Divide : ");
                range = input.nextInt();
                System.out.println("Enter the 2nd number  wanna Divide : ");
                save = input.nextInt();
                out = range / save;
                System.out.println(out);
            } else if (operation == '5') {
                System.out.println("Enter the 1st  number  wanna Divide : ");
                range = input.nextInt();
                System.out.println("Enter the 2nd number  wanna Divide : ");
                save = input.nextInt();
                out = range % save;
                System.out.println(out);
            } else if (operation == '6') {
                System.out.println("Enter the number: ");
                save = input.nextInt();
                out = Math.sqrt(save);
                System.out.println(out);
            } else if (operation == '7') {
                System.out.println("Enter the number: ");
                save = input.nextInt();
                System.out.println("Enter power : ");
                range = input.nextInt();
                out = Math.pow(save, range);
                System.out.println((int) out);
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("Do you want to continues: ");
            option = input.next().charAt(0);
        }
    }
}
