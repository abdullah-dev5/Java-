import java.util.Scanner;
import java.util.*;
class Tests
{
    void method (String sent)
    {
        int count=0;
        int len = sent.length();
        for(int i = 0; i < len; i++)
        {
            if(sent.charAt(i)==' ')//space char will ignored
                continue;
            for(int j = i; j < len; j++)
            {

                if(sent.charAt(i)==sent.charAt(j) && sent.charAt(j)!='0')//to avoid checking of replaced
                {
                    count++;//it will count repeated char

                }
            }
            if(count >1 )
            {

                System.out.println("Alphabet : "+sent.charAt(i)+"  Occurrences : "+count);
                char c = sent.charAt(i);
                String s = Character.toString(c);//first convert char into string
                sent=sent.replaceAll(s,"0");//then replace all occurrences of char with 0

            }
            count = 0;
        }
    }
}
public class StringCharCount {
    public static void main(String[] args)
    {
        System.out.println("Enter String");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Tests test = new Tests();
        test.method(str);
    }
}
