package Array;

public class Array_MultiD {
    public static void main(String a[])
    {
        System.out.println("This is Multi dimension Array ");

        int nums[][] = new int[3][4];
        

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4;j++)
            {   
                nums[i][j]= (int)(Math.random()*10); // fetching the random values
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        // Enhanced for loop is used to iterate over 
        // the elements of the nums array and print them.
        
        System.out.println("This is Enhanced loop: ");
        for(int n[]: nums)   // n is array of single dimension from multi D of nums
        {   
            for(int m:n)
            {
                System.out.print(m+ " ");
            }
        System.out.println();
        }

    }
}


// Multi Dimension Array:
/*
 * n1 =[2,3,4,56,7] ---> 0[1]
 * n2 = [ 3,4,5,6,7,8] ---> 1[1]
 * n3 = [4[,5,6,7,8,0] ---> 2[1]
 * N = [[n1],[n2],[n3]]  # Multi Dimensional array
 * 
 * Syntax: int nums [][] = new int[3][4];  ---> 3 array with the 4 elemnets
 * 
 */