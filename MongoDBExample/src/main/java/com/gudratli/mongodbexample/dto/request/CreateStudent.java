package com.gudratli.mongodbexample.dto.request;

import com.gudratli.mongodbexample.enums.EGender;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CreateStudent
{
    private String firstName;
    private String lastName;
    private String email;
    private EGender gender;
    private CreateAddress address;
    private List<String> subjects;
    private BigDecimal totalSpendInBooks;
}
