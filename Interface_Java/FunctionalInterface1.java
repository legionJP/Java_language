package Interface_Java;


@FunctionalInterface
interface  A              // functionalInterface
{
    void show();
    // void display();   // if we add the another method then it will give the error
}


// Using the class B which implements the interface A

// class B  implements A
// {
//     public void show()
//     {
//         System.out.println("I am the best");
//     }

// } 

// Functional Interface: An interface which has only one abstract method is called functional interface.
public class FunctionalInterface1 {
    
    public static void main(String[] args)
    { 
        // // Using the class B which implements the interface A
        // A obj = new B();
        // obj.show();

        //  Using the Anonymous class
        
        A objA = new A() {
            public void show()
            {
                System.out.println("I am the best");
            }
        };
       objA.show();

    }
}


// A obj = () -> System.out.println("I am the best");  // lambda expression
// obj.show();

// After the Java 8, we can use the lambda expression to implement the functional interface 
// And the java is no more verbose