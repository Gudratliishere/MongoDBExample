package com.gudratli.mongodbexample.dto.response;

import lombok.Data;

@Data
public class AddressResponse
{
    private String country;
    private String city;
    private String postCode;
}
