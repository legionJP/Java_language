package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduce {
    public static void main(String[] args) {
        System.out.println(" Map filter Reduce and Sorted in the Java ");
        List<Integer> nums = Arrays.asList(34,56,76,23,8,9,7,53,21);

// Filter Workings

// Using/ Implementing the predicate for filter

        // Predicate<Integer> p = new Predicate<Integer>() {
        //     public boolean test(Integer n)
        //     {
        //         if(n%2 ==0)
        //             return true;
        //         else    
        //             return false;

        //     }
        // };

// Predicate is the function Interface so we can use the lambad
        Predicate<Integer> p = n -> n%2==0;
// -----------------------------------------------------------------------------------------
// Map Working

        // Function<Integer, Integer> fun = new Function<Integer,Integer>() {
        //     // override the apply method of it
        //     public Integer apply(Integer n)
        //     {
        //         return n*2;
        //     }
        // };

// Lmabda Form 
        Function<Integer, Integer> fun = n -> n*2;  

//-----------------------------------------------------------------------------------------

// Reduce Working
        BinaryOperator<Integer> sreduce = (a,b) -> a+b; // for the same type of inputs
       // BiFunction<Integer, Integer, Integer> sreduce = (a,b) -> a+b; // for the differnt type inputs
//-----------------------------------------------------------------------------------------

        int result = nums.stream()
                        .filter(p)   // using the p object as predicate instead of n for filter method
                        .map(fun)  // using the fun instead of n -> n*2
                        .reduce(0, sreduce);  // using the 0 , sreduce (obj) instead of 0, (c,e) -> c+e);
        System.out.println(result);


        // int result = nums.stream()
        //                 .filter(n -> n%2 ==0)
        //                 .map(n -> n*2)
        //                 .reduce(0, (c,e) -> c+e);
        // System.out.println(result);

//-----------------------------------------------------------------------------------------    
// Using the SortedValues stream  
        Stream<Integer> SortedValues = nums.stream()
                                        .filter(n -> n%2 ==0)  // this is filtering with the single thread but we can do multiple thread by using the Parallel Stream for the filter
                                        .sorted();
        SortedValues.forEach(n -> System.out.println(n));

    }
}


//1. Filter
// Stream filter needs the object of the Predicate , 
// Predicate --> it is interface which has the Test method and returns the boolean value means 
// if from stream if value true it go ahead or else it will stop 

//2. Map --> it needs the object of the Function which is the FUnctional Interface and takes the two types
// It have the apply method 

//3.reduce --> it takes two parameter one is type and second is operations (Binary Operations)
// 0+1 = 1 , 1+2 = 3, 2+3 = 6 , 6(cary) + 4(element) =10
//adding the two value at a time: 0, (c,e) -> c+e

// 1.

// 2. BiFunction:
// Definition: BiFunction is a functional interface that represents a function which takes two arguments of possibly different types and produces a result.

// Generic Types: It has three generic types, representing the types of the two arguments and the type of the result.

// Usage: Use BiFunction when the input types or the result type are different or more general than the specific case handled by BinaryOperator.
// BiFunction<Integer, Integer, Integer> sumReducer = (a, b) -> a + b;


//2. 

// 1. BinaryOperator:
// Definition: BinaryOperator is a special case of BiFunction where the two input arguments and the result are all of the same type.

// Simplification: It is a functional interface that extends BiFunction<T, T, T>.

// Usage: Use BinaryOperator when you want to perform an operation on two operands of the same type and return a result of the same type.

// Example:
// java
// BinaryOperator<Integer> sumReducer = (a, b) -> a + b;