package Task2;

public class PriorityTreatmentQueue {
    private TreatmentQueue priorityQueue;
    private TreatmentQueue normalQueue;
//constructor
    public PriorityTreatmentQueue() {
        priorityQueue = new TreatmentQueue();
        normalQueue = new TreatmentQueue();
    }
//enqueue method (add)
    public void enqueue(TreatmentRequest request) {
        if (request.priority) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }
//dequeue method (delete)
    public TreatmentRequest dequeue() {
        if (!priorityQueue.isEmpty()) {
            return priorityQueue.dequeue();
        }
        return normalQueue.dequeue();
    }
//Print method for queues
    public void printQueue() {
        System.out.println("Priority Queue:");
        priorityQueue.printQueue();

        System.out.println("Normal Queue:");
        normalQueue.printQueue();
    }
}
