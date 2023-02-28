import java.util.*;
public class Array2DInputOutput {

    public static void main(String[] args)
    {
        int array [][] = new int[3][3];
        Scanner sc = new Scanner(System.in);


        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)//every row has nested array so the length of index or row is the length of columns in index
            {
                System.out.print("Enter the value of element " +"row : "+ (row+1) +" colums : "+(col+1)+ " ");
                array[row][col] = sc.nextInt();

            }
        }//input loop

            for(int i = 0; i < array.length; i++)//ouput loop
            {
                for(int j = 0; j < array[i].length; j++)
                {

                    System.out.print(array[i][j]+" ");

                }
                System.out.println();
            }
    }
}
