package OOP_concept;

abstract class Car               // To make the class where the the new method can be 
// implemented make it as the abstract class and the method which need to be implement later 
{
    public  abstract void drive();   // put the ; at the end of the method 
    public abstract void fly();

    public void playmusic()
    {
        System.out.println("play Music");
    }
}


    
// the Feature class must extends the drive() method or override it 
// here if we are not or don't want to implementing the fly class in this then we can make it abstract it too
//class Feature extends Car

abstract class Feature extends Car   // but now we can't make the obj of abstract class so need another class called the concrete class

{
    public void  drive() {
        System.out.println(" Driving feature");
    }
}

class UpdatedFeature extends Feature  // concrete class 
{
    public void fly()
    {
        System.out.println(" Flying Feature ");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        
       // Car objFeat = new Car();    // you can't create the object of the abstract class

       // Car objFeat = new Feature(); // you can reference the abstract class and obj of the feature class
        Car objFeat = new UpdatedFeature(); // Now need to make the obj of concrete class as the Feature is abstract
        objFeat.drive();
        objFeat.playmusic();
        objFeat.fly();
    }
}


// The abstract class would have the abstract method it is not compulsory
// it is compulsory the to define all the abstract method 