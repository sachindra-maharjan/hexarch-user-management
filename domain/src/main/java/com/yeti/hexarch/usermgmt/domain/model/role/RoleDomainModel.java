package com.yeti.hexarch.usermgmt.domain.role;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class RoleDomainModel {

    enum RoleType {
        READ, WRITE, DELETE
    }

    private Integer id;
    private RoleType roleType;

}