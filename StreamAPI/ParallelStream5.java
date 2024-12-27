package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ParallelStream5 {
    public static void main(String[] args) {
        System.out.println("Parallel Stream Java ");

        int size = 10_000;   // underscore to differentiate b/w number of 0s
        //List<Integer> nums = new ArrayList<>(10000);
        List<Integer> nums = new ArrayList<>(size);


        Random ran = new Random();
        for(int i=1; i<=size;i++){
            nums.add(ran.nextInt(100)); //mention the uper bound

        }
        // System.out.println(nums);
// // Method 1
//         int sum1 =nums.stream()
//                         .map(i -> i*2)
//                         .reduce(0,(c,e) ->  c+e);
//         System.out.println(sum1);

// Method 2

        long sartSeq = System.currentTimeMillis();

        int sum2 = nums.stream()
                        // .map(i -> i*2)

                        // Adding the sleep timer for the sequence thread
                        .map(i ->{
                            try{
                                Thread.sleep(1);
                            }catch(Exception e){

                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)   // return the object of the IntStream 
                        .sum();
        
        long endSeq = System.currentTimeMillis();
       // System.out.println(sum1 + " " + sum2);

// Check the number of threads used by the parallel stream 
        int parallelism = ForkJoinPool.commonPool().getParallelism(); 
        System.out.println("Parallelism level: " + parallelism);

// Method3 Using the Parallel Stream
        long sartParallel = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        // .map(i -> i*2)
                        .map( i -> {
                            try{
                                Thread.sleep(1);
                            }catch(Exception e){

                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endParallel = System.currentTimeMillis();


        System.out.println(sum2 + " "+ sum3);
        System.out.println("Seq: "+ (endSeq-sartSeq));  // working with the single thread
        System.out.println("Parallel: "+ (endParallel-sartParallel)); // multiple thread


        
    }
}


// Parallel Stream Java 