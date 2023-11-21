package com.curd.DemoCurd.service;

import com.curd.DemoCurd.dto.StudentRequest;
import com.curd.DemoCurd.dto.StudentResponse;
import com.curd.DemoCurd.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface studentService {

    public ResponseEntity<StudentResponse> addStudent(StudentRequest request);
    public ResponseEntity<StudentResponse> getStudentById(long id);
    public ResponseEntity<List<StudentResponse>> getAllStudents();
    public ResponseEntity<HttpStatus>deleteStudentById(long id);
    public ResponseEntity<HttpStatus> deleteAllStudent();
    public ResponseEntity<Student> updateStudentById(Student request, long id);
}
