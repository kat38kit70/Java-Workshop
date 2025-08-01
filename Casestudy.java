package Banking;
import java.util.*;

class Account {
    Scanner sc = new Scanner(System.in);
    String name;
    long acc_no;
    int age; 
    String gender;
    String nationality;
    String address;
    long balance ;

    void createAccount() {
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the account number: ");
        acc_no = sc.nextLong();
        sc.nextLine();

        // Age validation loop
        do {
            System.out.println("Enter your age: ");
            age = sc.nextInt();
            if (age < 18) {
                System.out.println(" Sorry, you must be 18 or older to create an account. Please try again.");
            }
        } while (age < 18);
        sc.nextLine();

        System.out.println("Enter the gender: ");
        gender = sc.nextLine();
        System.out.println("Enter your nationality: ");
        nationality = sc.nextLine();
        System.out.println("Enter your address: ");
        address = sc.nextLine();
        System.out.println(" Account Created Successfully!");
    }

    void display() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Age: " + age);
        System.out.println("Current Balance: " + balance);
        System.out.println("Gender: " + gender);
        System.out.println("Nationality: " + nationality);
        System.out.println("Address: " + address);
        System.out.println("-------------------------\n");
    }
}

class Savings extends Account {

    void deposit() {
        System.out.println("Enter the amount you want to deposit: ");
        long amount = sc.nextLong();
        if (amount <= 0) {
            System.out.println(" Invalid amount. Deposit must be positive.");
        } else {
            balance += amount;
            System.out.println("₹" + amount + " has been credited to your account.");
            System.out.println("New balance is: ₹" + balance);
        }
    }

    void withdraw() {
        System.out.println("Enter the amount you want to withdraw: ");
        long amount = sc.nextLong();
        if (amount > balance) {
            System.out.println(" Insufficient Balance. Cannot withdraw.");
        } else if (amount <= 0) {
            System.out.println(" Invalid amount. Withdrawal must be positive.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " has been withdrawn.");
            System.out.println("Remaining balance is: ₹" + balance);
        }
    }
}

public class Casestudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Savings S = new Savings();

        while (true) {
            System.out.println("\nEnter the operation you wanna perform: ");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Information");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    S.createAccount();
                    break;
                case 2:
                    S.display();
                    break;
                case 3:
                    S.deposit();
                    break;
                case 4:
                
                    S.withdraw();
                    break;
                case 5:
                    System.out.println(" Thank you for banking with us!");
                    S.sc.close();
                    return;
                default:
                    System.out.println(" Invalid Operation");
                    break;
            }
        }
    }
}