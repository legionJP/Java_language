package OOP_concept.Polymorphism;


class A{
    public void show()
    {
        System.out.println(" In the  A show method ");

    }
}

class B extends A
{
    public void show()
    {
        System.out.println(" In the B show method ");

    }
}

class C extends A{

    public void show()
    {
        System.out.println(" In the C show method ");

    }
}


public class Polymorphism {
    
    public static void main(String[] args) {
        {
            System.out.println(" Polymorphism in Java ");

          // A objB = new B(); // ---> Print in B show method 
           // Reference of a super class and object of a subclass.  can 

            A objB = new A();  
           // B objB = new B();

            // be created and 
            objB.show();
            
            objB = new B();
            objB.show();

            objB = new C(); // obj of the C class (and ref for the parent )
            objB.show();  
            
            // All the call of method is decided on the runtime , 
            //and this is call Dynamic Method Dispatch
            
        }
    }
}


// Polymorphism --->

/* many  Behaviour

 * 
 * Types: 
 * 1. Compile time ( Early binding)---> Overloading 1. add(int, int,int ), 2. add( int , int)

 * 2. Run time (Late Binding) ---> add(int, int) 2. add(int, int) decided at run time
 * which method will be called at run time like super method or class method base 
 * 
 */