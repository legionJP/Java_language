package EnumJava;


enum Status1{
   Running, Failed, Pending, Success
}

public class EnumIfelse {
    public static void main(String[] args)
     {
        System.out.println("This is EnumIfelse");

        Status1 s = Status1.Running;
       
 //1.  if else ladder

      //   if(s == Status1.Failed)
      //   {
      //       System.out.println("Failed");
      //   }
      //   else if(s == Status1.Pending)
      //   {
      //       System.out.println("Pending");
      //   }
      //  else if(s == Status1.Running)
      //  {
      //          System.out.println("Running");
      //  }
      //  else
      //   {
      //       System.out.println("Invalid Status1");
      // }
        
//2.    Switch Case

         switch(s)   //here s the object of enum Status1
         {
            case Running:
                System.out.println("Running");
                break;

            case Failed:
               System.err.println("Failed");
               break;

            case Pending:
                System.out.println("Pending");
                break;

            default:
                System.out.println("Success");        
         }
      
 //3.
 // Use of  Switch rules, which is a new feature in Java 12
 // The switch rules expression is a new feature in Java 12. It simplifies the switch statement and eliminates the need for break statements.

         switch(s)
         {
            case Running -> System.out.println("Running");
            case Failed -> System.out.println("Failed"); 
            case Pending -> System.out.println("Pending");
            default -> System.out.println("Success");        
         }
              
     }
}
