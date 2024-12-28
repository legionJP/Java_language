package OOP_concept.Encapsulation;

class Human
{   
     String clg;
     private int Age =16;
     private String name; // can Make the Private to only accessiable for this class

     public int getAge()
     {
        return Age;
     }

     // set the age
     public void setAge(int a)
     {
        Age =a;
     }

     public String getName()
     {
        return name;
     }

     // set the Name
     public void setName(String n)
     {
        name =n;
     }
}

public class encapulation_1 {
    public static void main(String a[])
    {
        System.out.println("Encapsulation in Java ");

        Human objHuman = new Human();

        // Assign the value to private var and access by the method

        objHuman.setAge(17);
        objHuman.setName("it's Me");

        // Assign the value to public var.
        // objHuman.Age=16;
        // objHuman.name= "Me";
        objHuman.clg = "Myclg";

        System.out.println(objHuman.clg);
        System.out.println(objHuman.getAge() +" "+ objHuman.getName());


    }
}
