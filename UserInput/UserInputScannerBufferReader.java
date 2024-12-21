package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserInputScannerBufferReader {
    public static void main(String[] args) throws IOException
    {
        System.out.println("User Input in Java");

        // Taking the input from the user

        // Using the read method of the System.in

        // int num = System.in.read();  // it will give the error bcz it is the byte stream
        // System.out.println(num); // it will print the ASCII value of the character

        // System.out.println(num-48); // it will print the integer value of the character

        // Using the BufferedReader class

        // using the bufferedReader class  we have to pass the object of the InputStreamReader class
        // InputStreamReader class is used to convert the byte stream to the character stream

        InputStreamReader iar = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(iar);

        int num1 = Integer.parseInt(br.readLine()); 
        // it will take the input as the string and convert it into the integer
        System.out.println(num1);

    }
}

// User Input in Java
// println belongs to the PrintStream class