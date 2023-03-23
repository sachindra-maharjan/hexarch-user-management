package com.yeti.hexarch.usermgmt.domain.model.user;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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

    public UserDomainModel(String userId) {
        this.userId = userId;
    }

}
