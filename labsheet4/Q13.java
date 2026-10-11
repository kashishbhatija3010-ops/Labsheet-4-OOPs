package labsheet4;
class Person {
    void showPerson() {
        System.out.println("This is a Person.");
    }
}
class Employee extends Person {
    void showEmployee() {
        System.out.println("This is an Employee.");
    }
}
class Doctor extends Employee {
    void showDoctor() {
        System.out.println("This is a Doctor.");
    }
}
interface Administrator {
    void showAdministrator();
}
class HospitalManager extends Employee implements Administrator {
    public void showAdministrator() {
        System.out.println("This is a Hospital Administrator.");
    }
}
public class Q13 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.showPerson();
        doctor.showEmployee();
        doctor.showDoctor();
        HospitalManager manager = new HospitalManager();
        manager.showPerson();
        manager.showEmployee();
        manager.showAdministrator();
    }
}
