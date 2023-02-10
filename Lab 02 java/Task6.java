import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int odds[] = new int[15];
        int index = 0;
        for (int i = 1; i <= 30; i++) {

            if (i % 2 == 1) {
                odds[index] = i;
                index++;
            }
        }
        for (int j = 0; j < odds.length; j++) {
            System.out.println(odds[j]);
        }
    }
}

