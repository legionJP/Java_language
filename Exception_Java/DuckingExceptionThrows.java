package Exception_Java;

// class Ex{
//     public void foundClass()
//     {
//         try{
//           //  Class.forName("Calc");
//             Class.forName("DuckingExceptionThrows");
//         }
//         catch(ClassNotFoundException e)
//         {
//             System.out.println("Not able to find class "+e);
//         }
//     }
// }

// instead of handling the exception we are throwing the exception to the main method
// and the main method will handle the exception

class Ex{
    public void foundClass() throws ClassNotFoundException
    {
          //  Class.forName("Calc");
            Class.forName("DuckingExceptionThrows");
       
    }
}



public class DuckingExceptionThrows {

    static{
        System.out.println("Static block is called for Demo");
    }
    public static void main(String[] args) {
        
        System.out.println("Exception in java ");

        Ex obj = new Ex();
        //obj.foundClass();
        // Handling the exception in the main method
        try{
            obj.foundClass();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Not able to find class "+e);
            e.printStackTrace();  // it will print the stack trace of the exception
        }
    }
}


// Ducking Exception: Ducking exception is the process of catching the exception and not handling it.
// The throws keyword is used to declare the exception.

/*
 * Class Ex throws IOException{
 * method() throws IOException{}
 * }
 * 
 * class B thorws RuntimeException{
 * method() throws RuntimeException{}
 * }
 * 
 * class C{
 * public static void main(String[] args)
 * {
 * try{
 * Ex obj = new Ex();
 *
 * B obj1 = new B();
 * }
 * catch(Exception e){
 * System.out.println("Exception is handled by the main using the throws"+e);
 * }
 *  
 * }
 */

// If we are not sure about the exception then we can use the Exception class to handle all the exceptions.