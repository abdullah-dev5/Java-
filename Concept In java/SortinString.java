
import java.util.*;
import java.lang.*;

public class SortinString {
    public static void main(String[] args) {

        String str = "1234567890";
        String str2 = "zyxwas";

        str2 = sortString(str2);

        System.out.println(str2);
        //will print (aswxyz)
    }
        public static String sortString(String s){
            char temp[]=s.toCharArray();
            Arrays.sort(temp);
            return new String(temp);
        }
}
