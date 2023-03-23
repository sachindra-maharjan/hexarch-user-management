package com.yeti.hexarch.usermgmt.port.api;

import java.util.Optional;

import com.yeti.hexarch.usermgmt.domain.user.UserDomainModel; 
import com.yeti.hexarch.usermgmt.domain.role.RoleType;

public interface UserServicePort {

    /*
     * Creates a new user
     * 
     * @param userDomainModel
     * @return a newly created user 
     */
    UserDomainModel createUser(UserDomainModel userDomainModel);

    /*
     * Addes a new user Role
     * 
     * @param userDomainModel
     * @param roleType
     */
    void addUserRole(UserDomainModel userDomainModel, RoleType roleType);

    /*
     * Finds a user by userId
     * 
     * @param userId
     * @return optional value of user
     */
    Optional<UserDomainModel> findUserById(String userId);

}