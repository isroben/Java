// Thread class extending Thread
class PriorityThread extends Thread {
    
    // Constructor to set thread name
    PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // Displaying current thread details: Name and Priority
        System.out.println(Thread.currentThread().getName() + 
                           " | Priority: " + Thread.currentThread().getPriority());
    }
}

// Main Class
public class threadPriorities {
    public static void main(String[] args) {

        // Creating three thread instances
        PriorityThread t1 = new PriorityThread("Thread-1 (Low)");
        PriorityThread t2 = new PriorityThread("Thread-2 (Medium)");
        PriorityThread t3 = new PriorityThread("Thread-3 (High)");

        // 1. Getting default priorities before setting new ones
        System.out.println("--- Default Priorities ---");
        System.out.println(t1.getName() + " default priority: " + t1.getPriority());
        System.out.println(t2.getName() + " default priority: " + t2.getPriority());
        System.out.println(t3.getName() + " default priority: " + t3.getPriority());

        // 2. Setting new priorities using predefined constants / integers
        t1.setPriority(Thread.MIN_PRIORITY); // Value: 1
        t2.setPriority(Thread.NORM_PRIORITY); // Value: 5
        t3.setPriority(Thread.MAX_PRIORITY);  // Value: 10

        System.out.println("\n--- Updated Priorities ---");
        System.out.println(t1.getName() + " updated priority: " + t1.getPriority());
        System.out.println(t2.getName() + " updated priority: " + t2.getPriority());
        System.out.println(t3.getName() + " updated priority: " + t3.getPriority());

        // 3. Starting the threads to observe execution
        System.out.println("\n--- Running Threads ---");
        t1.start();
        t2.start();
        t3.start();
    }
}