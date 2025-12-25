package Task2;

public class TestScenario {

    public static void main(String[] args) {
        TreatmentQueue trq = new TreatmentQueue();
        // add 8 patient to the treatment request
        TreatmentRequest treat1 = new TreatmentRequest(41, true);
        TreatmentRequest treat2 = new TreatmentRequest(42, true);
        TreatmentRequest treat3 = new TreatmentRequest(43, true);
        TreatmentRequest treat4 = new TreatmentRequest(44, false);
        TreatmentRequest treat5 = new TreatmentRequest(45, false);
        TreatmentRequest treat6 = new TreatmentRequest(46, false);
        TreatmentRequest treat7 = new TreatmentRequest(47, true);
        TreatmentRequest treat8 = new TreatmentRequest(48, false);

//enqueue(add)
        trq.enqueue(treat1);
        trq.enqueue(treat2);
        trq.enqueue(treat3);
        trq.enqueue(treat4);
        trq.enqueue(treat5);
        trq.enqueue(treat6);
        trq.enqueue(treat7);
        trq.enqueue(treat8);
//delete 3 patient
        System.out.println("Processing 3 treatment requests:");
        trq.dequeue();
        trq.dequeue();
        trq.dequeue();
//print final queue
        System.out.println("\nRemaining treatment queue:");
        trq.printQueue();
    }
}
