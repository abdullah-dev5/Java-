import java.util.Scanner;
import java.lang.String;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Enter Fullname");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.print(name.charAt(0) + " ");
        int range = name.length();
        for (int i = 1; i < range; i++) {
            if (name.charAt(i) == ' ') {
                System.out.println(name.charAt(i + 1));
            }
        }


    }
}
