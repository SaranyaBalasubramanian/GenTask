package StudentmanagementSystem.sms.repository;

import StudentmanagementSystem.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {


}
