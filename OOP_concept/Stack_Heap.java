// Memory Management in the Java by JVM 
// Stack and Heap

package OOP_concept;


class Calculator   
{   
    int num =8;  // this is instance var.

    public int add(int n1, int n2) // Every Method will Have it's Own Stack
     // n1 and n2 is local vaibale
    {
        return  n1+n2;
    }

    public double add(double n1 , int n2) // Every Method will Have it's Own Stack
    {
        return n1+n2;
    }
}


public class Stack_Heap
{   
    public static void main(String a[])
    {
        System.out.println("This is heap and Stack Mem. ");
        int a1=10;
        System.out.println(a1); // Local var.


        Calculator obj = new Calculator();
        int r1 =obj.add(1,2);
        System.out.println(r1);

        // obj.num=8;
        //System.out.println(obj.num);   // Giving the error 

        // These obj and if new obj1 will not affect the each other
    }    

}




// Inside JVM --

// 1. Stack --- Last In First Out --- LIFO  (Stores the data in different sequence)

/* main stack: it will have the two column or two stack 
 * -----------
 * -   -    -
 * -   -    -
 * -   -    -
 * -   -    -
 * -r1 -    -
 * -a  - 10 -
 * -----------
 * for storing the r1 another stack will be created n ad int will have the n1 ad n2
 * 
 * as the num as instance var is not part of any method , we can use the num 
 * inside the method , So the num resides in the Heap memory
 * 
 * also the obj as ref var will be created in the Heap memory, so the instance var 
 * aslo is in te heap
 * 
 * And the obj address of the heap memory will be stored in the Stack when the add()
 * method is called ... Like From main method stack to Heap, and we can use the 
 * obj multiple times
 * 
 * --> So there is Link Between the Main stack and heap . 
 */
// 2. Heap -- It exands and it have the open space