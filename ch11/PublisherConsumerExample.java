package ch11;

// A class that incorrects implements the producer-consumer problem
// using the wait() and notify() methods
class Queue {
    int position;
    boolean valueSet = false; // Flag to indicate whether a value has been set

    synchronized int consume() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        System.out.println("Got: " + position);
        valueSet = false;

        // Notify the producer that a value has been consumed
        notify();
        return position;
    }

    synchronized void produce(int position) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        this.position = position;
        valueSet = true;

        // Notify the consumer that a value has been set
        System.out.println("Put: " + position);
        notify();
    }
}

class Producer implements Runnable {
    Queue queue;

    Producer(Queue queue) {
        this.queue = queue;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;

        while (true) {
            queue.produce(i++);
        }
    }
}

class Consumer implements Runnable {
    Queue queue;

    Consumer(Queue queue) {
        this.queue = queue;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
                queue.consume();
        }
    }
}

public class PublisherConsumerExample {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue);

        // Start the threads
        p.run();
        c.run();

        System.out.println("Press Control-C to stop.");
        
    }
}
