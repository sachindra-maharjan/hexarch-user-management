package com.yeti.hexarch.usermgmt.domain.user;

import lombok.Data;

@Data
public class AddressDomainModel {

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

}