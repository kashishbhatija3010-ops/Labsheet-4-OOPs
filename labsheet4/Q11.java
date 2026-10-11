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
