package StudentmanagementSystem.sms.service.impl;

import StudentmanagementSystem.sms.entity.Student;
import StudentmanagementSystem.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentmanagementSystem.sms.service.StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
