package com.yeti.hexarch.usermgmt.domain.product;

import java.util.Date;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class ProductDomainModel {

    private Integer id;
    private String name;
    private String description;
    private Date activateDate;
    private Date expiryDate;

}