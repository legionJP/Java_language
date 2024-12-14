package OOP_concept.Inheritence;


class Calc{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}


public class InheritanceJava {
    
    public static void main(String a[])
    {
        System.out.println(" Inheritance in Java ");


        //Calc objCalc = new Calc();

        // Object for the AdvanceCalc after using the inheritance
        AdvanceCalc objCalc = new AdvanceCalc();

        int r= objCalc.add(4,6);
        int r1 = objCalc.sub(5,6);

        int r3= objCalc.multi(5,7);

        System.out.println(r + " , " + r1 + " Multi: " + r3);


    }
    
}


// here the advance calc is subclass and Calc is Super class