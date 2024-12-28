package Interface_Java;

@FunctionalInterface
interface Lam{
    void show();
}

// part2, When Method accepts the arguments
@FunctionalInterface
interface Lam1{
    void show(int i);
}

public class LambdaExpression
{
    public static void main(String[] args)
    {
        System.out.println(" Lambda Expression in Java ");

        // Anonymous class 

        // Lam obj = new Lam()    
        //  {
        //     public void show()
        //     {
        //         System.out.println("I am the best");
        //     }
        // };
        // obj.show();

// Lambda Expression
        Lam obj = () -> {
            System.out.println("I am the best");
        };
        obj.show();

// here behind the scene the compiler will create the class and the object of the class and the method of the class

//2. OR
        Lam obj1 = () -> System.out.println("I am the best of the best ");  // lambda expression as the body of the method is only one line
        obj1.show();

// PART2: When Method accepts the arguments:

        Lam1 obj2 = (int i) -> System.out.println("The value of i is: " + i);
        obj2.show(5);

        // OR
        Lam1 obj3 = (i) -> System.out.println("The value of i is: " + i); // we can remove the data type of the argument as we menthioned the data type in the interface
        obj3.show(10);
        
        // OR
        Lam1 obj4 = i -> System.out.println("The value of i is: " + i); // we can remove the paranthesis if we have only one argument
        obj4.show(15);
    }
}

// Note: The lambda expression will not create the seprate class when comiling the code,
// But the Main class size will be increased as the lambda expression will be added in the main class