package com.yeti.hexarch.usermgmt.domain.model.user;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

import com.yeti.hexarch.usermgmt.domain.model.role.RoleTypeDomainModel;
import com.yeti.hexarch.usermgmt.domain.model.product.ProductDomainModel;

@Data
@Builder
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

    public void addRoles(Set<RoleTypeDomainModel> roleTypeDomainModels){
        if(roleTypes == null) {
            roleTypes = roleTypeDomainModels;
        } else {
            roleTypes.addAll(roleTypeDomainModels);
        }
    }

    public void addProduct(ProductDomainModel productDomainModel) {
        if(products == null) {
            products = new HashSet<>();
        }
        products.add(productDomainModel);
    }

    public void addProducts(Set<ProductDomainModel> productDomainModels) {
        if (products == null) {
            products = productDomainModels;
        } else {
            products.addAll(productDomainModels);
        }
    }

}