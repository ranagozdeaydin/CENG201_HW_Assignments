package Task1;

public class PatientList {
    private Node head = null;

    public PatientList() {
        this.head = null;
    }
// adding patient method
    public void addPatient(Patient p) {
        Node newNode = new Node(p);
        if (head == null) {//if the list empty
            head = newNode;

        } else {//if list does not empty
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;//move next node
        }

    }
//delete patient method
    public void removePatient(int id) {
//if the list empty call return
        if (head == null) {
            return;
        }

        if (head.value.id == id) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.value.id == id) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
// finding patient from ıd
    public Patient findPatient(int id) {
        for(Node current = this.head; current.next != null; current = current.next) {
            if (current.value.id == id) {
                return current.value;
            }
        }

        return null;
    }
//print method for all patients
    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("Patient list is empty.");
            return;
        }
        while (current != null) {
            System.out.println("ID: " + current.value.id +
                    "  Name: " + current.value.name +
                    "  Severity: " + current.value.severity +
                    "  Age: " + current.value.age);
                current = current.next;
        }
    }
}




