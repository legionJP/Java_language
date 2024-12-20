package Exception_Java;

public class MultiException {
    public static void main(String[] args) {
        System.out.println("Exception in java "); 

        int i = 2;
        int j =0;
        String str = null;
        int nums[] = new int[5];


        try   
        {
            j = 18/i;
            System.out.println(str.length());  // .NullPointerException: Cannot invoke "String.length()" because "str" is null
            System.out.println(nums[1]);
            System.out.println(nums[5]);  // .ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }

        // If we have the multiple statements in the try block and we have multiple exceptions then we can use multiple catch blocks
        
        catch( ArithmeticException e){     
            System.out.println("Something Went Wrong"+ e);
        }
        catch( ArrayIndexOutOfBoundsException e)   
        {
            System.out.println("Out Of Limit "+ e);
        }
        // Exception class should be at the last
        catch( Exception e)    // The Excpetion class Handles all the Exceptions as it is the parent class of all the Exceptions, If u are not sure about the Exception then use this
        {
            System.out.println("Something Went Wrong"+ e);
        }

        System.out.println(j);
        System.out.println("Bye Done");
    }
}

// Exception in java
// Here Apart from the Exception class, we can also use the ArithmeticException class to handle the Arithmetic Exception. and we have used both as e
