//This Program is a simple program to demonstrate the use of Object as paramter for the method
/* This programm will differentiate Between the Call By Reference and Call By Value */
class Swapping {
        int a;//instance variable are used in call by reference
        int b;
    /*  void pass_by_Value(int a, int b)//we need only this method to pass by value
      {
          int temp=a;
          a=b;
          b=temp;
      }*/
        Swapping() {
        a=b=0;
        }
        Swapping(int a, int b)// this Paramterized basically use to intializing the values of a  and b
        {
        this.a = a;
        this.b = b;
        }
        void pass_by_Ref(Swapping obj)//we can pass object as Paramter to a method as well
        // here the method is accpting object as paramter
        {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        }
        }
public class Main1{
    public static void main(String [] args)
    {
      /*  Swapping  obj = new Swapping();

        int a=30;
        int b=50;
        System.out.println("Before Swapping");
        System.out.println(" a : "+a+" b : "+b);//a=30, b=50
        obj.pass_by_Value(a,b);
        System.out.println("After Swapping");
        System.out.println(" a : "+a+" b : "+b);// a=30, b=50  values will be same beacuse it copys not change the originals
        */
        //Following code is for passing by reference
        int a=10,b=20;
        Swapping obj2 = new Swapping(a,b);
        System.out.println("Before Swapping");
        System.out.println(" a : "+obj2.a+" b : "+ obj2.b);//a=10, b=20

        obj2.pass_by_Ref(obj2);//pass object as Arguement in method of same Class
        System.out.println("After Swapping");
        System.out.println(" a : "+obj2.a+" b : "+ obj2.b);//a=20, b=10

    }
}
