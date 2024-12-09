package Conditional;
import java.util.Scanner;


public class ternary {
    public static void main(String a[])
    {   
        Scanner scanner = new Scanner(System.in);
        //int n = 4;
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        int result = 0;

        // if(n%2==0)
        //    result =10;
        // else
        //    result = 20;

        // using the ternary operator

        result = n%2==0 ? 1 : 0;  
        //if ? --> true print 1 , else false (:) print 0
        
        System.out.println(result);  

        // Example 2:
        
        int  x=5; int y=10;
        int z= (x++>5 && y--<10)?x--:y;  
        // here x++ means it is post increament means first x>5 then increament 
        System.out.println(z);
        System.out.println("x:"+ x + ",y: "+y);

    }
}

// Syntax of Ternary:

//condition ? expression1 : expression2
// Explanation
// The condition is a boolean expression that evaluates to true or false.

// If the condition is true, expression1 is evaluated and returned.

// If the condition is false, expression2 is evaluated and returned.
