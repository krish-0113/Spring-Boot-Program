package com.student_management_system.Student_Management_System.services;

import com.student_management_system.Student_Management_System.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(int id ,Student student);
}
