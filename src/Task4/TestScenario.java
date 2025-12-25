package Task4;
import Task1.Patient;
import Task4.HospitalSystem;
public class TestScenario {


        public static void main(String[] args) {

            HospitalSystem hstsystem = new HospitalSystem();
// add 10 new patient
            hstsystem.registerPatient(new Patient(25, "Şener Aydın", 2, 53));
            hstsystem.registerPatient(new Patient(26, "Hurite Türkoğlu", 9, 48));
            hstsystem.registerPatient(new Patient(27, "Hülya Çelik", 8, 24));
            hstsystem.registerPatient(new Patient(28, "Işıl İrem Aydın", 4, 29));
            hstsystem.registerPatient(new Patient(29, "Selin Türkoğlu", 7, 23));
            hstsystem.registerPatient(new Patient(30, "Uygar Keskin", 6, 20));
            hstsystem.registerPatient(new Patient(31, "Ece Türkoğlu", 1, 36));
            hstsystem.registerPatient(new Patient(32, "Cavide Keskin", 3, 49));
            hstsystem.registerPatient(new Patient(33, "Beyza Çakmak", 5, 65));
            hstsystem.registerPatient(new Patient(34, "Deniz Işıldak", 8, 68));

//add treatment request
            hstsystem.addTreatmentRequest(25, true);//priority
            hstsystem.addTreatmentRequest(26, true);//priority
            hstsystem.addTreatmentRequest(27, true);//priority
            hstsystem.addTreatmentRequest(28, false);
            hstsystem.addTreatmentRequest(29, false);

            hstsystem.addTreatmentRequest(30, false);
            hstsystem.addTreatmentRequest(31, false);
            hstsystem.addTreatmentRequest(32, false);


            hstsystem.processNextTreatment();
            hstsystem.processNextTreatment();


            hstsystem.processNextTreatment();
            hstsystem.processNextTreatment();
            hstsystem.processNextTreatment();
            hstsystem.processNextTreatment();

//sort by severity level
            hstsystem.sortPatientsBySeverity();

//print status
            hstsystem.printStatus();
        }
}
