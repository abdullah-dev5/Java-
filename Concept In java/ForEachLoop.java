public class ForEachLoop {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};//Initialing array;
        int sum=0; // initializing variable in which addition will be stored;
        for(int add : arr)//it will iterate through the array;
        { //using for each loop it is a loop which is used insted of for loop;
            sum+=add; // all the members of array will be added together;
        }//it will eun till the end of the array or we can say that it depend on array's length;
        System.out.println(sum); // Finally all the added members will be printed;
    }
}