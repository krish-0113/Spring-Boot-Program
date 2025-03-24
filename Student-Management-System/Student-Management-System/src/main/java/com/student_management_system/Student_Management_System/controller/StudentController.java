package com.student_management_system.Student_Management_System.controller;

import com.student_management_system.Student_Management_System.entity.Student;
import com.student_management_system.Student_Management_System.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private final StudentService studentService;

    // ✅ Constructor Injection (Recommended)
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // ✅ Handle GET request to list students and return a view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";  // Returns students.html (Thymeleaf template)
    }

    // ✅ Handle GET request to display the student form
    @GetMapping("/students/new")
    public String createStudent(Model model) {
        // Create a new student object for the form
        Student student = new Student();
        model.addAttribute("student", student);
        return "student_form";  // Returns student_form.html
    }

    // ✅ Handle POST request to save student data
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";  // Redirects to students list after saving
    }

    //update student info
    // ✅ Handle update request (PUT)
    @PutMapping("students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

}
