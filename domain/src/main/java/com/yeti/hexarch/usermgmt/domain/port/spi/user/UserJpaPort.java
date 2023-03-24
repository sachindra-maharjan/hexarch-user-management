package com.yeti.hexarch.usermgmt.domain.port.spi.user;

import com.yeti.hexarch.usermgmt.domain.model.user.UserDomainModel;

public interface UserJpaPort {
    
    UserDomainModel findUserById(String userId);

    UserDomainModel createUser(UserDomainModel userDomainModel);

    UserDomainModel updateUser(UserDomainModel userDomainModel);

    void deleteUser(UserDomainModel userDomainModel);
}
