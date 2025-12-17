//
//package com.abc.jsp_crud.service;
//
//
//import com.abc.jsp_crud.entity.Emp;
//import com.abc.jsp_crud.repository.DatabaseConnection;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class EmpService {
//    // Create Employee
//    public void addEmployee(Emp emp) {
//        String sql = "INSERT INTO emp (name, age, dob, salary, address) VALUES (?, ?, ?, ?, ?)";
//
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            ps.setString(1, emp.getName());
//            ps.setInt(2, emp.getAge());
//            ps.setDate(3, Date.valueOf(emp.getDob())); 
//            ps.setBigDecimal(4, emp.getSalary());
//            ps.setString(5, emp.getAddress());
//
//            ps.executeUpdate();
//            System.out.println("Employee added successfully!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Read all Emp
//    public List<Emp> getAllEmp() {
//        List<Emp> emps = new ArrayList<>();
//        String sql = "SELECT * FROM emp";
//
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                Emp emp = new Emp(
//                        rs.getLong("id"),
//                        rs.getString("name"),
//                        rs.getInt("age"),
//                        rs.getDate("dob").toLocalDate(),
//                        rs.getBigDecimal("salary"),
//                        rs.getString("address")
//                );
//                emps.add(emp);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return emps;
//    }
//
//    // Get Employee by ID
//    public Emp getById(Long id) {
//        String sql = "SELECT * FROM emp WHERE id = ?";
//        Emp emp = null;
//
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            ps.setLong(1, id);
//
//            try (ResultSet rs = ps.executeQuery()) {
//                if (rs.next()) {
//                    emp = new Emp(
//                            rs.getLong("id"),
//                            rs.getString("name"),
//                            rs.getInt("age"),
//                            rs.getDate("dob").toLocalDate(),
//                            rs.getBigDecimal("salary"),
//                            rs.getString("address")
//                    );
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return emp;
//    }
//
//    // Update Employee
//    public void updateEmployee(Emp emp) {
//        String sql = "UPDATE emp SET name = ?, age = ?, dob = ?, salary = ?, address = ? WHERE id = ?";
//
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            ps.setString(1, emp.getName());
//            ps.setInt(2, emp.getAge());
//            ps.setDate(3, Date.valueOf(emp.getDob()));
//            ps.setBigDecimal(4, emp.getSalary());
//            ps.setString(5, emp.getAddress());
//            ps.setLong(6, emp.getId());
//
//            ps.executeUpdate();
//            System.out.println(" Employee updated successfully!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Delete Emp
//    public void deleteEmp(Long id) {
//        String sql = "DELETE FROM emp WHERE id = ?";
//
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            ps.setLong(1, id);
//            ps.executeUpdate();
//            System.out.println("Employee deleted successfully!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
