package OOP_concept;

class A
{   
    int age;
    public void show()
    {
        System.out.println(" In Show ");
    }

    class B{
        public void config()
        {
            System.out.println(" In config ");
        }
    }    
}

public class InnerClass {
    public static void main(String[] args)
    {
        A objA = new A();
        objA.show();
        
        // object of inner class B

        A.B objB = objA.new B();
        objB.config();
    }
}
