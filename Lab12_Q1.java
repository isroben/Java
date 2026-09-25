class ThreadSafeSingleton {
    // Volatile instance guarantees visibility across threads
    private static volatile ThreadSafeSingleton instance;

    // Private constructor prevents instantiation
    private ThreadSafeSingleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Double-checked locking method
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}

public class Lab12_Q1 {
    public static void main(String[] args) {
        Runnable task = () -> {
            ThreadSafeSingleton s = ThreadSafeSingleton.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName() + " -> HashCode: " + s.hashCode());
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}