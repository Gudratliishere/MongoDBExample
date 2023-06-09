package com.gudratli.mongodbexample.controller;

import com.gudratli.mongodbexample.dto.request.CreateStudent;
import com.gudratli.mongodbexample.dto.response.StudentResponse;
import com.gudratli.mongodbexample.entity.Student;
import com.gudratli.mongodbexample.mapper.StudentMapper;
import com.gudratli.mongodbexample.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController
{
    private final StudentService studentService;
    private final StudentMapper studentMapper;

    @PostMapping
    public ResponseEntity<?> add (@RequestBody CreateStudent createStudent)
    {
        Student student = studentMapper.map(createStudent);

        try
        {
            student = studentService.add(student);
        } catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User is already exist with this email.");
        }

        StudentResponse response = studentMapper.map(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAll ()
    {
        List<Student> students = studentService.getAll();
        List<StudentResponse> studentResponses = studentMapper.map(students);

        return ResponseEntity.ok(studentResponses);
    }
}
