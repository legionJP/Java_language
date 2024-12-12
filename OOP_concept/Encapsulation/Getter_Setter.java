package OOP_concept.Encapsulation;



class Human
{   
    String clg;
    private int age =16;
    private String name; // can Make the Private to only accessiable for this class
    
    // Generated the getter and setter from source action

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }    

    //     // alternate to this
    // public void setAge(int age, Human objHuman)
    // {
    //     Human obj = objHuman;
    //     obj.age = age;
    // }    


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class Getter_Setter
{   public static void main(String a[])
    {
        System.out.println("Encapsulation in Java ");

        Human objHuman = new Human();

        // Assign the value to private var and access by the method

        //objHuman.setAge(17,objHuman);
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

   // this keyword 
/*
 * 
 * 
 * 
 */