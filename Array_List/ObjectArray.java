import java.util.ArrayList;
import java.util.*;
public class ObjectArray {

    private String name;
    private String ID;
    private String value;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args)
    {
        ArrayList<ObjectArray> arrayList = new ArrayList<ObjectArray>();
        String namesearch="";
        Scanner sc = new Scanner(System.in);


        ObjectArray array = new ObjectArray();
        array.setID("LMS-011");
        array.setName("Alan");
        array.setValue("12");

        ObjectArray array1 = new ObjectArray();
        array1.setID("LMS-012");
        array1.setName("joe");
        array1.setValue("22");

        ObjectArray array2 = new ObjectArray();
        array2.setID("LMS-013");
        array2.setName("john");
        array2.setValue("32");
        ObjectArray array3 = new ObjectArray();
        array3.setID("LMS-014");
        array3.setName("Alok");
        array3.setValue("42");

        ObjectArray array4= new ObjectArray();
        array4.setID("LMS-015");
        array4.setName("Latki");
        array4.setValue("52");

        arrayList.add(array);
        arrayList.add(array1);
        arrayList.add(array2);
        arrayList.add(array3);
        arrayList.add(array4);

        System.out.println("Search name");
        namesearch = sc.next();


        for(int i = 0; i < arrayList.size(); i++)
        {
            if(arrayList.get(i).getName().equals(namesearch))
            {
                System.out.println("Found");
                System.out.println(arrayList.get(i).getName());
            }
        }



    }







}
