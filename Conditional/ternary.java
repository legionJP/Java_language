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
        
        System.out.println(result);   
    }
}
