package Exception_Java;




public class ExceptionHierarchy {
    public static void main(String[] args) {
        System.out.println("Exception in java "); 

    }
}

//1.  on top there is object class which is the parent class of all the classes in java
//2.  Throwable class is the parent class of the Exception and the Error class
//2.1  Exception class is the parent class of the RuntimeException and the IOException  
//2.2  Error class is also type of the Throwable class
//     Error can't be handled by the try catch block

// Types of the Exceptions:
// 1. RuntimeException: These are the exceptions that occur at runtime and are not checked at compile time.
// 2. IOException: These are the exceptions that occur when an input/output operation is failed.
//4. SQLException: These are the exceptions that occur when there is an error in the database.
//5. ClassNotFoundException: These are the exceptions that occur when the class is not found.

// Types of Runtime Exceptions:

// 1. NullPointerException: These are the exceptions that occur when we try to access the object which is not initialized.  
// 2. ArrayIndexOutOfBoundsException: These are the exceptions that occur when we try to access the array element with an index that is out of the range.
// 3. StringIndexOutOfBoundsException: These are the exceptions that occur when we try to access the string element with an index that is out of the range.
// 4. NumberFormatException: These are the exceptions that occur when we try to convert the string into a number and the string is not a number.
// 5. ArithmeticException: These are the exceptions that occur when we try to divide the number by zero.

//Notes:

// All the runtime exceptions are called unchecked exceptions because they are not checked at compile time.
// All the exceptions other than the runtime exceptions are called checked exceptions because they are checked at compile time.


// Exception Handling in Java:
// Exception handling is a mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
