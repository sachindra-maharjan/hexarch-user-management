package com.yeti.hexarch.usermgmt.domain.model.user;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import com.yeti.hexarch.usermgmt.domain.model.product.ProductDomainModel;
import com.yeti.hexarch.usermgmt.domain.model.role.RoleTypeDomainModel;

public class UserDomainModelTest {

    private Set<ProductDomainModel> products = new HashSet<>();
    private Set<RoleTypeDomainModel> roles = new HashSet<>();
    
    private UserGroupDomainModel createUserGroup() {
        return UserGroupDomainModel.builder()
            .groupName("Admin")
            .products(products)
            .roleTypes(roles)
            .build();
    }

    @Test
    public void shouldApplyUserGroup() {
        var user = UserDomainModel.builder()
            .firstName("John")
            .lastName("Doe")
            .email("john.doe@test.com")
            .userGroup(createUserGroup())
            .build();
        var address = AddressDomainModel.builder()
                            .street("100 St")
                            .city("NY")
                            .zipCode("3000")
                            .country("USA")
                            .build();

        Set<RoleTypeDomainModel> newRoles = new HashSet<>();
        newRoles.add(RoleTypeDomainModel.WRITE);
        newRoles.add(RoleTypeDomainModel.DELETE);

        user.setAddress(address);
        user.getUserGroup().addProduct(ProductDomainModel.builder().name("Product1").build());
        user.getUserGroup().addRole(RoleTypeDomainModel.WRITE);
        user.getUserGroup().addRoles(newRoles);
        
        assertThat(user)
            .usingRecursiveComparison()
            .isEqualTo(
                UserDomainModel.builder()
                    .firstName("John")
                    .lastName("Doe")
                    .email("john.doe@test.com")
                    .address(address)
                    .userGroup(createUserGroup())
                    .build()
            );

        assertThat(user.getUserGroup().getGroupName()).isEqualTo("Admin");
        assertThat(user.getUserGroup().getRoleTypes().contains(RoleTypeDomainModel.READ));
        assertThat(user.getUserGroup().getRoleTypes().contains(RoleTypeDomainModel.WRITE));
        assertThat(user.getUserGroup().getRoleTypes().contains(RoleTypeDomainModel.DELETE));

    }


}
