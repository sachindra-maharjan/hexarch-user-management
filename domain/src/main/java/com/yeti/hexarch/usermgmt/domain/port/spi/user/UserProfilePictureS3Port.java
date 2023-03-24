package com.yeti.hexarch.usermgmt.domain.port.spi.user;

import com.yeti.hexarch.usermgmt.domain.model.user.UserDomainModel;

public interface UserProfilePictureS3Port {
    
    String upload(byte[] image);

    byte[] download(UserDomainModel userDomainModel);

}
