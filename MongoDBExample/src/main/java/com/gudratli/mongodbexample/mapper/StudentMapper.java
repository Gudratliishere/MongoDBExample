package com.gudratli.mongodbexample.mapper;

import com.gudratli.mongodbexample.dto.request.CreateAddress;
import com.gudratli.mongodbexample.dto.request.CreateStudent;
import com.gudratli.mongodbexample.dto.response.AddressResponse;
import com.gudratli.mongodbexample.dto.response.StudentResponse;
import com.gudratli.mongodbexample.entity.Address;
import com.gudratli.mongodbexample.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper
{
    public Student map (CreateStudent source)
    {
        Student target = new Student();
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
        target.setEmail(source.getEmail());
        target.setGender(source.getGender());
        target.setSubjects(source.getSubjects());
        target.setTotalSpendInBooks(source.getTotalSpendInBooks());
        target.setAddress(map(source.getAddress()));

        return target;
    }

    public List<StudentResponse> map (List<Student> source)
    {
        List<StudentResponse> target = new ArrayList<>();
        source.forEach(student -> target.add(map(student)));

        return target;
    }

    public StudentResponse map (Student source)
    {
        StudentResponse target = new StudentResponse();
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
        target.setEmail(source.getEmail());
        target.setGender(source.getGender());
        target.setSubjects(source.getSubjects());
        target.setTotalSpendInBooks(source.getTotalSpendInBooks());
        target.setAddressResponse(map(source.getAddress()));

        return target;
    }

    private Address map (CreateAddress source)
    {
        Address target = new Address();
        target.setCity(source.getCity());
        target.setCountry(source.getCountry());
        target.setPostCode(source.getPostCode());

        return target;
    }

    private AddressResponse map (Address source)
    {
        AddressResponse target = new AddressResponse();
        target.setCity(source.getCity());
        target.setCountry(source.getCountry());
        target.setPostCode(source.getPostCode());

        return target;
    }
}
