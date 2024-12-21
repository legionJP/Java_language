package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInputScannerBufferReader {
    public static void main(String[] args) throws IOException, NoSuchElementException
    {
        System.out.println("User Input in Java");

        // Taking the input from the user

 // 1. Using the read method of the System.in

        // int num = System.in.read();  // it will give the error bcz it is the byte stream
        // System.out.println(num); // it will print the ASCII value of the character

        // System.out.println(num-48); // it will print the integer value of the character


// 2. Using the BufferedReader class

        // using the bufferedReader class  we have to pass the object of the InputStreamReader class
        // InputStreamReader class is used to convert the byte stream to the character stream

        System.out.println("Enter the number");

        InputStreamReader iar = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(iar);

        int num1 = Integer.parseInt(br.readLine()); 
        // it will take the input as the string and convert it into the integer
        System.out.println(num1);

        // clear the buffer after taking the input
        br.readLine();

      //  br.close();  // closing the bufferedReader class as it is the resource, preventing the memory leak

//3. Using the Scanner class

        // Scanner class is used to take the input from the user
        System.out.println("Using the Scanner class");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);
        sc.close();  // closing the scanner class as it is the resource, preventing the memory leak

    }
}

// User Input in Java
// println belongs to the PrintStream class