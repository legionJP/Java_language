package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIJava {
    public static void main(String[] args) {

        // List<Integer> nums = new ArrayList<>();
        // nums.add(4);
        
// or using the asList 
        List<Integer> nums = Arrays.asList(3,4,5,7,8,2,3);
        System.out.println(nums);

// using the normal loop
        for(int i=0; i<nums.size(); i++)
        {
            System.out.println(nums.get(i));
        }

// Using the Enhanced For loop
// in this the array itself give the value and it goes into the n 

        // Adding the even num
        int sum = 0;
        for(int n : nums)  
            if (n%2==0) {
                n= n*2;
                sum = sum+n;
                
            }
        System.out.println(sum);

// Using the forEach Method 
// one value at a time and saving it in "n"
        nums.forEach(n-> System.out.println(n)); 
            
    }
}


// Stream API 
