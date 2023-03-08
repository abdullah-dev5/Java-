
import java.util.*;

public class RockPaper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        byte gameStart =1;

        while (gameStart==1) {
            System.out.println("Select a number between 1 to 3");

            System.out.println("1. Rock \n2. Scissors \n3. Paper ");
            int opt = sc.nextInt();
            int comp = rand.nextInt(3);

            if (comp == 0)
                System.out.println("Computer chose : Rock");
            else if (comp == 1)
                System.out.println("Computer chose : Scissors");
            else {
                System.out.println("Computer chose : Paper");
            }
            if (opt == 1 && comp != 0) {
                if (comp == 1) {
                    System.out.println("User enters : Rock");
                    System.out.println("User wins \n Rock smashes Scissor");

                } else if (comp == 2) {
                    System.out.println("User enters : Rock");
                    System.out.println("Computer wins\n Paper wraps Rock");

                }
            } else if (opt == 2 && comp != 1) {
                if (comp == 0) {
                    System.out.println("User enters : Scissor");
                    System.out.println("Computer wins \n Rock smashes Scissor");

                } else if (comp == 2) {
                    System.out.println("User enters : Scissor ");
                    System.out.println("User wins \n Scissor cuts Paper");

                }
            } else if (opt == 3 && comp != 2) {
                if (comp == 0) {
                    System.out.println("User enters : Paper ");
                    System.out.println("User wins \n paper covers Rock");
                } else if (comp == 1) {

                    System.out.println("User enters : Paper ");
                    System.out.println("Computer wins \n Scissor cuts Paper");
                }
            } else {
                System.out.println("Tied");
            }
            System.out.println("Do you want to play again? \nPress 1.Yes \nPress 2.No");
            gameStart=sc.nextByte();
        }
    }
}
