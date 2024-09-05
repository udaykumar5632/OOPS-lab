import java.util.Scanner;

class Emp {
    int Emp_Id;
    String Emp_name;
    int Emp_age;
    String Emp_gender;
    String Emp_designation;
    long Emp_salary;
    String Emp_address;

    public void display() {
        System.out.println("Employee_Id: " + Emp_Id);
        System.out.println("Employee_Name: " + Emp_name);
        System.out.println("Employee_Age: " + Emp_age);
        System.out.println("Employee_Gender: " + Emp_gender);
        System.out.println("Employee_Designation: " + Emp_designation);
        System.out.println("Employee_Salary: " + Emp_salary);
        System.out.println("Employee_Address: " + Emp_address);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // number of employees
        System.out.println("Enter the number of employees:");
        n = sc.nextInt();

        Emp[] emp = new Emp[n];
        for (int i = 0; i < n; i++) {
            emp[i] = new Emp();
            System.out.print("Enter Employee_Id: ");
            emp[i].Emp_Id = sc.nextInt();
            sc.nextLine(); // consume the leftover newline
            System.out.print("Enter Employee_Name: ");
            emp[i].Emp_name = sc.nextLine();
            System.out.print("Enter Employee_Age: ");
            emp[i].Emp_age = sc.nextInt();
            System.out.print("Enter Employee_Gender: ");
            emp[i].Emp_gender = sc.next();
            System.out.print("Enter Employee_Designation: ");
            emp[i].Emp_designation = sc.next();
            System.out.print("Enter Employee_Salary: ");
            emp[i].Emp_salary = sc.nextLong();
            sc.nextLine(); // consume the leftover newline
            System.out.print("Enter Employee_Address: ");
            emp[i].Emp_address = sc.nextLine();
        }

        System.out.print("Enter Employee ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (emp[i].Emp_Id == searchId) {
                emp[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
        sc.close();
    }
}
