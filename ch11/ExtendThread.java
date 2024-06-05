package ch11;

class NewThreadInhr extends Thread {
    NewThreadInhr() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        NewThreadInhr nt = new NewThreadInhr();
        nt.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
