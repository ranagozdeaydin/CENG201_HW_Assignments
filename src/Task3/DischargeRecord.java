package Task3;

public class DischargeRecord {
    public int patientId;
    public long dischargeTime;
//constructor
    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
}
