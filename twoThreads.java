// Method 1: Extending the Thread class (Prints Even Numbers)
class EvenThread extends Thread {
    @Override
    public void run() {
        System.out.println("--- Even Numbers (Thread Class) ---");
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line
    }
}

// Method 2: Implementing the Runnable Interface (Prints Odd Numbers)
class OddRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("--- Odd Numbers (Runnable Interface) ---");
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line
    }
}

// Main Class
public class twoThreads {
    public static void main(String[] args) {
        
        // 1. Creating and starting Thread created by EXTENDING THREAD CLASS
        EvenThread evenThread = new EvenThread();
        
        // 2. Creating and starting Thread created by IMPLEMENTING RUNNABLE INTERFACE
        OddRunnable oddRunnable = new OddRunnable();
        Thread oddThread = new Thread(oddRunnable); // Pass Runnable instance to Thread class

        // Starting both threads
        evenThread.start();
        
        try {
            // join() ensures even thread finishes before odd thread starts (for clean output execution)
            evenThread.join(); 
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        oddThread.start();
    }
}