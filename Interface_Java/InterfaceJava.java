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

// Main class

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


        // Interface ABC
        // ABC obj = new ABC(); // cannot create the obj of the interface

        // We can directly use the var of the interface without creating the obj of the interface
        System.out.println(ABC.age);
        System.out.println(ABC.name);   
        // age is final and cannot be changed like age = 22; // error 

       // Interface of ABC
        ABC obj1;        // obj1 is the refrence of the ABC class
        obj1 = new Example2();
        obj1.show1();  
        obj1.config1();
        
       // obj1.run(); // error as the run method is not in the Example1 class
        
        X obj2;
        obj2 = new Example2();  // obj2 is the refrence of the X class and can only call the run method
        obj2.run();
// you can only call the methods which are the parts of the interface using the by creating the refre

    }
}

//  Need of the Interface explained in the above code


interface ABC{
    int age = 21;
    String name = "JP";   // All the var. are the by default public static  and final 
    void show1();
    void config1();
}

// the class can implement the multiple interface but the abstract class cannot implement the multiple interface

interface X {
    void run();
}

// see the Note for the extending the multiple interface
interface Y extends X{
    void walk();

    
}

class Example1 implements ABC{
    public void show1()
    {
        System.out.println("Show1");
    }
    public void config1()
    {
        System.out.println("Config1");
    }
}

// Implementing the multiple interface

//class Example2 implements ABC, X{
class Example2 implements ABC, Y{    
    public void show1()
    {
        System.out.println("Show1");
    }
    public void config1()
    {
        System.out.println("Config1");
    }
    public void run()
    {
        System.out.println("Run");
    }

    // if we dont implement the walk method then it will give the error
    public void walk()
    {
        System.out.println("Walk");
    }
}


// What is Interface in Java?
/*
 * 
 * Interface in Java is a blueprint of a class. It has static constants and abstract methods.
 * By default interface is abstract and public.
 * Java Interface also represents IS-A relationship.
 * It cannot be instantiated just like abstract class.
 * you need to implement all the methods of the interface 
 * 
 * Interface dont have the meomory allocation of heap memory , But the class that implements the interface have the memory allocation
 * 
 * You can achieve multiple inheritance in Java using Interface.
 */

// Note:
/*
/* when we say: 
class to class ----> it extends
class to interface ----> it implements
interface to interface ----> it extends
 * 
 * 
 */