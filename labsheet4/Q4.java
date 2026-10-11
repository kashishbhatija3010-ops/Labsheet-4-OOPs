package labsheet4;
class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(name + " - Quantity: " + quantity);
    }
}

class Inventory {
    MedicineStock[] stock = {
        new MedicineStock("Paracetamol", 50),
        new MedicineStock("Amoxicillin", 30),
        new MedicineStock("Vitamin C", 40)
    };

    void displayInventory() {
        for (MedicineStock m : stock)
            m.display();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }
}
