package com.capg.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.demo.model.Student;
public interface StudentJpaRepo extends JpaRepository<Student, Integer>{

}