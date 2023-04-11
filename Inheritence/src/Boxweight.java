
class Boxweight extends Box {
    double weight;

    Boxweight(double l, double w, double h, double weight) {
        super(l, w, h);
        //if don't call parent class paramterized  constructor it will call default constructor of parent class.
        this.weight = weight;

    }


    public Boxweight() {
        this.weight = 0.0;
    }

    void setWeight(double w) {
        this.weight = w;
    }

    Boxweight(Boxweight other) {
        super(other);//it is accessing parent class object or copy constructor
        //we passed box weight object to the constructor of Parent class.
        weight = other.weight;

    }

    public Boxweight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    @Override
    public void information() {
        System.out.println("Running the box : " + l + " " + w + " " + h + " " + weight);
        //System.out.println("H in Boxweight class "+super.h);//this Super keyword using instead of 'this' which refers to the BOX varaible
    }
}
