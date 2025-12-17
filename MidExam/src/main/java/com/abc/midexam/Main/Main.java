package com.abc.midexam.Main;

import com.abc.midexam.Emp;
import com.abc.midexam.EmpService.EmpService;
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
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    Emp emp = new Emp(name, designation, salary);
                    empService.addEmployee(emp);
                    break;

                case 2:
                    List<Emp> emps = empService.getAllEmp();
                    for (Emp e : emps) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String updateName = scanner.nextLine();

                    System.out.print("Enter New Designation: ");
                    String updateDesignation = scanner.nextLine();

                    System.out.print("Enter New Salary: ");
                    double updateSalary = scanner.nextDouble();
                    scanner.nextLine();

                    Emp updateEmployee = new Emp(updateId, updateName, updateDesignation, updateSalary);
                    empService.updateEmployee(updateEmployee);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    long deleteId = scanner.nextLong();
                    scanner.nextLine();
                    empService.deleteEmp(deleteId);
                    break;

                case 5:
                    System.out.print("Enter Employee ID to View: ");
                    long searchId = scanner.nextLong();
                    scanner.nextLine();
                    Emp searchEmp = empService.getById(searchId);

                    if (searchEmp != null) {
                        System.out.println("Employee found: " + searchEmp);
                    } else {
                        System.out.println("No employee found with ID: " + searchId);
                    }
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
