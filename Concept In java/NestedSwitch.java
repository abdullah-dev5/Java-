
import java.util.*;
public class NestedSwitch {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input=sc.nextInt();

        switch(input)
        {
            case 1:
                System.out.println("This is outer Switch Case 1");
                switch(input)
                {
                    case 1:
                        System.out.println("Hello this is nested switch");
                        break;
                    default:
                        System.out.println("Default case of nested switch");
                }

                break;
            default:
                System.out.println("Default case of outer switch");



        }



    }


}
