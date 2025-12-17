package com.abc.crud.service;

import java.time.LocalDate;
import com.abc.crud.entity.Student;
import java.util.ArrayList;
import java.util.List;

//public class Main {
//
//    public static void main(String[] args) {
//        StudentService studentDAO = new StudentService();
//
//        Student studentupdate = new Student(1, "Ahmed", "ahmed@gmail.com", 50, LocalDate.of(2020, 5, 10));
//
//        studentDAO.updateStudent(studentupdate);
//
//        List<Student> students = studentDAO.getAllStudents();
//        for (Student s : students) {
//            System.out.println(s);
//        }
        //        public static void main ()String[] args {
        //        Scanner scanner = new Scanner(System.in);
        //        StudentService studentDAO = new StudentService();
        //        
        //        
        //        while(true){
        //            System.out.println("Student Management System");
        //            System.out.println("1. Add Student.");
        //            System.out.println("2.View All Student");
        //            System.out.println("3. Update Student");
        //            System.out.println("4. ");
        //            
        //            int choice = scanner.nextInt();
        //            scanner.nextLine();
        //            
        //            switch (choice){
        //                case 1:
        //                    System.out.println("Enter your name: ");
        //                    String name = scanner 
        //            }
        //        }
        //        }
public class Main {

    public static void main(String[] args) {
        StudentService studentDAO = new StudentService();

        List<Integer> iids = new ArrayList<>();
        iids.add(7);
        iids.add(8);
        iids.add(9);
        iids.add(10);
        studentDAO.deleteStudents(iids);

    }

}

