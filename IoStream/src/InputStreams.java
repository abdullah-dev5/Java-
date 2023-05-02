import java.io.*;
public class InputStreams {
    public static void main (String [] args)
    {
      //Concept # 1
           /*  try {
             int  num = System.in.read();//this is the method  without any parameter so, by default it reads integer from 0 to 255.

            System.out.write(num);//the output will be only one byte .it display only one byte of character
            // eg : input : Alan  output : A
            System.out.flush();
*/
         //Concept # 2
            /*   // for Multiple bytes write
            int [] array = new int [10];//it's asking 10 bytes of data
            for (int i =0; i<array.length; i++)
            {
                array[i] = System.in.read();//
            }
            System.out.println("Input Collected ");
            for(int j=0 ; j< array.length; j++)
            {
                System.out.write(array[j]);//so it's print only 10 bytes of data
            }
            //for suppose we input : nothing goes as planned.
            // the output would be : nothing goe
            System.out.flush();
        }
        catch (IOException exp)
        {
            System.out.println(exp.getMessage());
        }*/
        //Concept # 3
        //reading from File or Fetching from file
        /*try {
            FileInputStream input = new FileInputStream("InputDataFile.txt");
            while(true)
            {
                int data = input.read();
                if(data == -1)// negative
                {
                    System.out.println("\n End of the Streams");
                    break;
                }
                else{
                    System.out.write(data);
                }
                System.out.flush();
            }
        }
        catch (IOException exp)
        {
            System.out.println(exp.getMessage());
        }*/

        //Concept # 4
        //alternative way of concept # 2.
        //Chunks of Data
        //it is more accurate and faster then normal read methods. it's Comparatively Faster then cocnept # 2
        /*try
        {
            byte [] arrays  =new byte [50];
         //System.in.read(arrays);
           System.in.read(arrays, 5, 40);// here we can store or set in a range to store .
            for(int i =0; i < arrays.length; i++)
            {
                    System.out.write(arrays[i]);
            }
       System.out.flush();
        }
        catch(IOException exp)
        {
            System.out.println(exp.getMessage());
        }*/

        //Concept # 5
        //if we have plenty of data then what we do ?
        // then we don't know  the size of array
        //so, we have method that will read till the availiblity of data.
        /*FileInputStream input = null;
        try
        {
            input = new FileInputStream("InputDataFile.txt");
            byte [] arrays  =new byte [input.available()];//it will till the data is available .
            input.read(arrays);
            for(int i =0; i < arrays.length; i++)
            {
                System.out.write(arrays[i]);
            }
            System.out.flush();
        }
        catch(IOException exp)
        {
            System.out.println(exp.getMessage());
        }
        //this finally block is to close the input Stream.we
        finally {
            {
                // we can't do directly so we need another try block to Handle exception.
                try
                {
                    input.close();
                }
                catch (IOException exp)
                {
                   System.out.println( exp.getMessage());
                }
            }
        }
*/

        // Concept # 6
        // instead of concept 5 we have alternative of it.
        // here we added block with Try.
        // it will close or deal with close method automatically. we don't need to call close() method manually.
        try(FileInputStream input = new FileInputStream("InputDataFile.txt");)
        {
            byte [] arrays  =new byte [input.available()];//it will till the data is available .
            input.read(arrays);
            for(int i =0; i < arrays.length; i++)
            {
                System.out.write(arrays[i]);
            }
            System.out.flush();
        }
        catch(IOException exp)
        {
            System.out.println(exp.getMessage());
        }
    }

}
