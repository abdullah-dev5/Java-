
import java.util.Scanner;
class Hello
{
	
public static void main(String args[])
{

	System.out.println("	Pindari Programmers	");
	System.out.println("  Welcome to the hell of programming");
	System.out.println("  program : Take input ");
	
	
	
	Scanner s=new Scanner(System.in);
	System.out.println(" Enter the Integer INput ");
	int a=s.nextInt();
	System.out.println("  input in integer : "+a);
		
	System.out.println(" Enter the Double INput ");
	double b=s.nextDouble();
	System.out.println(" input in Double : "+b);
	
	System.out.println(" Enter the Single Word  INput in String ");
	String c=s.next();// for  only we use 
	System.out.println("  input in String single word : "+c);
	
	Scanner t= new Scanner(System.in);//due to techincal issue we make another scanner command line
	System.out.println(" Enter the String INput ");
	String d=t.nextLine();
	System.out.println("  input in String : "+d);
	// for character we make this cause their is no specific type for char
	char ch=s.next().charAt(0);
	System.oyut.println("here Enter Character");
	System.out.println("Character is "+ch);
}
}	