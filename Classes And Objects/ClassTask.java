public class ClassTask {

private String  firstname;
    private String  lastname;
    double salary;

    ClassTask(){

    }

    ClassTask(String firstname,String lastname, double salary)
    {

        this.firstname=firstname;
        this.lastname=lastname;
        if(salary>0)
        {
            double per;
            per=(salary/10);

            this.salary=per+salary;

        }
        else{
            this.salary=00.0;
        }


    }
        void Set1stname(String firstname1)
        {

            this.firstname = firstname1;


        }
    void Setlastname(String lastname1)
    {

        this.lastname = lastname1;
    }
    void SetSalary(double salary1)
    {
        if(salary1>0)
        {
            double per;
            per=(salary1/10);

            this.salary=per+salary1;

    }
        else{
            this.salary=00.0;
        }

    }
    String Get1stname()
    {

        return firstname;
    }
    String Getlastname()
    {

        return lastname;
    }
    double GetSalary()
    {

        return salary;
    }
   void GetData()
    {
        System.out.println("Firstname is : "+firstname+"  Lastname is : "+lastname+" Salary is : "+salary+" the Yearly Salary is "+salary*12);

    }
    public static void main(String [] args)
    {
        ClassTask obj1 = new ClassTask("naruto","Uzamaki",209908.00);
        obj1.GetData();




        ClassTask obj = new ClassTask();
        obj.Set1stname("Vovo");
        System.out.println(obj.Get1stname());

        obj.SetSalary(-200);

        obj.Setlastname("Suzi");

        obj.GetData();

    }
}
