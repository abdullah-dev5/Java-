public class Companyy {
    final String name;
    private int num_Emp;
    private int num_Depts;


    Companyy(){
        name="Pindari's";
    }
    Companyy(int num_Emp,int num_Depts){

        this();
        this.num_Emp = num_Emp;
        this.num_Depts=num_Depts;
        Display();
    }
    void Display()
    {

        System.out.println("Name : "+name+"  Number of Employess : "+num_Emp+"  Number of Department : "+num_Depts);

    }


    public static void main(String [] args)
    {

        Companyy com = new Companyy(34,5);
        com.Display();


    }
}
