package Java_language.Array;

public class Array_intro
{   
    public static void main(String[] args)
    {
        System.out.println("it is Array Concept in Java ");
        
        // creating the array 1. 
        int nums[] =  {3,4,5,7};
        System.out.println(nums[1]);

        // update the value of the index
        nums[1]=8;
        System.out.println(nums[1]);

        // creating the array 1.
        int nums1[] = new int[5]; 
        System.out.println(nums1[1]);

        nums1[0] =4;
        nums1[1] =2;
        nums1[2] =3;
        nums1[3] =5;
        nums1[4] =7;
        System.out.println(nums1[1]);
       
        // Printing the all the values in the array

        for(int i=0 ;i<5; i++)
        {
            System.out.println("Value of array is " + nums1[i]);
        }


    }
    
}


// Array :

// int j=5, int i =6, int k= 7, here we have the 3 var for 3 diff values

// We can create one simple var. and store the 3 value in Array

// int num [] = {1,2,3,4,5};
// []---> indicates it can store multiple values 

// int num1[] = new int[4]  # Fixed Size array

