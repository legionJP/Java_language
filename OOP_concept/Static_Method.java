package OOP_concept;

// Static Varibale

class Mobile
{
    String brand;  // Instance varliable
    int price;
    String Name;

    // If the String Name var is changed to static var. than the all other obj will share the same value
    // of the Name var bcz it will be static var, if it is changed by obj1 or 2 it will be samee
    static String Name1;

    public void show()
    {
        System.out.println(Name + " ," + Name1+ ":" + price + ":" + brand);
    }

}

public class Static_Method 
{   
    public static void main(String a[])
    {
            Mobile obj1 =new Mobile();
    
            obj1.brand= "Samsung";
            obj1.price = 234567;
            obj1.Name = "Smart Phone";
            obj1.Name1 = "Phone";

            Mobile obj2 =new Mobile();

            obj2.brand = "Apple";
            obj2.price = 134567;
            obj2.Name = "Smart Phone";
            //obj2.Name1 = "Phone";
         // Just call the Name1 by the class name not by the obj name
            Mobile.Name1 = "Smart Phone";  // calling in the static way


            obj1.Name1 ="Mobile Phone";  // Will be changed to everyone
            // Just call the Name1 by the class name not by the obj name

            obj1.show();
            obj2.show();

    }

    
}

// Static Keyword means that you are making the variable the class membver not the obj member
