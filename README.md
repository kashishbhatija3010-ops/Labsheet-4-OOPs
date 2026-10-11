# Labsheet-4-OOPs
Java OOPs Labsheet 4
# 1
package labsheet4;
class Student {
    String name;
    int rollNumber;
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Student s = new Student("Kashish", 101);
        s.display();
    }
}
# 2
package labsheet4;
class Medicine {
    String name;
    double price;
    Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Medicine m = new Medicine("Paracetamol", 50);
        m.display();
    }
}
# 3
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
# 4
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
# 5
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
# 6 
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
# 7
package labsheet4;
class BankAccount {
    private double balance;
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class Q7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.displayBalance();
    }
}
# 8
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
# 9
package labsheet4;
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}
class Pharmacist extends Employee {
    void dispenseMedicine() {
        System.out.println("Pharmacist is dispensing medicine.");
    }
}
public class Q9 {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist();
        p.work();
        p.dispenseMedicine();
    }
}
# 10
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
# 11 
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
class Manager extends Employee {
    void showManager() {
        System.out.println("This is a Manager.");
    }
}
public class Q11 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.showPerson();
        manager.showEmployee();
        manager.showManager();
    }
}
# 12
package labsheet4;
class A {
    void showA() {
        System.out.println("Class A");
    }
}
class B {
    void showB() {
        System.out.println("Class B");
    }
}
public class Q12 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.showA();
        b.showB();
        System.out.println("Java does not support multiple inheritance through classes.");
    }
}
# 13
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
# 14
package labsheet4;
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}
class Rectangle extends Shape {
    double length = 10;
    double width = 5;
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}
class Circle extends Shape {
    double radius = 7;
    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}
public class Q14 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        r.area();
        c.area();
    }
}
# 15
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
