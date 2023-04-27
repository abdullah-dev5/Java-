import java.io.IOException;
import java.util.*;
import java.io.*;


public class Main {

    public static void writeFile (String fileName,ArrayList<String> data )
    {
    try {
     FileWriter fw = new FileWriter(fileName);//creating file
        // FileWriter fw = new FileWriter(fileName,true);//it won't Override it save info again and again
        //this above object can help us in transactions reports . just add " true ".to avoid ovrriden info in file
    PrintWriter pw = new PrintWriter( fw);//Wrapp filewriter class or filtered
    for(int i =0; i<data.size(); i++)
    {

        pw.println(data.get(i));//to print data
    }
    pw.close();//avoid to corrupt the data or avoiding if something gone wrong
    fw.close();
    }
    catch(IOException e)
        {

    System.out.println(e.getMessage());
        }

    }
public static void readFile(String fileName, ArrayList <String> data) {

    FileReader fr;
    BufferedReader br;
    try {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null )
        {
            data.add(line);
        }


        br.close();
        fr.close();
    }
    catch (IOException exp)
    {
        System.out.println(exp.getMessage());
    }

    }

    public static void main(String[] args) {


    ArrayList<String> items = new ArrayList<>();
/*
items.add("Buckets");
items.add("Duck");
items.add("Umberalla");
items.add("Rain");
items.add("mobile");
*/
readFile("Data.txt",items);//reading data from File and display

 for(String s : items)
        {
         System.out.println(s);

        }

//writeFile("Data.txt",items);//for output to File
//Output

    /*  for(int i =0; i<items.size(); i++)
         {
            System.out.println(items.get(i));
         }*/







    }
}