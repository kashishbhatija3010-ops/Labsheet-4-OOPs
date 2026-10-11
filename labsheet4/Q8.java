package labsheet4;
class PatientBill {
    private double consultationFee;
    private double medicineFee;

    void setConsultationFee(double fee) {
        consultationFee = fee;
    }

    void setMedicineFee(double fee) {
        medicineFee = fee;
    }

    double calculateTotal() {
        return consultationFee + medicineFee;
    }

    void displayBill() {
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Fee: " + medicineFee);
        System.out.println("Total Bill: " + calculateTotal());
    }
}

public class Q8 {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();

        bill.setConsultationFee(500);
        bill.setMedicineFee(1200);

        bill.displayBill();
    }
}
