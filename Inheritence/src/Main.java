
public class Main {
    public static void main(String[] args) {

        /*Box box1 = new Box(4.4);
        box1.information();
        Box box2 = new Box(3.3,4.5,6.9);
        box2.information();
        Box box3 = new Box(box1);
        box3.setH(3.3);
        box3.information();
*/

        Boxweight bw = new Boxweight();
        //bw.information();
        Boxweight bw2 = new Boxweight(1.1, 4.3, 5, 8.9);
        bw2.information();


        Box box5 = new Boxweight(5, 6, 8, 9);
        box5.information();

        //Boxweight box6 = new Box();//we can't do that because

        Boxprice box = new Boxprice(2.3,4,5);
        box.information();


        Boxcolor box1 = new Boxcolor(4.4,3, "Blue");
        box1.information();

    }

}
