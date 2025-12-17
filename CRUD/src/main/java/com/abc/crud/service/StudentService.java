package com.abc.crud.service;

import com.abc.crud.entity.Student;
import com.abc.crud.repoitory.DataBaseConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    //Create student
    public void addStudent(Student student) {
        String sql = "Insert into student " + " (name, email, age, dob ) values (?,?,?,?)";
        try (Connection conn = DataBaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setInt(3, student.getAge());
            ps.setDate(4, Date.valueOf(student.getDob()));
            ps.executeUpdate();
            System.out.println("Student added successfully");

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    //read all students
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "Select * from student";

        try (Connection conn = DataBaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("Id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getDate("dob").toLocalDate()
                );

                students.add(student);

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return students;

    }

    public Student getById(int id) {
        String sql = "select * from student Where id = ?";
        Student student = null;

        try (
                Connection conn = DataBaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    student = new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getInt("age"),
                            rs.getDate("dob").toLocalDate()
                    );

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return student;
    }

    //update student
    public void updateStudent(Student student) {
        String sql = "update student set name = ?, " + " age = ?, dob = ? where id = ?";

        try {
            Connection conn = DataBaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setInt(3, student.getAge());
            ps.setDate(4, Date.valueOf(student.getDob()));
            ps.setInt(5, student.getId());

            ps.executeUpdate();
            System.out.println("Student updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //delete student
    public void deleteStudents(List<Integer>idList){
    if (idList == null|| idList.isEmpty()){
        System.out.println("NO ids proviede to delete");
        return;
    }
        
        String ids = "";
    for (int i = 0; 1 <idList.size(); i++){
    ids += idList.get(i);
    if (i != idList.size() -1) {
    ids += ",";
    
    }
    }
    
    String sql = "Delete from student where id in (" + ids + ")";
    try{
    Connection conn = DataBaseConnection.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql);
    int rowsDeleted = ps.executeUpdate();
        System.out.println(rowsDeleted + " student(s) deleted successful");
    }catch (SQLException e) {
    e.printStackTrace();
    }
    
    }
    
    
    
//    public void deleteStudent(int id) {
//        String sql = "Delete from student where id = ?";
//        try {
//            Connection conn = DataBaseConnection.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//
//            ps.setInt(1, id);
//            int val = ps.executeUpdate();
//            if (val < 1) {
//                System.out.println("Data not found for Id: - " + id);
//            } else {
//                System.out.println("Student deleted successfully!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
