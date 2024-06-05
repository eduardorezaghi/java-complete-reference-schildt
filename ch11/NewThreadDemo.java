package ch11;

import java.util.Random;


class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }

    NewThread(String name) {
        t = new Thread(this, name);
        System.out.println("Child thread: " + t);
    }

    public void run() {
        harmonicSeries();
        System.out.println("Exiting child thread.");
    }

    private void harmonicSeries() {
        double sum = 0.0;
        for (int i = 1; i <= 10000; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Sum of harmonic series: " + sum);
    }
}

public class NewThreadDemo {
    public static void main(String[] args) {
        Thread currThread = Thread.currentThread();
        System.out.println("Current thread: " + currThread);

        NewThread nt = new NewThread();
        nt.t.setPriority(Thread.MAX_PRIORITY);
        currThread.setPriority(Thread.MIN_PRIORITY);

        nt.t.start();

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
