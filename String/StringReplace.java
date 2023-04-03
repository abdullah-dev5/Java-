import java.util.*;
public class StringReplace {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String realSent = obj.nextLine();

        int opt = 1;
        while (opt == 1) {
            System.out.println("Enter which woprd you wanna replace ");
            String wordToReplace = obj.next();
            System.out.println("Enter word replacing ");
            String replacing = obj.next();
            System.out.println(realSent.replace(wordToReplace, replacing));
            System.out.println("Do you wanna replace more words ? \n press 1 to conitnue \n otherwise press any number except 1");
            opt= obj.nextInt();
        }
    }
}
