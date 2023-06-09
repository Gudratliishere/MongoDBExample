package com.gudratli.mongodbexample.service;

import com.gudratli.mongodbexample.entity.Student;

import java.util.List;

public interface StudentService
{
    Student add (Student student) throws Exception;

    List<Student> getAll ();
}
