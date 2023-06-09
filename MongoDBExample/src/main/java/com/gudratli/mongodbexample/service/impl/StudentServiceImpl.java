package com.gudratli.mongodbexample.service.impl;

import com.gudratli.mongodbexample.entity.Student;
import com.gudratli.mongodbexample.repository.StudentRepository;
import com.gudratli.mongodbexample.service.StudentService;
import com.mongodb.MongoWriteException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService
{
    private final StudentRepository studentRepository;

    @Override
    public Student add (Student student) throws Exception
    {
        try
        {
            return studentRepository.insert(student);
        } catch (MongoWriteException ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public List<Student> getAll ()
    {
        return studentRepository.findAll();
    }
}
