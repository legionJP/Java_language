package Data_Types;

public class String_Java 
{
    public static void main(String[] arg)
    {
        
        System.out.println("Strings in java");        

        String name = "Java"; // General syntax for String
        System.out.println(name);        

        // String is Class in the Java not primitive data types

        String name1 = new String("Java1");  // name1 is obj var
        System.out.println(name1);        
        
        //concatenate
        System.out.println("Hello " +name1); 
        System.out.println(name1.concat(" Learn 21"));

        System.out.println(name1.charAt(1));
        System.out.println(name.charAt(0));



//   Mutable and Immutable String

        String str1 = "Hello";
        str1 = str1 + " Java";
        System.out.println(str1);

    }
    
}


//Note 
/*
 * String s1 ="Hello";
 *  String s2 ="Hello";
 * 
 * Here we got two refrences of One object . Value and address are the same
 *  Inside the heap there is area called the srtings Constant pool
 * it is constant and can't be change.
 * 
 * Hello as a constant pool string created as obj one time and the s2 get the refrence of it
 * 
 *  So Line number 30 will create the New Objcet in a Heap 
 * and the previous obj "Hello" will Be ready to grabage collectio
 * 
 * Means once the Object of string is created can't be changed
 * 
 * So By default the strings are Immutables
 * 
 * --> To Use the Mutable String You can use the Method String Buffer or String Builder 
  */