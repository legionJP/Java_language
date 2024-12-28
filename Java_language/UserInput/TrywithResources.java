package UserInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrywithResources {
    public static void main(String[] args)  throws Exception{
        System.out.println("Try with Resources in Java");

        // Try with resources
        // it is not comuplosary to use the catch block with the try with resources

        int i =0;
        int j =0;
        int num = 0;

        // try   
        // {
        //     j= 20/i;
        //     System.out.println("Bye Done");
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Something Went Wrong");
        //     System.out.println("Bye..");
        // }


        // resolving the br issue 
        BufferedReader br = null;
        try{

           // InputStreamReader in = new InputStreamReader(System.in);
           // br = new BufferedReader(in);

            // instead  passing the in we can pass the object (new InputStreamReader(System.in); directly 
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        finally
        {
            // System.out.println("Finally Block is always executed");
            // System.out.println("Bye..");  // it will always execute ireespective of the exception
            // finally block is used to close the resources like file, database, network connection etc
           // br.close();

        }

        // comment the finally block and run the code, it will give the error as the bufferedReader is not closed
        
        // try with resources block is used to close the resources automatically without using the finally block

        try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)))
        {
            num = Integer.parseInt(br1.readLine());
            System.out.println(num);
        }

    }
}
