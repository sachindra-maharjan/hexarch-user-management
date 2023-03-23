package com.yeti.hexarch.usermgmt.domain.user;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import com.yeti.hexarch.usermgmt.domain.role.RoleType;

@Data
@RequiredArgsConstructor
public class UserRoleDomainModel {

    private String userId;
    private List<RoleType> roles;

    public void addRole(RoleType role) {
        if(roles == null) {
            roles = new ArrayList<>();
        }
        roles.add(role);
    }

}