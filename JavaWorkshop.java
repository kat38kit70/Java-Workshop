// Covers: Data Types, Variables, Classes, Methods, OOP, Inheritance, Loops, Conditions, Arrays

// Parent class
class Person {
    String name;
    int age;

    // Constructor with this keyword
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Employee extends Person {
    int salary; //45000
    String role; //"Devloper"
    static String company = "TechSpark";

    // Constructor + super()
    Employee(String name, int age, int salary, String role) {
        super(name, age); // calling parent constructor
        this.salary = salary;
        this.role = role;
    }

    void showEmployeeInfo() {
        System.out.println("\n--- Employee Info ---");
        showBasicInfo(); // call method from parent
        System.out.println("Role: " + role);
        System.out.println("Company: " + company);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Bonus: ₹" + getBonus());
    }

    // if-else condition
    int getBonus() {
        if (salary > 40000)
            return 5000;
        else
            return 3000;
    }

    // switch-case example
    void showLevel(int level) {
        System.out.print("Level: ");
        switch (level) {
            case 1: System.out.println("Beginner"); break;
            case 2: System.out.println("Intermediate"); break;
            case 3: System.out.println("Advanced"); break;
            default: System.out.println("Unknown");
        }
    }

    // for loop
    void printExperience(int years) {
        System.out.println("Experience:");
        for (int i = 1; i <= years; i++) {
            System.out.println(i + " year(s)");
        }
    }

    // array + for-each loop
    void showLanguages() {
        String[] langs = {"Java", "C", "Python"};
        System.out.println("Known Languages:");
        for (String lang : langs) {
            System.out.println("- " + lang);
        }
    }
}

// Main class (only calls methods)
public class JavaWorkshop {
    public static void main(String[] args) {
        // Create employee object
        Employee emp = new Employee("Shreyash", 22, 45000, "Developer");

        // Call all methods (no logic here)
        emp.showEmployeeInfo();
        emp.showLevel(2);
        emp.printExperience(3);
        emp.showLanguages();
    }
}