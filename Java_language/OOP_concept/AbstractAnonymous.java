package OOP_concept;

abstract class Abs{
    public abstract void show();
    public abstract void config();
}


public class AbstractAnonymous {
    public static void main(String[] args)
    {
        Abs objAbs = new Abs() {
            
            public void show()
            {
                System.out.println(" This is Show ");
            }

            public void config()
            {
                System.out.println(" This is config ");
            }
        };
        objAbs.config();
        objAbs.show(); 
    }
}


// Implementing the method for the abstract class and and method using the inner Class

