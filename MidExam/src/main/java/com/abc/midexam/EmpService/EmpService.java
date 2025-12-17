package com.abc.midexam.EmpService;

import com.abc.midexam.DatabaseConnection.DatabaseConnection;
import com.abc.midexam.Emp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpService {

    public void addEmployee(Emp emp) {
        String sql = "INSERT INTO emp (name, designation, salary) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDesignation());
            ps.setDouble(3, emp.getSalary());

            ps.executeUpdate();
            System.out.println("Employee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Emp> getAllEmp() {
        List<Emp> emps = new ArrayList<>();
        String sql = "SELECT * FROM emp";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Emp emp = new Emp(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("designation"),
                    rs.getDouble("salary")
                );
                emps.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emps;
    }

    public Emp getById(Long id) {
        String sql = "SELECT * FROM emp WHERE id = ?";
        Emp emp = null;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    emp = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("designation"),
                        rs.getDouble("salary")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public void updateEmployee(Emp emp) {
        String sql = "UPDATE emp SET name = ?, designation = ?, salary = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDesignation());
            ps.setDouble(3, emp.getSalary());
            ps.setInt(4, emp.getId());

            ps.executeUpdate();
            System.out.println("Employee updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmp(Long id) {
        String sql = "DELETE FROM emp WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);
            ps.executeUpdate();
            System.out.println("Employee deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
