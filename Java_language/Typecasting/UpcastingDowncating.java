package Typecasting;


class Up
{
    public void showup()
    {
        System.out.println(" It is showUP ");
    }

}

class Down extends Up 
{
    public void showdown()
    {
        System.err.println(" It is showDown ");
    }
}

public class UpcastingDowncating {
    public static void main(String[] args) {
        System.out.println(" Type casting: ");


        // Typecasting into the int 
        double d = 5.4;
        int i = (int)d;
        System.err.println(i); 

        

      // Down objDown =  new Up();  // refering the Superclass 

       Up objUp = (Up) new Down();  // typcasting in to the super method called the Up ( Upcasting)
       
       objUp.showup();

       Down objDown = (Down) objUp;  // Downcating the objUP 
       objDown.showdown();

    }
}
