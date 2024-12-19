package EnumJava;


enum Status {
    PENDING, APPROVED, REJECTED
}                               
// Enum is a special class in Java that represents a group of constants (unchangeable variables, like final variables).
// In enum the Status is here class and PENDING, APPROVED, REJECTED are the objects of the class Status

public class EnumJava
{
    public static void main(String[] args)
    {
        System.out.println(" Enum in Java ");

        int i =5;
        Status s = Status.APPROVED;
        Status s1 = Status.PENDING;

        System.out.println(s);
        System.out.println(s.ordinal());
        System.out.println(s1);
        System.out.println(s1.ordinal());
        System.out.println(Status.REJECTED);

        // Printing all the values of the Enum
        Status [] sa = Status.values();
        for(Status st: sa)
        {
            System.out.println(st + " : " + st.ordinal());
        }

    }
}

// Enum is a special class in Java that represents a group of constants (unchangeable variables, like final variables).
// To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
// Note that they should be in uppercase letters.
// You should always create enums when a variable (especially a method parameter) can only take one out of a small set of possible values.
// If you don't use an enum, you should use a final variable to represent the value, but this is less type-safe.
// Enum is a keyword in Java, and it is a special data type that is used to define collections of constants.
// It is a special type of class. An enum can contain constants, methods, etc.
// Enum is used to define a collection of constants.
// Enum constants are implicitly static and final. 
// Enum can be defined within or outside the class and it can be defined within the interface.
// Enum in Java is a keyword, a feature which is used to represent fixed number of well-known values in Java, For example, Number of days in Week, Number of planets in Solar system, Number of cards in a deck.
// Enum in Java is a data type that contains fixed set of constants.
// Enumerations serve the purpose of representing a group of named constants in a programming language.
// Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command line flags, etc.
// It is not recommended to use Enum as a type of a variable, because it is not flexible, for example, you cannot have a method that can return different Enum types.
// Enum can be defined as a separate or inside class or interface.
// Enum in Java can be declared outside or inside a Class.
// Enum in Java can implement many interfaces but cannot extend any class because it internally extends Enum class.
// Enum in Java is type-safe: Enum has their own namespace. It means two enum types cannot have same name.
// Enum in Java can be traversed.
// Enum in Java can have fields, constructors, and methods.
// Enum in Java may implement many interfaces but cannot extend any class because it internally extends Enum class.
