import java.util.*;
  public class ArraylistExample {

    public static void main(String[] args) {
        //Syntax of ArrayList
        ArrayList<String> list = new ArrayList<String>(10);//we set default length to arraylist later we can change
        //Arraylist is a class.
        // we use String As data type.Note we cannot use primitive Data type. instead of that we use
        //wrapper classes. like Integer,Double,String,Character. .
        // list is a Reference variable
        list.add("Java");
        list.add("helloo");
        list.add("close");
        list.add("instance");
        list.add("nope");
        System.out.println(list);
        System.out.println(list.contains("helloo"));//it will return true when the list contains a String value that is equal to "helloo".

        list.set(2, "Helllo");//to chjange the value of index 2
        System.out.println(list);

    }
}
 