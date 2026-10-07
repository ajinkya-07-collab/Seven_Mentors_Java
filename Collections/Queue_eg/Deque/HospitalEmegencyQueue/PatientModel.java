package Collections.Queue_eg.Deque.HospitalEmegencyQueue;

public class PatientModel {

    private int patientId;
    private String name;
    private String priority;

    public PatientModel(int patientId, String name, String priority) {
        this.patientId = patientId;
        this.name = name;
        this.priority = priority;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "[patientId=" + patientId + ", name=" + name + ", priority=" + priority + "]";
    }

}
