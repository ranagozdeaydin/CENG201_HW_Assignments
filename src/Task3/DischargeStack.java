package Task3;

public class DischargeStack{
    Node top = null;
    int size = 0;
//push (add from top)
    public void push (DischargeRecord rec) {
        Node newNode = new Node(rec);
        newNode.next = top;
        this.top = newNode;
        this.size++;
    }
// pop (delete )
    public DischargeRecord pop() {
        if(this.top == null){
            return null;
        } else {
            DischargeRecord removed = this.top.data;
            this.top = this.top.next;
            this.size--;
            return removed;
        }
    }
//ıt shows the top item ın the stack
    public DischargeRecord peek(){
        return this.top == null ? null: this.top.data;
    }
// print method
    public void printStack(){
        Node current = this.top;
        if (current == null){
            System.out.println("Stack is empty");
        } else {
            while (current != null){
                System.out.println("Parient ID: " + current.data.patientId +" | Discharge Time: "+ current.data.dischargeTime);
                current = current.next;
            }
        }
    }
    //return size
    public int size(){
        return size;
    }
}
