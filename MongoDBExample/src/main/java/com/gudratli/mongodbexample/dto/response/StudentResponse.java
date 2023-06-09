package com.gudratli.mongodbexample.dto.response;

import com.gudratli.mongodbexample.enums.EGender;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class StudentResponse
{
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private EGender gender;
    private AddressResponse addressResponse;
    private List<String> subjects;
    private BigDecimal totalSpendInBooks;
    private LocalDateTime createdAt;
}
