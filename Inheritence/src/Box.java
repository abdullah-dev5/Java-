
class Box {
    double l;
    double w;
    double h;


    Box() {
        this.l = 0.0;
        this.w = 0.0;
        this.h = 0.0;
    }

    //super(); Object class
    //Object class is a super class of every class By default
    Box(double l, double w, double h) {
        System.out.println("Print Box or parent class constructor ");
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box obj) {
        this.l = obj.l;
        this.w = obj.w;
        this.h = obj.h;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public void information() {
        System.out.println("Running the box : " + l + " " + w + " " + h);
    }

}
