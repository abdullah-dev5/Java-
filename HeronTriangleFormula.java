import java.util.*;
public class HeronTriangleFormula {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side A: ");
        int a = input.nextInt();
        System.out.println("Enter the side B: ");
        int b = input.nextInt();
        System.out.println("Enter the side C: ");
        int c = input.nextInt();


        double perimeter=(double)(a+b+c)/2;

        double area=Math.sqrt(perimeter*((perimeter-a)*(perimeter-b)*(perimeter-c)));

        System.out.println("The perimeter is "+perimeter);
        System.out.println("The area is "+String.format("%.2f",area));//String.format("%.2f",area) ios used to set precision to 2


    }


}
