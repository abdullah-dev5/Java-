
import java.io.*;


public class OutputStream {

    public static void main(String []  args )
    {

/*

         System.out.write(75);//it saves in temp buffer//it accept 75 as Ascii code
         System.out.flush();//to make sure empty temperary buffer or memory space which we created above
*/
            for(int i =30; i< 127; i++)
            {
                System.out.write(i);
            }
        System.out.flush();
            System.out.println();

            String data = "Alan it's me here  coola !";
            byte [] array = data.getBytes();

            try
            {
                System.out.write(array);

            }
            catch (IOException exp)
            {

                System.out.println(exp.getMessage());
            }
            finally {
                System.out.close();//we used it in finally block b/c we get or not exception . it will always excute finally block.
            }
            System.out.flush();//remove all the stuffs from buffer or memory

    }


}
