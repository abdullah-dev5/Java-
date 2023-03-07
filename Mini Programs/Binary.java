import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        System.out.println("Enter binary number");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int save = 0;
        int[] arr = new int[number.length()];
        if (number.length() > 7 && number.length() < 9) {
            for (int i = 0; i < number.length(); i++) {
                arr[i] = (int) (number.charAt(i));
                if (arr[i] == 49) {
                    switch (i) {
                        case 0:
                            save += Math.pow(2, 7);
                            break;
                        case 1:
                            save += Math.pow(2, 6);
                            break;
                        case 2:
                            save += Math.pow(2, 5);
                            break;
                        case 3:
                            save += Math.pow(2, 4);
                            break;
                        case 4:
                            save += Math.pow(2, 3);
                            break;
                        case 5:
                            save += Math.pow(2, 2);
                            break;
                        case 6:
                            save += Math.pow(2, 1);
                            break;
                        case 7:
                            save += Math.pow(2, 0);
                            break;
                    }
                }
            }
            System.out.println("The binary number is : " + number);
            System.out.println("The Deecimal value is : " + save);
            System.out.println("The Character is : " + (char) save);

        }
    }
}
