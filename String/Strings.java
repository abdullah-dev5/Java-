//Write A Program to find out the Largest and smallest word inside the the String .
import java.util.*;
public class Strings {
    int large;
    int small;
    int smallest;
    int largest;
    Strings(int large, int small, int smallest, int largest){
         this.smallest=smallest;
         this.largest=largest;
         this.large=large;
         this.small=small;
    }
   public  void display(String strArray[])
   {
        System.out.println("The Smallest word is : "+strArray[small]);
       System.out.println("The Largest word is : "+strArray[large]);
   }
   public  int lengthOfArray(String strL)
   {
       int count=1;
       for (int i = 0; i < strL.length(); i++)
       {
           if(strL.charAt(i) == ' ')
           {
               count++;
           }
       }
       return count;
   }
   public void longSmall(int save, int i, int iterations)
   {

       int lenWord;

       lenWord=i-save;

       if(smallest>lenWord) {
           smallest  = lenWord;

           small=   iterations;
       }
       if(largest<lenWord) {
           largest= lenWord;
           large = iterations;
       }
   }
    public  void method(String str)
    {   int save;

        int iterations;
        int strt =0;

        String[] strs = new String[lengthOfArray(str)];
        iterations=0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                strs [iterations]=str.substring(strt,i);
                save=strt;
                longSmall(save,i,iterations);

                strt=i;
                iterations++;
                if(iterations==(lengthOfArray(str)-1))
                {
                    strs[iterations] = str.substring(strt,str.length());
                    longSmall(strt,str.length(),iterations);
                }
            }
        }
       display(strs);
    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = obj.nextLine();
       Strings s = new Strings(0,0,str.length(),0);
        s.method(str);
    }
}
