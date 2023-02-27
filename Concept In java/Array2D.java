public class Array2D {
    public static void main(String[] args)
    {

        //null is a special literal
        //Arrays.toString(array) it will print out the array by converting them into String.this a method
        //So we have three different ways to print the array
        //first using for loop
        //second using for each loop
        // third using method called Array.toString() here Array is a Class which have method called toString()


        int [][] arr={{1,2,3,},{23,5,6,5},{2,5,6,6,7,}};// here we have 3 rows and but  not same number of columns or we say that
        //wehave different length of the rows .number of members are different in each row..

        for (int row = 0; row < arr.length; row++)
        {
            //the every array has a nested array inside it. which we called columns.
            // so outer array as inner array and for their length for loop will be length of that indexes array.
            for(int col = 0; col < arr[row].length; col++)//the length  of inner columns for loop is matters here
                //for suppose index 0 have array size of 3
                {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}