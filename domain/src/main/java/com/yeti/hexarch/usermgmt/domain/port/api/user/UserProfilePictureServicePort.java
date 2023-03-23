package com.yeti.hexarch.usermgmt.domain.port.api;

import com.yeti.hexarch.usermgmt.domain.model.user.UserDomainModel; 

public interface UserProfilePictureServicePort {

    /*
     * Upload a user profile picture
     * 
     * @param byte[] a byte slice of a profile picture
     * @return a url of a profile picture
     */
    String uploadPicture(byte[] picture);

    /*
     * Gets a user profile picture
     * 
     * @param userDomainModel a user of which profile picture needs to be retrieved
     * @return a byte slice of profile picture
     */
    byte[] getProfilePicture(UserDomainModel userDomainModel);

}