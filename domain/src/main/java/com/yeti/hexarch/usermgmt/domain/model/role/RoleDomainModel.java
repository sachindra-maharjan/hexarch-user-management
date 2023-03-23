package com.yeti.hexarch.usermgmt.domain.role;

public class RoleDomainModel {

    enum RoleType {
        READ, WRITE, DELETE
    }

    private Integer id;
    private RoleType roleType;

}