package com.yeti.hexarch.usermgmt.domain.product;

import java.util.Date;
import lombok.Data;

@Data
public class ProductDomainModel {

    private Integer id;
    private String name;
    private String description;
    private Date activateDate;
    private Date expiryDate;

}