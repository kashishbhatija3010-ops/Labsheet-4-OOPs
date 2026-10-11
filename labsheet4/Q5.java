package labsheet4;
 class Patient {
    int age;

    Patient(int age) {
        this.age = age;
    }

    void classify() {
        if (age >= 18)
            System.out.println("Patient is eligible for adult treatment.");
        else
            System.out.println("Patient is eligible for pediatric treatment.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Patient p = new Patient(20);
        p.classify();
    }
}
