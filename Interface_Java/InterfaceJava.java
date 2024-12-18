package Interface_Java;


// If we want to use the Interface instead of the abstract we need to put the implements instead 
// of extend for the Super class 

// abstract class Computer{
interface Computer
{    
    void code();      // insted of public abstract void code();
   
}


class Laptop implements Computer
{   // need this class to develop the appdev
    public void code()
    {
        System.out.println("IDE, Code, Compile, Run ");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("IDE, Code, Compile, Run Faster on Desktop ");
    }
}

class Developer{     // developer obj is dependents on the Computer so it is lossly coupled
    public void Appdev(Computer lap)
    {
        lap.code(); 

    // tight copuling if the Laptop or only desktop  // is given the as obj like dev dependendes on the Laptop
        // Assumes that this class  of developer need the Laptop or its method to function 
       // System.out.println(" Developing ");
    }
}



public class InterfaceJava {
    public static void main(String[] args) {
        System.out.println(" Interface in Java ");


        // Instead of creating the obj of the lap and desk class we can refer the super classand create the obj of the class

        // Laptop lap =  new Laptop();
        // Desktop desk = new Desktop();

        // refrence to the super and obj of the class
        Computer lap = new  Laptop(); // ref to super and obj of the sub class
        Computer desk = new Desktop();

        Developer jp = new Developer();
        jp.Appdev(lap);
        jp.Appdev(desk);
        
        // Developer jp = new Developer();
        // jp.Appdev();
    }
}



//  Need of the Interface

