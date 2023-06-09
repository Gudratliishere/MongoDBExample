package com.gudratli.mongodbexample.repository;

import com.gudratli.mongodbexample.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Long>
{
}
