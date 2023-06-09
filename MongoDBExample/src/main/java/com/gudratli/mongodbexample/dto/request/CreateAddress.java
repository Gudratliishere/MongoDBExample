package com.gudratli.mongodbexample.dto.request;

import lombok.Data;

@Data
public class CreateAddress
{
    private String country;
    private String city;
    private String postCode;
}
