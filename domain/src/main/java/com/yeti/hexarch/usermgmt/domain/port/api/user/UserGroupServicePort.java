package com.yeti.hexarch.usermgmt.domain.port.api;

import com.yeti.hexarch.usermgmt.domain.model.user.UserGroupDomainModel;
import com.yeti.hexarch.usermgmt.domain.model.role.RoleTypeDomainModel;
import com.yeti.hexarch.usermgmt.domain.model.product.ProductDomainModel;

public interface UserGroupServicePort {

    /*
     * Creates a new user group
     * 
     * @param userGroupDomainModel a new user group
     * @return a newly created user group
     */
    UserGroupDomainModel createGroup(UserGroupDomainModel userGroupDomainModel);

    /*
     * Adds a new product to a user group
     * 
     * @param userGroupDomainModel a user group where new product needs to be added
     * @param product a new product
     */
    UserGroupDomainModel addNewProduct(UserGroupDomainModel userGroupDomainModel, ProductDomainModel product);

    /*
     * Adds a new role type to a user group
     * 
     * @param userGroupDomainModel a user group where new product needs to be added
     * @param roleTypeDomainModel product a new role type
     */
    UserGroupDomainModel addNewRole(UserGroupDomainModel userGroupDomainModel, RoleTypeDomainModel roleTypeDomainModel);

}