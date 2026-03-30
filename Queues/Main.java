package Queues;

public class Main {
    public static void main(String[] args) {
        Queues myQueues = new Queues(5);
        myQueues.enqueue(6);
        myQueues.enqueue(7);
        myQueues.enqueue(8);
        // myQueues.getFirst();
        // myQueues.getLast();
        // myQueues.getLength();
        myQueues.printQueue();
        System.out.println("=========================");
        myQueues.dequeue();
        // myQueues.enqueue(6);
        myQueues.printQueue();
    }
}
