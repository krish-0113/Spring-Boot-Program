package com.student_management_system.Student_Management_System.services.imp;

import com.student_management_system.Student_Management_System.entity.Student;
import com.student_management_system.Student_Management_System.repository.StudentRepository;
import com.student_management_system.Student_Management_System.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImple implements StudentService {
    private final StudentRepository studentRepository;

    // ✅ Constructor Injection
    public StudentServiceImple(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(int id, Student student) {
        // ✅ Step 1: Pehle existing student find karenge
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        // ✅ Step 2: Naye values update karenge
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        // ✅ Step 3: Updated student ko save karenge
        return studentRepository.save(existingStudent);
    }
}

}
