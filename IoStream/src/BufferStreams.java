import java.io.*;

public class BufferStreams {
    public static void main(String [] args)
    {

        FileOutputStream foutput = null;
        FileInputStream finput = null;
        BufferedInputStream bfInput =null;
        BufferedOutputStream bfOutput = null;
        try
        {
            finput = new FileInputStream("BufferInputFile.txt");
            foutput= new FileOutputStream("BufferOutputFile.txt");
            bfInput = new BufferedInputStream(finput);
            bfOutput = new BufferedOutputStream(foutput);

            for(int n =bfInput.read(); n !=-1; n=bfInput.read())
            {
                bfOutput.write(n);
            }


        System.out.flush();

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
                   bfInput.close();
                    bfOutput.close();
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
