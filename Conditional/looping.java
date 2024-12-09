package Conditional;

public class looping {
    public static void main(String a[])
    {
        // # While Loop
        int i = 1;
        while(i<=5)
        {
            System.out.println("HI"+ i);
            i++;
            int j=1;
            while (j<=3) {
                System.out.println("Hello " +j);
                j++;
            }
        }
        System.out.println("Bye" + i); // at the time of being false

    forloop f_Forloop = new forloop();
    f_Forloop.floop();
    }
}

// For Loop

class forloop{
    void floop()
    { 
      for(int i=0;i<=3;i++)
      {  
      System.out.println("For Loop " +i);
      }

      for(int i=1;i<=7;i++)
      {
        System.out.println("Day "+i);        
        for(int j=1;j<=9;j++)
        {
            System.out.println(" "+(j+8)+ "-" + (j+9));

        }
      }
    }
} 