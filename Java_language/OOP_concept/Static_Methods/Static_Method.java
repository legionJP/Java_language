package OOP_concept.Static_Methods;


class Mobile
{
    String brand;  // Instance varliable
    int price;
    String Name;

    // If the String Name var is changed to static var. than the all other obj will share the same value
    // of the Name var bcz it will be static var, if it is changed by obj1 or 2 it will be samee
    
// Static Varibale
    static String Name1;

    public void show()
    {
        System.out.println(Name + " ," + Name1+ ":" + price + ":" + brand);
    }

    // Static Method
    // You can call the static directly with the class Name

    public static void show1()
    {
        System.out.println("Static Method");

       // System.out.println(Name + " ," + Name1+ ":" + price + ":" + brand);
        //non-static variable brand, Name , price cannot be referenced from a static context 
        // can't use them directly in static method

    } 

    public static void show2(Mobile obj)
    {
        System.out.println("Static Method");
        System.out.println(obj.Name + " ," + obj.Name+ ":" + obj.price + ":" + obj.brand);
       
    }

}


public class Static_Method    // here the main method is starting point of execution and this is static 
// method because to call it we don't need the object of it's class Static_Method 
{   
    public static void main(String a[])
    {
            Mobile obj1 =new Mobile();
    
            obj1.brand= "Samsung";
            obj1.price = 234567;
            obj1.Name = "Smart Phone";
            obj1.Name1 = "Phone"; // Name1 should be accessed in a static way

            Mobile obj2 =new Mobile();

            obj2.brand = "Apple";
            obj2.price = 134567;
            obj2.Name = "Smart Phone";
            //obj2.Name1 = "Phone";
         // Just call the Name1 by the class name not by the obj name
            Mobile.Name1 = "Smart Phone";  // calling in the static way


            obj1.Name1 ="Mobile Phone";  // It Will be changed in the every method
            // Just call the Name1 by the class name not by the obj name

            obj1.show();
            obj2.show();

            //Mobile.show(); //Cannot make a static reference to the non-static method show() from the type Mobile
            Mobile.show1(); // Static Method

            Mobile.show2(obj2);
    }

    
}

// Static Keyword means that you are making the variable the class membver not the obj member
