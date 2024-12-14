package OOP_concept;


class A1{

    public A1()
    {
        System.out.println(" Object created ");
    }

    public void show()
    {
        System.out.println(" show method ");
    }
}

public class Annony_Object {
    public static void main(String a[])
    {
        System.out.println("Annonymous Object");

        //new A(); // this is called the annoymous objecrt ]
        new A1().show(); // Using the annoymous object but you can't reuse it
       
        // A1 obj;
        // obj1 = new A() //  new A() , this is object creation

        A1 obj = new A1();
        obj.show();  // obj call the reference of show

    }
    
}
