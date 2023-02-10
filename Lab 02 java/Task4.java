
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {

        int number = 200;

        for (int i = 0; i < number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }

        }

    }

}
