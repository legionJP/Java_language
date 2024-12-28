package Exception_Java;

public class ExceptionIntro {
    public static void main(String[] args) {
        System.out.println("Exception in java "); 

        // There is 2 Types of Statements: 1. Normal 2. Critical Statement
        // int i =9;  // Normal Statement
        // int j = 18/i; // Critical Statement if i = 0 
        // System.out.println(j);

        int i = 0;
        int j =0;
        // Put the critical Statements in brackets 
        try   
        {
            j = 18/i;
        }
        catch( Exception e)    // Executes only in the case of the Exception
        {
            System.out.println("Something Went Wrong"+ e);
        }
        
        System.out.println(j);
        System.out.println("Bye Done");
        

    }
}

// Exception in Java 

// Errors in Java:

// 1. Compile Time Error: These are syntactical errors that are detected by the compiler. 
//    Example: System.out.Println() ---> Will give a compile time error because 'Println' should be 'println'.

// 2. Runtime Error: These errors occur during the execution of the program. 
// These are the critical ---> Handle the Exceptions

//    Example: int a = 5 / 0; ---> Will give a runtime error (ArithmeticException) because division by zero is not allowed.

// 3. Logical Error: These errors occur when the program runs without crashing, but produces incorrect results. 
//    Example: int result = 2 + 2; ---> If the intended result was 5, this is a logical error because the code produces 4.

