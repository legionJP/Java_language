package OOP_concept;


public class Method_Overload
{
    public static void main(String a[])
    {
        Calculator obj = new Calculator();

        int res= obj.add(3,4);
        System.out.println(res);

        int res1 =obj.add3(3,4,6);
        System.out.println(res1);

        int res2= obj.add(3,4,5);
        System.out.println(res2);

        double res3= obj.add(5.5, 6);
        System.out.println(res3);

    }    
}

// Methods

class Calculator
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
    
    public double add(double n1 , int n2)
    {
        return n1+n2;
    }
    public int add3(int n1, int n2, int n3)
    {
        return n1+n2+n3;

    }
}

// Method Overloading
/*
 * We can have the same name of methods but only requirement is that they should
 * have the different number of parameter. OR
 * the parameter can also be the same number of parameter but different Types.
 * This concept is called the method Overloading.
 */
