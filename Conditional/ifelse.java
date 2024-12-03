package Conditional;

class ifelse
{
    public static void main(String[] args) 
    {   
        int x =11;
        int y =7;
        int z = 12;
        //if(x>10)
        if(x>10 && x<=20)
        {          //  if there are multiple statement inside the if condition we need to put  brackets {}
            System.out.println("Conditional");
            System.out.println("x block");

        }
        else
        {
            System.out.println("Not true"); 
        }

        if(x>y && x>z)
            System.out.println(x);
            
        else if(y>z) 
            System.out.println(y);
        else
            System.out.println(z);    

    }
}


//