package Task2;

public class TreatmentQueue {
    Node front = null;
    Node rear = null;
    int size = 0;
//enqueue operation
    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request);
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        ++this.size;// because of adding size must be ++

    }
// dequeue operation
    public TreatmentRequest dequeue() {
        if (this.front == null) {
            return null;
        } else {
            TreatmentRequest removed = this.front.data;
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }

            --this.size;//because of deleting size--
            return removed;
        }
    }

//return size
    public int size() {return this.size;}
//printing queue
    public void printQueue(){
        Node current = this.front;
        if (current == null){
            System.out.println("Empty treatment queue");
        } else{
            while (current.next != null){
                System.out.println("Patıent ID: " + current.data.patientId +
                        " | Arrival Time:  " + current.data.arrivalTime);
                current = current.next;
            }
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
}

