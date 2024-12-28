package Threads_Java;

// MULTIPLE THREADS IN JAVA

// you can create multiple threads in java by using the following ways:
// By extending Thread class
// By implementing Runnable interface

//class Msg 
class Msg extends Thread
{
    // public void display()
    public void run()
    {
        for(int i=1; i<=100;i++)  // if we have the multiple threads then the output will be the mixed output
        {
            System.out.println("HI");

            // // sleeping the thread for some second
            // try {
            //     Thread.sleep(1000);  // 1000 milliseconds = 1 second
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
           

        }
    }

}

//class Body
class Body extends Thread
{
    // public void display()
    public void run()
    {
        for(int i=1; i<=100;i++) // if we have the multiple threads then the output will be the mixed output
        {
            System.out.println("What are you doing");
        }
    }

}

// Note: We have to use start() method to start the thread, if we use the run() method then it will be executed
// as the normal method and the output will be the sequential output
// The start() method is used to start the execution of the thread. The start() method internally calls the run() method of the class.

// We need to use the scheduler to schedule the threads, the scheduler will decide which thread to run first and which thread to run next.
//


public class ThreadsJava {
    public static void main(String[] args) {
        System.out.println("Threads in Java");

        Msg obj1 = new Msg();
        Body obj2 = new Body();
        // obj1.display();
        // obj2.display();

        System.out.println(obj1.getPriority());  // 5

// Set the priority of the thread

         obj1.setPriority(10);  // 10 is the maximum priority
        // obj1.setPriority(Thread.MIN_PRIORITY);  // 1 is the minimum priority
        // obj1.setPriority(Thread.MAX_PRIORITY);  // 10 is the maximum priority

        obj1.start();
        try {
            Thread.sleep(1000);  // 10 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();

        //  you can't controll the schedular but  you can only suggest the scheduler to run the thread first but the scheduler will decide which thread to run first
      
    }
}





// Threads in Java: 
// A thread is a lightweight sub-process, the smallest unit of processing.
// Multiprocessing and multithreading, both are used to achieve multitasking.
// But we use multithreading than multiprocessing because threads share a common memory area.
// They don't allocate separate memory area so saves memory,
// and context-switching between the threads takes less time than processes.
// Threads are independent, concurrent paths of execution through a program.
// The Java Virtual Machine allows an application to have multiple threads of execution running concurrently.
// Each thread has a priority. Threads with higher priority are executed in preference to threads with lower priority.
// Each thread may or may not also be marked as a daemon.
// When code running in some thread creates a new Thread object,the new thread has its priority initially set equal to the priority of the creating thread,
//and is a daemon thread if and only if the creating thread is a daemon.
 // When a Java Virtual Machine starts up, there is usually a single non-daemon thread 
 //(which typically calls the method named main of some designated class).


    // The Java Virtual Machine continues to execute threads until either of the following occurs:
    // The exit method of class Runtime has been called and the security manager has permitted the exit operation to take place.
    // All threads that are not daemon threads have died, either by returning from the call to the run method or by throwing an exception that propagates beyond the run method.
    // There are two ways to create a thread:
    // By extending Thread class
    // By implementing Runnable interface
    // Thread class provides constructors and methods to create and perform operations on a thread.
    // Thread class extends Object class and implements Runnable interface.
    // Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
    // Runnable interface has only one method named run.
    // A thread is created by extending the Thread class.
