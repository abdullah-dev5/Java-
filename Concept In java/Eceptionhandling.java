import java.util.Scanner;
import java.lang.*;
public class Eceptionhandling {
    public static void main(String[] args) throws Exception {
//method No 1
/*
        System.out.println("Enter your Age : ");
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        System.out.println("Your age is : "+age);

        if(age < 18){
                throw new Exception ("You are under 18");
        }
        else {
            System.out.println("Your age is over : ");
        }
*/

//method 2
/*try
    {
   //     int results=15/0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();//Enter a Integer value like 1
        System.out.println("Entee 2nd Number : ");
        int num2 = scanner.nextInt();// Enter any thing except Integer
    }
        catch( Throwable ex){
    System.out.println("The Number should be Integer");
    System.out.println(ex.getMessage());
    }*/
    //Method 3
        try{
            int num=5;
            int num2=0;
            System.out.println(num/num2);
        }
        catch(Throwable ex){

            System.out.println("Error within code ");
            ex.printStackTrace();//
        }
        finally{
            System.out.println("Thanks for exceution ");//it is used tp print more information
        }

}}
