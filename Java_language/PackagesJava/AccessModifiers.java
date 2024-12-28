package PackagesJava;
import Operators.Example1;
import PackagesJava.*;

public class AccessModifiers {
    
    public static void main(String a[])
    {
        System.out.println(" Access Modifiers ");

        Example1 obj = new Example1();
        System.out.println(obj.marks); // as the marks is not public it can't access by other packages 


        Example obj1 = new Example();
        System.out.println(obj1.marks);



    }
}

// Private var can be used in the same class the packages don't matter

// Default can be accesed in the same the class and same packages
