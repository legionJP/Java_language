package OOP_concept;

class A

{
    public void show()
    {
        System.out.println(" In A show ");
    }

    public void config()
    {
        System.out.println("In a config ");
    }   

    public int  add(int n1, int n2)
    {
        return n1+n2;
    }
}

class B extends A{
    public void show() // this method is overriding the method of A called Show()
    {
        System.out.println("in B show ");
    }
    
}

class Calc1 extends A{ // It override the add method of class A , parent class

    public int add(int n1, int n2)
    { 
    return n1-n2;
    }

}


public class MethodOverriding {
    public static void main(String a[])
    {
        System.out.println(" Method Over-riding in java ");

        B objB = new B();
        objB.show();
        objB.config();

        Calc1 objCalc = new Calc1();
        int r= objCalc.add(5,7);

        System.out.println(r);

    }
}
