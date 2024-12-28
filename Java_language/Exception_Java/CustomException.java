package Exception_Java;

// Custom Exception named MyException

class MyException extends Exception{
    public MyException(String string)
    {
        super(string);  // super is used to call the constructor of the parent class like string as the message
    }
}


public class CustomException {
    public static void main(String[] args) {
        System.out.println("Exception in java "); 

        int i = 20;//Quotient will be 18/20 = 0
        int j =0;
        
        try
        {
            j = 18/i;
            if(j==0)
            {              
                throw new MyException("this is the custom message");
  
            }
        }
        catch(MyException e)
        {     
             j=18/1;
             System.out.println("This is MyException "+ e);
        }   
        catch (Exception e) {
            System.out.println("Something Went Wrong"+ e);
        }

        System.out.println(j);
        System.out.println("Bye Done");
    }
}
