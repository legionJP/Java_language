package Threads_Java;

// Using the Runnable interface
// Runnable interface is used to create the multiple threads in java

class Msg implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("HI");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}

class Body implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("What are you doing");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e){

        }

    }
}


public class RunnableandThread {
    public static void main(String[] args) {
        System.out.println("Threads in Java");

      
        // Msg obj1 = new Msg();
        // Body obj2 = new Body();

        Runnable obj1 = new Msg();
        Runnable obj2 = new Body(); // taking the refrerence of the runnable interface and creating obj of the class


        Thread t1 = new Thread(obj1);   // the tread class takes the object of the runnable interface
        Thread t2 = new Thread(obj2);

       // obj1.run();  // here the start will not work, bcz it is not part of the runnable interface
        t1.start();  // We can use the start after creating the object of the thread
        t2.start();

// Using the Lambda Expression bcz runnable is the functional interface

        Runnable obj3 = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Lambda HI");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        };

        Runnable obj4 = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("You are in thread ");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        };

        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);
        t3.start();
        t4.start();



    }
}




// // Using the Runnable interface
        // Runnable obj1 = new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("Hi");
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (Exception e) {
        //             }
        //         }
        //     }
        // };

        // Runnable obj2 = new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("Hello");
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (Exception e) {
        //             }
        //         }
        //     }
        // };

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // try {
        //     Thread.sleep(10);
        // } catch (Exception e) {
        // }
        // t2.start();