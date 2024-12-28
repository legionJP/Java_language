package OOP_concept;

class An{
    public void show() {
        System.out.println(" In An Show ");
    }
}

// When we don't want to use the extended class multiple times or only want to use it once 
// we can use the inner class implementation  after creating the obj of the class 

// class Ab extends An{
//     public void show() {
//         System.out.println(" In Ab Show ");
//     }
// }


public class AnonymousCls
{
    public static void main(String a[])
    {
       // An objA = new An();
       // An objA = new Ab();  // overriding

// Implementation of the Inner class which don't have the name called the Annonymou class with 
// new implemetation of the method and override the show method
       An objA = new An()
       {
        public void show()
        {
            System.out.println("In a new Show");
        }
       };

        objA.show();    
    }
}
