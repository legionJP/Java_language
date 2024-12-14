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

       // AdvanceCalc objCalc = new AdvanceCalc();

        Scientific_Calc objCalc = new Scientific_Calc();

        int r= objCalc.add(4,6);
        int r1 = objCalc.sub(5,6);

        int r3= objCalc.multi(5,7);

        int r4 = (int) objCalc.power(11,11);

        System.out.println(r + " , " + r1 + " Multi: " + r3 + " Power " + r4);


    }
    
}


// here the advance calc is subclass and Calc is Super class

// Need Of Inheritance:

/*
 * Computer has the hardware , Desktop has keyword ---> 
 * 
 * Laptop is Computer ---> Got it's feature from computer
 * 
 */


 // When We have the two classes is called the Single Heritance and when 
 // there is two class it is called the multilevel calss
 // ----> A --> B --> C


 // Multiple Heritance

 // A, B , C ---> A(parent)--->B(child of A)---->C(child of B) and herer A and B Both 
 // are the parent and c is child 