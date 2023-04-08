import java.util.*;
class Tests{
    void display(char c,int count)
    {
        System.out.println("Alphabet : "+c+"  Occured : "+count);
   }
    void method(String str)
    {
        int count =0;
        char array []={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i=0; i<array.length;i++)
        {
            for(int j=0; j<str.length();j++)
            {
                if(array[i]==str.charAt(j))
                {
                    count++;
                }
            }
            if(count>1)
            {
                char char2 = str.charAt(i);
                display(char2,count);
                System.out.println("Alphabet : "+array[i]+"  Occured : "+count);
            }
            count = 0;
        }
    }
}
public class StringCount {
public static void main(String[] args)
    {
    Scanner obj = new Scanner(System.in);
    String strs = obj.nextLine();
    Tests test = new Tests();
    test.method(strs);
    }
}
