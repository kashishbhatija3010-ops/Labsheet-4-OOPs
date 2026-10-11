package labsheet4;
class HospitalSystem {
    void runSystem() {
        Doctor doctor = new Doctor();
        Pharmacist pharmacist = new Pharmacist();

        System.out.println("Hospital Staff System");
        doctor.work();
        doctor.treatPatient();
        pharmacist.work();
        pharmacist.dispenseMedicine();
    }
}

class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Doctor extends Employee {
    void treatPatient() {
        System.out.println("Doctor is treating patients.");
    }
}

class Pharmacist extends Employee {
    void dispenseMedicine() {
        System.out.println("Pharmacist is dispensing medicine.");
    }
}

public class Q15 {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.runSystem();
    }
}
