package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIJava {
    public static void main(String[] args) {
        System.out.println(" Stream Api in the java");

        List<Integer> nums = Arrays.asList(1,2,5,7,8,9,34,12);
        nums.forEach(n-> System.out.println(n));

// Stream API
        Stream<Integer> s1 = nums.stream();  // the stream will not affect the nums any changes done by it

      //  s1.forEach(n -> System.out.println(n)); // once you use the stream but you can't use it agian 
       // s1.forEach(n -> System.out.println(n)); // will give the  error warning 

//Using the  Stream filter 
        Stream<Integer> s2 = s1.filter(n-> n%2==0);
      // s2.forEach(n-> System.out.println(n));  // comment s1 as we are reusing the s1 in the s2

// Stream for doubling the value
        Stream<Integer> s3 = s2.map(n-> n*2);
        //s3.forEach(n-> System.out.println(n));

// Reduce  it will give the int new value a single value 
        int result = s3.reduce(0, (c,e)-> c+e);
        System.out.println(result);


// Using the stream in shorter form  , (Here the nums.stream give the Streams and on the we are applying the filter, map , reduce )
        int result1 = nums.stream()
                        .filter(n-> n%2==0)
                        .map(n-> n*2)
                        .reduce(0, (c,e) -> c+e);
        System.out.println(result1);
    }
}

// Stream is interface

    // // Adding the even num [It is same concept used in the above streams s1 , s2, s3]
    // int sum = 0;
    // for(int n : nums)  
    //     if (n%2==0) {
    //         n= n*2;
    //         sum = sum+n;
            
    //     }
    // System.out.println(sum);