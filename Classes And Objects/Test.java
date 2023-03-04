class Test
{
    int a = 1;
    int b = 2;

    Test func(Test obj)// parameter is object that's why type of func will be test Class
    {
       //System.out.println(obj.a+ " "+obj.b); obj.a =1 and obj.b = 2
        Test obj3 = new Test();
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;//obj.b 3 and obj.a is still 1
        //System.out.println(obj.a);
        obj.b = obj.b;// obj.b was 2 and now 3
        return obj3;// the values of obj1 is assigned and also modified for the  obj3
    }
    public static void main(String[] args)
    {
        Test obj1 = new Test();// object is declared here
        Test obj2 = obj1.func(obj1);// used Copy Constructor

        System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);
    }
}

