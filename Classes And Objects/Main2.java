/* the program will Clarify the Concept of Object as Paramter of Constructor
How we Can use Object as Paramter in  another constructor.
 */
 class Constructor {

    private double width;
    private double height;
    private double length;
    Constructor()//When we made paramterized Constructor it Override default constructor so, we need to declared deafult constructor
    {
        width=height=length=0;
    }
     Constructor(double w, double h, double l)//this is paramterized constructor which have values
     {
            width=w;
            height=h;
            length=l;
     }
    Constructor (Constructor obj)//This Const will accept object as a Paramter and assigned a argument objects values to the new object or copy we can say
    {
        width= obj.width;
        height= obj.height;
        length= obj.length;
    }
    void printData()
    {
        System.out.println("Width is "+width + " heigth is "+height+" length is : "+length);
    }
 }

    public class Main2{
    public static void main(String [] args)
    {
       Constructor object1 = new Constructor(34.3,45.6,32.3);
        object1.printData();

        Constructor object2 = new Constructor(object1);// we pass object as argument here
        object2.printData();// it will print the copy of object1


    }}
