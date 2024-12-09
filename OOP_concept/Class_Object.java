package OOP_concept;

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
    public static void main(String a[])
    {   
        System.out.println("OOPS in java");
 
        int num1=4;  //primitive var type
        int num2=8;

        // int result = num1+num2;
        // System.out.println(result);
    
        // creating the object of calc class
        Calc calc = new Calc();    // calc is type of Calc like int 5

        //create the new to consume thew space for the object of type Clac()

       // calling the method
        //calc.add();

        int result = calc.add(3,4); 
         //returing the value of the Calc , add method by Hardcoding 
        int result2 = calc.add(num1,num2); 
        System.out.println(result);
        System.out.println(result2);


    }
}



//Objects: Properties and Behaviour 

// class files is complied in byte code as blueprint
// goes to the jvm and jvm creates the objects


/*--------------------------------------------------------------------- */

// JDK --- Tool
