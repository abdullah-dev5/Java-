import java.io.*;

public class FileStream {

public static void main(String [] args)
    {
        //File Stream

        //File Input Stream
        /*FileInputStream input =null;
        try{
             input = new FileInputStream("Things.txt");

           *//* //method # 1
            // by using While loop
            int data = input.read();
            while(data!=-1)
            {
                System.out.write(data);
                data=input.read();
            }
*//*
           //method # 2
            // //to print we can do it with another method
            *//*for(int n = input.read(); n !=-1; n=input.read())//it runs till the -1 or empty.or not any byte present
            {
                System.out.write(n);
            }*//*

            // to print out whole Data we use array of bytes.
            //it will grab entire data instead of one byte by byte.
            byte [] dataArray = new byte[input.available()];
            input.read(dataArray);

            for(int i =0; i<dataArray.length; i++)
            {
                System.out.write(dataArray[i]);
            }

            System.out.flush();
        }
        catch (IOException exp){
            System.out.println(exp.getMessage());
    }
        finally {
            try {
                if(input!= null)
                input.close();
            }
            catch (IOException exp)
            {
                System.out.println(exp.getMessage());
            }
        }
*/


  //File Output Stream
        FileOutputStream output =null;
    try{

        output = new FileOutputStream("Things_2.2.txt");

        while(true)
        {
            int input = System.in.read();
            if(input==10)
                break;
            else{
                output.write(input);
            }

        }
    System.out.flush();
    }
    catch (IOException exp)
    {
        System.out.println(exp.getMessage());

    }
    finally {
        try
        {
            if(output!=null)
                output.close();
        }
        catch (IOException exp)
        {
            System.out.println(exp.getMessage());

        }
    }
















    }



}
