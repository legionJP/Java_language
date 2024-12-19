package EnumJava;


// by defaults the enum in java extends the Enum class
// here the object the Macbook , HP etc are the constructor of the enum Laptop
enum Laptop {
    Macbook(2000), HP(1900), Dell(1234), Lenovo, ASUS(567), ACER(123), MSI(321);  //assigning the price values to the objects

    private int price;  //creating the private variable price

    // Creatinng the default constructor of the enum Laptop
    private Laptop() {    
        price=100;  //assigning the default value to the price
    }

//creating the constructor of the enum Laptop
    private Laptop(int price) {        
        this.price = price;
        System.out.println("In Laptop Constructor" + this.name());
    }
// Creating the gettter and setter method for the price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
}
}

public class EnumClass {
    public static void main(String[] args) {
        System.out.println(" Enum in Java ");

        Laptop s = Laptop.Macbook;  //creating the object of the enum Laptop
        System.out.println(s + " : " + s.getPrice());  //Macbook : 2000

        // Print all the values of the Enum

        for(Laptop l: Laptop.values())  //using the values method to print all the values of the enum
        {
            System.out.println(l + " : " + l.getPrice());
        }

// Using the super class and getClass method to print the super class of the enum
        System.out.println(s.getClass().getSuperclass());  //class java.lang.Enum



    }
}
