package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethod {
    public static void main(String[] args) {
        System.out.println("forEach Method in the Java ");

        List<Integer> nums = Arrays.asList(3,4,5,7,8,2,4,78);

// Using the Consumer Interface 
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n)
            {
                // action with the n 
                System.out.println(n);
            }
        };
        nums.forEach(con); // work with the consumer so need to make the object of the consumer interface

// consumer Interface is the function Inteface so using the Lambda expression
        Consumer<Integer> con1 =  n -> System.out.println(n);
        nums.forEach(con1);

// OR (Simple working of the forEach)
        nums.forEach(n -> System.err.println(n));  // No need to create the reference for the con


        //nums.forEach(n-> System.out.println(nums));
    }
}
