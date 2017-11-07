package com.song.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data
@ApiModel
public class ShopCustomVO {
    /**
     * 对应数据库 shop_custom.id
     * 
     */
    @ApiModelProperty(value = "用户id",required = false)
    private Integer id;

    /**
     * 对应数据库 shop_custom.name
     * 
     */
    @ApiModelProperty(value = "用户名",required = true)
    private String name;

    /**
     * 对应数据库 shop_custom.phone
     * 
     */
    private String phone;

    /**
     * 对应数据库 shop_custom.email
     * 
     */
    private String email;

    /**
     * 对应数据库 shop_custom.address
     * 
     */
    private String address;

    /**
     * 对应数据库 shop_custom.password
     * 
     */
    private String password;
}