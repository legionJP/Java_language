package Annonation_Java;


class Anno1 
{   
    // public void show()
    public void showTheDataWhichBelongsToThisClass()     // changing the method name
    {
        System.out.println("This is Anno1");
    }
    
}

class InnerAnnoation extends Anno1
{
    @Override
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("This is InnerAnnoation");
    }    
}



public class Annoation {
    public static void main(String[] args) {
        System.out.println("Annonation in Java");

        Anno1 a = new Anno1();
        //a.show();
      //  a.showTheDataWhichBelongsToThisClass();

        InnerAnnoation b = new InnerAnnoation();
        b.showTheDataWhichBelongsToThisClass(); //overriding the show method of Anno1 class
    }
}

// An annotation is a form of syntactic metadata that can be added to Java source code. Classes, methods, variables, parameters and packages may be annotated.