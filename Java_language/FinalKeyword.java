// Final Keywoord

// final keyword can be use with the varibale, method, class

// final class

final class Calcu // No one can extend your class and use ihneritance
{
    public final void show() 
    {
        System.out.println("In clac show method");
    }

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }

    
}

class AdvanceCalc extends Calcu // if class is extends but method is final you can't use it
{    public void show()
    {
        System.out.println(" This is show in Advance calc ");
    }
}



public class FinalKeyword {
    public static void main(String[] args) {
        System.out.println(" Final Keyword in Java ");

        // final varibale 
        
        final int num =7;   // the final keyword can't be used as it is constant now
      //  num =9;
        System.out.println(num);

        Calcu objCalcu = new Calcu();
        objCalcu.show();
        objCalcu.add(4,5);


    }
}
