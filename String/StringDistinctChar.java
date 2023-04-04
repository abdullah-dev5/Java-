//String with k distinct characters and no same characters adjacent ..

//Given n and k, print a string that has n characters.
// The string should have exactly k distinct characters and no adjacent positions.
//Examples:
//Input  : n = 5, k = 3
//Output :  abcab
//Explanation: 3 distinct character a, b, c
//and n length string.

import java.util.*;
public class StringDistinctChar  {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of words");
        int n = obj.nextInt();
        System.out.println("Enter number  of distinicts ");
        int k = obj.nextInt();


            // Initialize result with first k
            // Latin letters
            String res = "";

            for (int i = 0; i < k; i++)
                res = res + (char)('a' + i);

            // Fill remaining n-k letters by
            // repeating k letters again and
            // again.
            int count = 0;

            for (int i = 0; i < n - k; i++)
            {
                res = res + (char)('a' + count);
                count++;

                if (count == k)
                    count = 0;
            }

            System.out.println(res);


        }


}
