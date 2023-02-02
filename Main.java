import java.util.Scanner;
public class Main {


   public static double point1ToPoint2(int x1, int y1, int x2, int y2)
    {
        double result=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
      //  System.out.println("The Distance b/w Point A to Point B is "+result);
        return result;
    }
    public static double point2ToPoint3(int x1, int y1, int x2, int y2)
    {
        double result=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        //System.out.println("The Distance b/w Point B to Point C is "+result);
        return result;
    }
    public static double point3ToPoint4(int x1, int y1, int x2, int y2)
    {
        double result=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    //    System.out.println("The Distance b/w Point C to Point D is "+result);
        return result;
    }
    public static double point4ToPoint1(int x1, int y1, int x2, int y2)
    {
        double result=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        //System.out.println("The Distance b/w Point D to Point A is "+result);

    return result;
    }






    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point A Coordinate's");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter Point B Coordinate's");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter Point C Coordinate's");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter Point D Coordinate's");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

    double p1  = point1ToPoint2(x1,y1,x2,y2);
    double p2  = point2ToPoint3(x2,y2,x3,y3);
        double p3  =  point3ToPoint4(x3,y3,x4,y4) ;
        double p4  = point4ToPoint1(x4,y4,x1,y1);
        double perimeter=p1+p2+p3+p4;
    System.out.println("The Perimeter of the Rect is "+perimeter);
        }

}