package com.curd.DemoCurd.repository;

import com.curd.DemoCurd.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
