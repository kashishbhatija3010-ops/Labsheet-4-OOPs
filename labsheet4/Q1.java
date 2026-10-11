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