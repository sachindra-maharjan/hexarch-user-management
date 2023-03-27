package com.yeti.hexarch.usermgmt.domain.model.user;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDomainModel {

    private String userId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    private String phone;
    private AddressDomainModel address;
    private UserGroupDomainModel userGroup;
    private byte[] profilePicture;

}
