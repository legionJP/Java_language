package OOP_concept;

abstract class Car               // To make the class where the the new method can be 
// implemented make it as the abstract class and the method which need to be implement later 
{
    public  abstract void drive();   // put the ; at the end of the method 

    public void playmusic()
    {
        System.out.println("play Music");
    }
}


class Feature extends Car      // the Feature class must extends the drive() method or override it 
{
    public void  drive() {
        System.out.println(" Driving feature");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        
       // Car objFeat = new Car();    // you can't create the object of the abstract class

        Car objFeat = new Feature(); // you can reference the abstract class and obj of the feature class
        objFeat.drive();
        objFeat.playmusic();
    }
}
