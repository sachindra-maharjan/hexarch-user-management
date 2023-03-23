package com.yeti.hexarch.usermgmt.domain.model.user;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.yeti.hexarch.usermgmt.domain.model.role.RoleTypeDomainModel;
import com.yeti.hexarch.usermgmt.domain.model.product.ProductDomainModel;

@Data
@RequiredArgsConstructor
public class UserGroupDomainModel {

    private String groupName;
    private Set<RoleTypeDomainModel> roleTypes;
    private Set<ProductDomainModel> products;

    public void addRole(RoleTypeDomainModel roleTypeDomainModel) {
        if(roleTypes == null) {
            roleTypes = new HashSet<>();
        }
        roleTypes.add(roleTypeDomainModel);
    }

    public void addProduct(ProductDomainModel productDomainModel) {
        if(products == null) {
            products = new HashSet<>();
        }
        products.add(productDomainModel);
    }

}