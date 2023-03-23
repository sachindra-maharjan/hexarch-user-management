package com.yeti.hexarch.usermgmt.domain.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import com.yeti.hexarch.usermgmt.domain.role.RoleType;

@Data
@RequiredArgsConstructor
public class UserGroupDomainModel {

    private String groupName;
    private List<RoleType> roleTypes;

    public void addRole(RoleType roleType) {
        if(roleTypes == null) {
            roleTypes = new ArrayList<>();
        }
        roleTypes.add(roleType);
    }

}