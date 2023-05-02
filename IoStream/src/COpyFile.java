import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class COpyFile {

    public static void main(String [] args)
    {
        FileOutputStream foutput = null;
        FileInputStream finput = null;
        try
        {
            finput = new FileInputStream("InputCOpyFile.txt");
            foutput= new FileOutputStream("OutputCOpyFile.txt");

            byte[] data = finput.readAllBytes();// save all Data into array or copy from file to Array

            foutput.write(data);//then Array will be save or Copy all data

        }
        catch (IOException exp)
        {
            System.out.println(exp.getMessage());
        }
    finally
        {
             try {
                if(finput   !=null && foutput  !=null)
                {
                    finput.close();
                    foutput.close();
                }
                 if( foutput  !=null)
                 {

                     foutput.close();
                 }

            }
            catch (IOException exp)
            {
                System.out.println(exp.getMessage());
            }
        }



    }

}
