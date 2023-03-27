package com.yeti.hexarch.usermgmt.domain.port.api.usergroup;

import com.yeti.hexarch.usermgmt.domain.model.product.ProductDomainModel;
import com.yeti.hexarch.usermgmt.domain.model.role.RoleTypeDomainModel;
import com.yeti.hexarch.usermgmt.domain.model.user.UserGroupDomainModel;

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
    UserGroupDomainModel addProduct(UserGroupDomainModel userGroupDomainModel, ProductDomainModel product);

    /*
     * Removes a product to a user group
     * 
     * @param userGroupDomainModel a user group where new product needs to be added
     * @param product a new product
     */
    void removeProduct(UserGroupDomainModel userGroupDomainModel, ProductDomainModel product);

    /*
     * Adds a new role type to a user group
     * 
     * @param userGroupDomainModel a user group where new product needs to be added
     * @param roleTypeDomainModel product a new role type
     */
    UserGroupDomainModel addRole(UserGroupDomainModel userGroupDomainModel, RoleTypeDomainModel roleTypeDomainModel);

    /*
     * Removes role type from a user group
     * 
     * @param userGroupDomainModel a user group where new product needs to be added
     * @param roleTypeDomainModel product a new role type
     */
    UserGroupDomainModel removeRole(UserGroupDomainModel userGroupDomainModel, RoleTypeDomainModel roleTypeDomainModel);

}
