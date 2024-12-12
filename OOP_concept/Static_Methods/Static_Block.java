package OOP_concept.Static_Methods;


class Mobile1{
    String brand;
        int price;
        static String name;

// initialize var. inside the constructor

// constructor

    public Mobile1()
    {
        brand = "";
        price = 124;
        name= "New phone"; // initialize the name every time in that 
        System.out.println("Constructor Block");

    }

// Static Block     

    static
    {
        name= "Public";
        System.out.println("In Static Block");

    }

    public void show()
        {
            System.out.println(brand + " "+ name + " "+ price );
        }
}
public class Static_Block {
    public static void main(String a[]) throws ClassNotFoundException
    {   
        // Only load the class without creating object
        Class.forName("Mobile1");
        
        // Mobile1 obj1 = new Mobile1();

        // obj1.brand = "Apple";
        // obj1.price = 67891;
        // Mobile1.name = "Smart i Phone";
        
        // System.out.println("Hello");

    }
}


/*
 * 1. Class loads---> JVM --> Class Loader--- > every time the static block is called
 * 
 * ( and constructor after static )
 * 2. then objects get instialized
 * 
 * // I f you want to load the class withou calling the object you can use 
 * the class method --> class.forName
 * 
 * 
 */