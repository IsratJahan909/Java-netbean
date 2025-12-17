//
//package com.abc.crud2.Service;
//
//import com.abc.crud2.Employee.Employee;
//import com.abc.crud2.connection.DataBaseConnection2;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class EmployeeService {
//    //Create student
//    public void addStudent(Employee employee) {
//        String sql = "Insert into student " + " (name, email, age, dob ) values (?,?,?,?)";
//        try (Connection conn = DataBaseConnection2.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
//
//            ps.setString(1, employee.getName());
//            ps.setString(2, employee.getEmail());
//            ps.setInt(3, employee.getAge());
//            ps.setDate(4, Date.valueOf(employee.getDob()));
//            ps.executeUpdate();
//            System.out.println("Student added successfully");
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//
//        }
//
//    }
//
//    //read all students
//    public List<Employee> getAllEmployee() {
//        List<Employee> employee = new ArrayList<>();
//        String sql = "Select * from student";
//
//        try (Connection conn = DataBaseConnection2.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                Employee employee = new Employee(
//                        rs.getInt("Id"),
//                        rs.getString("name"),
//                        rs.getString("email"),
//                        rs.getInt("age"),
//                        rs.getDate("dob").toLocalDate()
//                );
//
//                employee.add(employee);
//
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }
//        return employee;
//
//    }
//
//    public Employee getById(int id) {
//        String sql = "select * from employee Where id = ?";
//        Employee employee = null;
//
//        try (
//                Connection conn = DataBaseConnection2.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
//            ps.setInt(1, id);
//
//            try (ResultSet rs = ps.executeQuery()) {
//                if (rs.next()) {
//                    employee = new Employee(
//                            rs.getInt("id"),
//                            rs.getString("name"),
//                            rs.getString("email"),
//                            rs.getInt("age"),
//                            rs.getDate("dob").toLocalDate()
//                    );
//
//                }
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }
//        return employee;
//    }
//
//    //update student
//    public void updateStudent(Employee employee) {
//        String sql = "update employee set name = ?, " + " age = ?, dob = ? where id = ?";
//
//        try {
//            Connection conn = DataBaseConnection2.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//
//            ps.setString(1, Employee.getName());
//            ps.setString(2, Employee.getEmail());
//            ps.setInt(3, Employee.getAge());
//            ps.setDate(4, Date.valueOf(Employee.getDob()));
//            ps.setInt(5, Employee.getId());
//
//            ps.executeUpdate();
//            System.out.println("employee updated successfully!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    //delete student
//    public void deleteEmployee(List<Integer>idList){
//    if (idList == null|| idList.isEmpty()){
//        System.out.println("NO ids proviede to delete");
//        return;
//    }
//        
//        String ids = "";
//    for (int i = 0; 1 <idList.size(); i++){
//    ids += idList.get(i);
//    if (i != idList.size() -1) {
//    ids += ",";
//    
//    }
//    }
//    
//    String sql = "Delete from employee where id in (" + ids + ")";
//    try{
//    Connection conn = DataBaseConnection2.getConnection();
//    PreparedStatement ps = conn.prepareStatement(sql);
//    int rowsDeleted = ps.executeUpdate();
//        System.out.println(rowsDeleted + " employee(s) deleted successful");
//    }catch (SQLException e) {
//    e.printStackTrace();
//    }
//    
//    }
//    
//    
//    
////    public void deleteStudent(int id) {
////        String sql = "Delete from student where id = ?";
////        try {
////            Connection conn = DataBaseConnection.getConnection();
////            PreparedStatement ps = conn.prepareStatement(sql);
////
////            ps.setInt(1, id);
////            int val = ps.executeUpdate();
////            if (val < 1) {
////                System.out.println("Data not found for Id: - " + id);
////            } else {
////                System.out.println("Student deleted successfully!");
////            }
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
//}
