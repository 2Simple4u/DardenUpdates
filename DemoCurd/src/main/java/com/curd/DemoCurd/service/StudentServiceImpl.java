package com.curd.DemoCurd.service;

import com.curd.DemoCurd.dto.StudentRequest;
import com.curd.DemoCurd.dto.StudentResponse;
import com.curd.DemoCurd.entity.Student;
import com.curd.DemoCurd.exception.StudentNotFoundException;
import com.curd.DemoCurd.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements studentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public ResponseEntity<StudentResponse> addStudent(StudentRequest request) {
       var studentData =  studentRepository.findById(request.getId());
       if (studentData.isPresent()){
           throw new StudentNotFoundException("Student already present");
       }else {
           var StudentData = Student.builder()
                   .contactNo(request.getContactNo())
                   .fatherName(request.getFatherName())
                   .name(request.getName())
                   .build();
           this.studentRepository.save(StudentData);
           StudentResponse.builder().build();
           return new ResponseEntity("Student is added", HttpStatus.CREATED);
       }
    }

    @Override
    public ResponseEntity<StudentResponse> getStudentById(long id) {
        Optional<Student> student =studentRepository.findById(id);
        if (student.isEmpty()){
            throw  new StudentNotFoundException("Student Not Found");
        }else {
            var studentData = StudentResponse.builder()
                    .id(student.get().getId())
                    .contactNo(student.get().getContactNo())
                    .fatherName(student.get().getFatherName())
                    .name(student.get().getName())
                    .build();
            return new ResponseEntity(studentData, HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<List<StudentResponse>> getAllStudents() {
        List<Student> studentResponse = studentRepository.findAll();
        if (studentResponse!=null){
            return new ResponseEntity(studentResponse,HttpStatus.OK);
        }else
            return new ResponseEntity("Student Not Found",HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteStudentById(long id) {
        try {
            this.studentRepository.deleteById(id);
            return new  ResponseEntity("Student is deleted",HttpStatus.OK);
        }catch (StudentNotFoundException studentNotFoundException){
            return new  ResponseEntity("Student not Found",HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<HttpStatus> deleteAllStudent() {
        try {
            this.studentRepository.deleteAll();
            return  new ResponseEntity("All Delete student",HttpStatus.OK);
        }catch (Exception ex) {
            return new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Student> updateStudentById(Student request, long id) {
        var UpdateStudent = studentRepository.findById(id).orElseThrow(
                ()-> new StudentNotFoundException("Student not found")
        );
        if(!UpdateStudent.equals(null)) {
            UpdateStudent.setContactNo(request.getContactNo());
            UpdateStudent.setFatherName(request.getFatherName());
            UpdateStudent.setName(request.getName());
            studentRepository.save(UpdateStudent);
            return new ResponseEntity<>(UpdateStudent, HttpStatus.OK);
        }
        return new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND);
    }
}
