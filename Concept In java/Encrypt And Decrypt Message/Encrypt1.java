import java.util.Scanner;

public class Encrypt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        String message;
        String password;
        String taken = null;//null assigned to a variable
        while (option != 4) {


            System.out.println("1. Send a Secure and Encrypted Message" +
                    "\n" +
                    "2. View Encrypted message" +
                    "\n" +
                    "3. Decrypt and view the Original Message (Password Protected)" +
                    "\n" +
                    "4. Exit");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Enter the message to be encrypted");
                sc.nextLine();
                message = sc.nextLine();
                taken = method(message);//

            } else if (option == 2) {
                System.out.println(taken);
            } else if (option == 3) {
                System.out.println("Enter the password");
                sc.nextLine();
                password = sc.nextLine();

                if (password.equals("ALAN111")) {
                    message = method(taken);
                    System.out.println(message);
                }
            } else {
                break;
            }
        }


    }

    public static String method(String message) {
        char key = 'A';//it helps to perform the operation with String
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            encryptedMessage += Character.toString((char) (message.charAt(i) ^ key));
            //message.charAt(i) the  letter and key will be do operation using Xor operator
            //like 'A' has dec 65 value. and 'B' has dec 66
            // when XOR operator perform the operation with 'A' and 'B' it will be return 3
            //then we do type casting the result of the Xor operator to char data type
            //Character.toString is used to convert a character to a string
        }
        return encryptedMessage;
    }

}
