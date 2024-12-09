package OOP_concept;

import java.nio.channels.NetworkChannel;

class Calc 
{       
        //var in class
        int a;
    // add method
        public int add(int n1, int n2)
        {
            System.out.println("Add method");
            int r = n1 + n2;
            return r;
        }
    
}


public class Class_Object {
    public static void main(String a[])  // Start of the Executions main
    {   
        System.out.println("OOPS in java");
 
        int num1=4;  //primitive var type
        int num2=8;

        // int result = num1+num2;
        // System.out.println(result);
    
        // creating the object of calc class
        Calc calc = new Calc();   
        // calc is type of Calc refrence variable like int 5

        //create the new to consume thew space for the object of type Clac()

       // calling the method
        //calc.add();

        int result = calc.add(3,4); 
         //returing the value of the Calc , add method by Hardcoding 
        int result2 = calc.add(num1,num2); 
        System.out.println(result);
        System.out.println(result2);

// Creating the method ref var and obj in main class
        
       jmethod obj = new jmethod();  //Here obj is reference var for jmethod
       obj.getPen(10);
       obj.javam();

       String str = obj.getPen(result2);
       System.out.println(str);



    }
}

//Methods

class jmethod 
{
    public void javam() //only for exectuion not retruning 
    { 
        System.out.println("Comp it  is java's method ");
    }
    
    public String getPen(int cost)
    {
        if(cost<=10)
            return "Pen";

         return "Nothing";    
    }
}



//1. Objects: Properties and Behaviour 

//2. Class files is complied in byte code as blueprint
// goes to the jvm and jvm creates the objects

//3. Method:



/*--------------------------------------------------------------------------- */

// JDK --- Tool --- > Upper layer includes the JVM, JRE but on the client machine 
// By default it will have the JVM, JRE

// JVM ---  It compile the code and run byte code 

// JRE ---> IMPORT THE extra file or class, It's part of the JRE
// Need extra file like methods or modules ---

/*--------------------------------------------------------------------------- */