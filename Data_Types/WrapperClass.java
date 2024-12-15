package Data_Types;

public class WrapperClass {
    
    public static void main(String[] args) {
        int num =7;

        Integer num1 = new Integer(7);
        // Taking the primitive value and stroing it in a objcet called boxing  

        Integer num2 =num;  // Auto boxing , convert primitive to object automatically, num2 == object

        int num3 = num2.intValue(); //  auto un-unboxing 

        System.out.println(num + ",  "+ num1 + ", " + num2);

        String str="12";
        int num4 = Integer.parseInt(str); // this Integer class is call the wrapper class , bcz wrapping it into the int 
        System.out.println(num4*2);

    }
}



// Wrapper Class
/*
 * int --> Integer (class---> extents the object class)
 * chae -- > Character
 * double --< Double
 * 
 * 
 */