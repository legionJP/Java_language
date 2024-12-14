package OOP_concept.Inheritence;

class A{

}

class B extends A{

}

// class C entends B , A // Ambiguity problem
class C extends B{

}



public class MultipleInherit {
    public static void main(String a[])
    {
        System.out.println(" Multiple level Inheritance ");
        


    }    

}


// if Classes A and B have the same method name and C extentds the A and B
// Then there is Problem of ambiguity means which one method to choose 
// from which class , so this direct extends of multiple method don't work 
// in java
