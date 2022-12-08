package d04.s02;

public class ThreadsMain {

    public static void main(String[] args) {
        System.out.println("Current executing thread: " + Thread.currentThread().getName());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("From the new thread, invoked by " + Thread.currentThread().getName());
            }
        }, "new-thread");
        thread.start();
    }
}
