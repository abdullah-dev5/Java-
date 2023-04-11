public class Main {
    public static void main(String[] args) {

        Shapes shapes= new Shapes();
        shapes.area();
        Circle circle= new Circle();
        circle.area();
        Sqaure sqaure= new Sqaure();
        sqaure.area();
        Shapes shapeSquare = new Sqaure();//whatever the type of object is will be used.like it has
        //Square Object type.
        shapeSquare.area();//The declaration of area method is in Parent Class Shapes but it refering to the
        //Child Class Sqaure.So,
        // this prints the Square area method.
        /*

        * Refernce type allows us to access their variables and methods .
          And the Object allows us to to call or prioritize their method which is ovveriden from the Parent Class.
          so,if their is a method in parent class and also ovveriden in child class. So,the method of
          Chlid class will called or printed .we can access only override methods of child class.

        * Shape is Parent class and also the reference type . so we can access any variable or method of its.
          But the Object is   Square Child class.and it allows us to Calls/print Ovveriden method of the child class.
          Only Overridden methods we can access of the Child class.

        * And One more thing Which Version of the method should be called Determine by the Object type.

         */
        Shapes shape1 = new Shapes();
        shape1.greetings();// we declard greeting method as static method.
        Sqaure sqaure1 = new Sqaure();
        sqaure1.greetings();// we can't Ovveride the Static method.
        //we haven't greeting method in Square Class So it will inherit parent class Shapes greeting method in it ..

        //Overriding depends on Objects.
        //Static methods does not depends on Object.
        //hence, Static methods can't be overridden.

    }
}