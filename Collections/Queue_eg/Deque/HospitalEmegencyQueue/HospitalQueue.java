package Collections.Queue_eg.Deque.HospitalEmegencyQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class HospitalQueue {

    private Deque<PatientModel> patients = new ArrayDeque<>();

    public void registerNormalPatient(PatientModel patient) {
        patients.offerLast(patient);
        System.out.println("Normal Patient Added : " + patient);
    }

    public void registerEmergencypatient(PatientModel patient) {
        patients.offerFirst(patient);
        System.out.println("Emergency Patient Added at front : " + patient);
    }

    public void treatNextpatient() {

        if (patients == null) {
            System.out.println("No Patients Waiting!");
            return;
        }

        System.out.println("Treating : " + patients.peekFirst());
        patients.pollFirst();

    }

    public void showWaiting() {
        System.out.println("\nWaiting Patients : ");
        for (PatientModel patient : patients) {
            System.out.println(patient);
        }
    }

}
