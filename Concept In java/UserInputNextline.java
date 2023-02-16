import java.util.Scanner;

public class UserInputNextline {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Birth Year : ");
        int age = input.nextInt();
        input.nextLine();//handle Next Line character (enter key)
        //when run program it ignore the name varaible so avoiding this we
        // keep it mind that after reading the Number with Scanner add input.nextLine();
        System.out.println("Enter FullName  ");
        String name = input.nextLine();
        System.out.println("Your Fullname is " + name);
        System.out.println("Your Age is " + (2023 - age));


    }


}
