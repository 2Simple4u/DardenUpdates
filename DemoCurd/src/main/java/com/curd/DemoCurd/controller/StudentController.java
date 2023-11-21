package com.curd.DemoCurd.controller;

import com.curd.DemoCurd.dto.StudentRequest;
import com.curd.DemoCurd.dto.StudentResponse;
import com.curd.DemoCurd.entity.Student;
import com.curd.DemoCurd.service.StudentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")

public class StudentController {

    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public ResponseEntity<StudentResponse> registerNewStudent(@RequestBody StudentRequest studentRequest){
        return this.studentService.addStudent(studentRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable long id){
        return this.studentService.getStudentById(id);

    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAllStudents(){
      return   this.studentService.getAllStudents();

    }
    @DeleteMapping()
    public ResponseEntity<HttpStatus> deleteAllStudent(){
        return  this.studentService.deleteAllStudent();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteStudentById(@PathVariable long id){
        return  this.studentService.deleteStudentById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudentById(@RequestBody Student student, @PathVariable long id){
        return this.studentService.updateStudentById(student,id);
    }

}
