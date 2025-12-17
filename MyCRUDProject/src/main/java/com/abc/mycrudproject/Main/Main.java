
package com.abc.mycrudproject.Main;

import com.abc.mycrudproject.Emp.Emp;
import com.abc.mycrudproject.EmpService.EmpService;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpService empService = new EmpService();

        while (true) {
            System.out.println(" Employee Management System ");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Get Employee by ID");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Enter DOB (YYYY-MM-DD): ");
                    String inputdob = scanner.nextLine();
                    LocalDate dob = LocalDate.parse(inputdob);

                    System.out.print("Enter Salary: ");
                    BigDecimal salary = scanner.nextBigDecimal();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();

                    Emp emp = new Emp(name, age, dob, salary, address);
                    empService.addEmployee(emp);
                    break;

                case 2:
                    // View All Employees
                    List<Emp> emps = empService.getAllEmp();
                    for (Emp e : emps) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    // Update Employee
                    System.out.print("Enter Employee ID to Update: ");
                    Long updateId = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String updateName = scanner.nextLine();

                    System.out.print("Enter New Age: ");
                    int updateAge = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New DOB (YYYY-MM-DD): ");
                    LocalDate updateDob = LocalDate.parse(scanner.nextLine());

                    System.out.print("Enter New Salary: ");
                    BigDecimal updateSalary = scanner.nextBigDecimal();
                    scanner.nextLine();

                    System.out.print("Enter New Address: ");
                    String updateAddress = scanner.nextLine();

                    Emp updateEmployee = new Emp(updateId, updateName, updateAge, updateDob, updateSalary, updateAddress);
                    empService.updateEmployee(updateEmployee);
                    break;

                case 4:
                    // Delete Emp
                    System.out.print("Enter Employee ID to Delete: ");
                    Long deleteId = scanner.nextLong();
                    empService.deleteEmp(deleteId);
                    break;

                case 5:
                    // Get Emp by ID
                    System.out.print("Enter Employee ID to View: ");
                    Long searchId = scanner.nextLong();
                    Emp searchEmp = empService.getById(searchId);

                    if (searchEmp != null) {
                        System.out.println("Employee found: " + searchEmp);
                    } else {
                        System.out.println("No employee found with ID: " + searchId);
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println(" Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
