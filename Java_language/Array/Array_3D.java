package Array;

public class Array_3D 
{   
    public static void main(String a[])
    {
        System.out.println("Hello 3D array: ");

        int nums[][] = new int[3][];  // This is jagged Array
        nums[0]= new int[3]; // Specifying the rows for individual columns
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0; i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {   
                nums[i][j] = (int)(Math.random()*10);

            }
        }

        for(int n[]:nums)
        {
            for(int m:n)
            {
                System.out.print(m + " ");

            }
            System.out.println();
        }


        // 3-D Array:

        int nums1 [][][] = new int[3][4][5];
        for(int i=0; i<nums1.length;i++)
        {
             for(int j=0;j<nums1[i].length;j++)
             {
                for(int k=0; k<nums1[i][j].length;k++)
                {
                    nums1[i][j][k]= (int)(Math.random() *10);
                }
             }
        }

        // printing the 3D array
        for(int[][] matrix: nums1 )
        {
            for(int[] row: matrix )
            {
                for(int  element: row)
                {
                    System.out.print(element+ " ");

                }
                System.out.println();
            }
            System.out.println("------");
        }

    }


    
}


//3 D Array:
/*
1. Jagged Array:

 * Internal or inside array will have the differnt size of array means diiferent 
 * columns
 * 
 */