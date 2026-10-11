package labsheet4;
class MedicineProduct {
    private String name;
    private double price;

    MedicineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
    }
}

public class Q6 {
    public static void main(String[] args) {
        MedicineProduct m = new MedicineProduct("Cough Syrup", 120);
        m.display();
    }
}
