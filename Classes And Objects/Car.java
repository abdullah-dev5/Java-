import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        Car porsche = new Car();//porsche is object of class Car. also called Instance of class Car.
       porsche.model = "Sport";
       porsche.wheels= 4;
        porsche.doors = 4;
        System.out.println(porsche.model);
        System.out.println(porsche.wheels);
        System.out.println(porsche.doors);
        //porsche.year="2019";//we can not access this property because of encapusalation ,in class its private instance variable.
        porsche.setYear("2019") ;
        // so, we made it this way we can access this property. througth methods
        // so created setyear methods in which  pass the string argument will save the year
        porsche.getyear();
        // this will print the value of the year



    }}
    class Car {

        int wheels;// these are called instance variables
        int doors;
        String color ;
        String model;
        private String year;// we made this private so we can't access it from outside the class
        String setYear( String year )//
        {

            this.year = year;
            // we use this. to access the instance variable and it helps compilar to differentiate the variables and instance variables
            return this.year;
        }
        void getyear()// this method will print the value of year instance variable
        {
            System.out.println(this.year);

        }
    }
