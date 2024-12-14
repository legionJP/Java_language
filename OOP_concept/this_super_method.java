package OOP_concept;
  

class A
{
    public A()
  // Every class in the java extend the Object class by default so there is superA()
// public A extends Object
    {  super();
          //It  means call the constructor of the super class or the default one 
        System.out.println(" const in  A ");
    }

    public A(int n)
    {
        System.out.println("In a A param ");
    }
}

class B extends A{

    public B()
    {   
       // super(1); // by passing the param int this default const will call the paramerized constructor
        System.out.println(" const in B "); //it will call the super class parameter
    }

    public B(int n)
    {   
        //super(n);  //mention super(n) it will call the param. constructor instead of the default one  
        
        this(); // it only executes the constructor of the same class
        System.out.println(" parameter const in B ");

    }
}



public class this_super_method {
    public static void main(String[] args)
    {
        System.out.println("This is this and super method ");
        B objB = new B();  // create the obj for the both super and subclass

        B objB1 = new B(5); // will call the param const.

        //default const of B
        B objb2 = new B();

       

    }
    
}


// Note:

/*
 * When we create the obj of the subclass comstructor  it create call the constructor for 
 * for the both super and subclass
 * 
 */

/*
 * Every constructor by default have the super method ,
 *  if you mention or not 
 * 
 * 
 * 
 */

