package hw2;

public interface QueueBehaviour {
    void putInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}