package labsheet4;
class Pharmacy {
    static String pharmacyName = "HealthCare Pharmacy";
    String location;

    Pharmacy(String location) {
        this.location = location;
    }

    void display() {
        System.out.println("Pharmacy: " + pharmacyName);
        System.out.println("Location: " + location);
    }
}

public class Q3{
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("Dehradun");
        Pharmacy p2 = new Pharmacy("Haridwar");

        p1.display();
        System.out.println();
        p2.display();
    }
}