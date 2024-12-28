package Annotation_Java;


class Anno1 
{   
    // public void show()
    public void showTheDataWhichBelongsToThis()     // changing the method name
    {
        System.out.println("This is Anno1");
    }
    
}

class InnerAnnoation extends Anno1
{
    @Override
   // public void showTheDataWhichBelongToThis() 
    public void showTheDataWhichBelongsToThis()  // if the method name is changed  or wrong then it will give error
    {
        System.out.println("This is InnerAnnoation");
    }    
}



public class Annotation {
    public static void main(String[] args) {
        System.out.println("Annonation in Java");

        Anno1 a = new Anno1();
        //a.show();
      //  a.showTheDataWhichBelongsToThis();

        InnerAnnoation b = new InnerAnnoation();
        b.showTheDataWhichBelongsToThis(); //overriding the show method of Anno1 class
    }
}

// An annotation is a form of syntactic metadata that can be added to Java source code.
// Classes, methods, variables, parameters and packages may be annotated. 

// Annotations are defined by the @ symbol, followed by the annotation name.
//to give the annotation  show the intetion to to compiler that  I am going to override the method of parent class
// usew @Override annotation
// anonation for the compile level and not for the runtime level


//the annotation are used to give the information to the compiler that I am going to override the method of parent class
// they are Example: @deprecated, @Override, @SuppressWarnings, 
// @SafeVarargs, @FunctionalInterface, @Retention, @Target, @Documented, @Inherited, @Repeatable, @Native, @ThreadSafe, @Immutable

