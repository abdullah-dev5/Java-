import java.util.*;
import java.lang.Character;
public class password {


        public String method(int length )
        {String pass="";
            int save;
            char ch;
            Random rand = new Random();
            for( int i=0; i<length; i++ )
            {
                save= rand.nextInt(70)+40;
                ch =(char) save;
                pass+=Character.toString(ch);

            }


            return pass;
        }
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter length");
            int length = obj.nextInt();
            password ps = new password();
            if (length > 6 && length < 13) {

            System.out.println(ps.method(length));
            }
            else {
                System.out.println("incorrect length");
            }
        }

}