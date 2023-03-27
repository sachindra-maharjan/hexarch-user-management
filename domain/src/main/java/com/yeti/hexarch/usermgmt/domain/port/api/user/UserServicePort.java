package com.yeti.hexarch.usermgmt.domain.port.api.user;

import java.util.Optional;

import com.yeti.hexarch.usermgmt.domain.model.user.UserDomainModel; 

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
     * @param groupName
     */
    void addUserGroup(UserDomainModel userDomainModel, String groupName);

    /*
     * Finds a user by userId
     * 
     * @param userId
     * @return optional value of user
     */
    Optional<UserDomainModel> findUserById(String userId);

    /*
     * Deletes a user
     * 
     * @param userDomainModel a user to be deleted
     */
    void deleteUser(UserDomainModel userDomainModel);

}