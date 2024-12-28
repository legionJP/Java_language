package Exception_Java;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Exception in java "); 

        int i = 20;//Quotient will be 18/20 = 0
        int j =0;
        
        try
        {
            j = 18/i;
            if(j==0)
            {
               //hrow new ArithmeticException();
                // you can put the message in the constructor of the ArithmeticException
                throw new ArithmeticException("This is the custom message");

                // if the value of j is zero then it will throw the exception and catch will handle it
            }
        }
        catch(ArithmeticException e)
        {     
            // tem.out.println("Can't Divide by Zero"+ e); 
             // if someone wants to divide the number by zero then we can throw the default or customised exception
             j=18/1;
             System.out.println("That's default value");
        }   
        catch (Exception e) {
            System.out.println("Something Went Wrong"+ e);
        }

        System.out.println(j);
        System.out.println("Bye Done");
    }
}
