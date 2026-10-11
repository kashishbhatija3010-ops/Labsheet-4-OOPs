package labsheet4;
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Doctor extends Employee {
    void treatPatient() {
        System.out.println("Doctor is treating the patient.");
    }
}

class Pharmacist extends Employee {
    void dispenseMedicine() {
        System.out.println("Pharmacist is dispensing medicine.");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Pharmacist p = new Pharmacist();

        d.work();
        d.treatPatient();

        p.work();
        p.dispenseMedicine();
    }
}
