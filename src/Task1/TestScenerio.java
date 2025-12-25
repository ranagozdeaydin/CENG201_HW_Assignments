package Task1;

public class TestScenerio {
    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        Patient p1 = new Patient(4 , "Rana Gözde Aydın",8 , 21 );
        Patient p2 = new Patient(3 , "Fatma Aydoğan", 4 ,19 );
        Patient p3 = new Patient(7 , "Batuhan Efe Korkmaz", 2 ,20);
        Patient p4 = new Patient(1 , "Kemal Berat Tunçbilek", 10 , 22);
        Patient p5 = new Patient(5, "Betül Aslan", 6, 18);
// ı added 5 patient
        patientList.addPatient(p1);
        patientList.addPatient(p2);
        patientList.addPatient(p3);
        patientList.addPatient(p4);
        patientList.addPatient(p5);
//remove patient from ıd
        System.out.println("Removing patient with ID 4");
        patientList.removePatient(4);
//search patient from ıd
        System.out.println("Searching patient with ID 1");
        Patient found = patientList.findPatient(1);


        if (found != null){
            System.out.println(
                    "Found -> ID:" + found.id +
                            " Name: " + found.name +
                            " Severity: " + found.severity +
                            " Age: " + found.age
            );

        }else {
            System.out.println("Patient not found");
        }
        System.out.println("\nFinal Patient List:");
        patientList.printList();
    }




}
