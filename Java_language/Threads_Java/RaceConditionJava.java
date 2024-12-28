package Threads_Java;

class Counter {
    int count;

    public synchronized void increment() {  // use the synchronized keyword to make the method thread safe (Last Step)
        count++;
    }
}


public class RaceConditionJava {
    public static void main(String[] args) {
        System.out.println("Thread in Java");


        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                //System.out.println("What are you doing");
                c.increment();   // The increament is called the 2000 times
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

 // Ask the main thread to wait for the t1 and t2 to complete

        try {
            t1.join();  // The main thread is waiting for the t1 to complete
            t2.join();  // The main thread is waiting for the t2 to complete
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(c.count);  //  when The main thread is not waiting for the t1 and t2 to complete
        // The output will be the different bcz the main thread is not waiting for the t1 and t2 to complete
        
}
}



//Race Condtions

// when two or more threads are trying to access the same resource and they try 
// to change the resource at the same time then the final output is not as expected This is
// called the thread interference

// Mutation

// Mutation is the change in the state of the object,
// when two threads are trying to change the state of the object at the same time
//then the final output is not as expected



// When there is two t1 and t2  threads and they are trying to change the state of the object 
// at the same time  then the final output is not as expected like t1 and t2 is changing 
// the value of the x at the same time then the final output is not as expected

// Thread Safe
// The thread safe is the concept in which the final output is as expected always 

// String is immutable, so the mutation is not possible in the string
// String is thread safe bcz it is immutable and the final output is as expected always


// Thread States

// New state
// Runnable
// Running
// Waiting/Blocked
// Timed Waiting
// Terminated/Dead

// New State: When the object of the thread is created then the thread is in the new state
//Exampel: Thread t1 = new Thread(obj1);

// Runnable: When the start() method is called then the thread is in the runnable state
// Example: t1.start();

// Running: When the thread is executing then the thread is in the running state
// Example: t1.run();

// Waiting/Blocked: When the thread is waiting for the other thread to complete then the thread is in the waiting state
// Example: t1.join();

// Timed Waiting: When the thread is waiting for the other thread to complete for the specific time then the thread is in the timed waiting state
// Example: Thread.sleep(1000);
// to combe out of the timed waiting state we can use the interrupt() method
// Example: t1.interrupt();

// Terminated/Dead: When the thread is completed then the thread is in the terminated state
// Example: t1.join();  // The main thread is waiting for the t1 to complete
// Example: t1.stop();  // The thread is stopped