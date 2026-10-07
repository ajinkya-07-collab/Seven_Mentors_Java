package Collections.Queue_eg.Deque.HospitalEmegencyQueue;

public class HospitalMain {
    public static void main(String[] args) {

        HospitalQueue hospital = new HospitalQueue();

        hospital.registerNormalPatient(new PatientModel(101, "Rohit", "NORMAL"));
        hospital.registerNormalPatient(new PatientModel(102, "Tushar", "NORMAL"));
        hospital.registerNormalPatient(new PatientModel(103, "Sumit", "NORMAL"));
        hospital.registerNormalPatient(new PatientModel(104, "Rohan", "NORMAL"));
        hospital.registerEmergencypatient(new PatientModel(105, "Pooja", "EMERGENCY"));
        hospital.registerNormalPatient(new PatientModel(106, "Amit", "NORMAL"));
        hospital.registerEmergencypatient(new PatientModel(107, "Suman", "EMERGENCY"));

        System.out.println("-------Waiting Patient List-------");
        hospital.showWaiting();

        System.out.println("\nTreatment : ");
        hospital.treatNextpatient();
        hospital.treatNextpatient();
        hospital.treatNextpatient();
        hospital.treatNextpatient();
        hospital.treatNextpatient();

    }
}
