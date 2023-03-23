package com.yeti.hexarch.usermgmt.domain.user;

import java.util.Date;
import lombok.Data;

@Data
public class UserDomainModel {

    private Integer id;
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    private String phone;
    private AddressDomainModel address;

}