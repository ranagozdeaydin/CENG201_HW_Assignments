package Task3;

public class TestScenario {
    public static void main(String[] args) {
        DischargeStack st = new DischargeStack();
        //add five patient
        DischargeRecord a1 = new DischargeRecord(71);
        DischargeRecord a2 = new DischargeRecord(72);
        DischargeRecord a3 = new DischargeRecord(73);
        DischargeRecord a4 = new DischargeRecord(74);
        DischargeRecord a5 = new DischargeRecord(75);
// for stack add by using push
        st.push(a1);
        st.push(a2);
        st.push(a3);
        st.push(a4);
        st.push(a5);
//delete using pop
        System.out.println("Popping 2 discharged patients:");
        st.pop();
        st.pop();
//print remaining stack
        System.out.println("\nRemaining discharge stack:");
        st.printStack();

     }
}
