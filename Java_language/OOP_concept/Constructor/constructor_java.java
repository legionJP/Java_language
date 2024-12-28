package OOP_concept.Constructor;

// Constructor

class Human
{   
     String clg;
     private int age;
     private String name; // can Make the Private to only accessiable for this class.
   
// Constructor , Special Method same as class name never return anything 
// Every tuime you create the object it will called the constructor without calling it
// you can write the db connection in constructor

    public Human()
    {
        System.out.println("This is from Constructor");
        // default value
        age = 12;
        name = "John";
    }

// Parameterized construtor
    public Human(int a, String n)
    {
        age=a;
        name =n;
    }    

// Source action     generated constructor

// //defautl constructor

// public Human() {
// }

// // Parameterized construtor

// public Human(int age, String name) {
//     this.age = age; 
//     this.name = name;
// }
  

// Getter Setter Method

    public int getAge() {
        return age;
    }
   
    public void setAge(int age) {
        this.age = age;  
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class constructor_java {
    public static void main(String a[])
    {

    Human objHuman = new Human();
    
    // Create the obj for parameterzide
    Human obj2 = new Human(24,"You");

    // By default the value for the string is null and for int it is 0, to see comment the constructor
    System.out.println(objHuman.getAge() +" "+ objHuman.getName());


    objHuman.setAge(17);
    objHuman.setName("it's Me");

    objHuman.clg = "Myclg";

    System.out.println(objHuman.clg);
    System.out.println(objHuman.getAge() +" "+ objHuman.getName());
    System.out.println(obj2.getAge() + " "+ obj2.getName());


    }
}
