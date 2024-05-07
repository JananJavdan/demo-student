package com.example.demo.student.repository;

import com.example.demo.student.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
    //Om sql te definieren die moet worden uitgevoerd voor een S
    @Query("SELECT s FROM StudentModel s WHERE s.email=?1")
    Optional<StudentModel> findStudentModelByEmail(String email);
}
