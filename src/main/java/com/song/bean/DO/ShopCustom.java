package com.song.bean.DO;

import java.util.Date;

public class ShopCustom {
    /**
     * 对应数据库 shop_custom.id
     * 
     */
    private Integer id;

    /**
     * 对应数据库 shop_custom.name
     * 
     */
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

    /**
     * 对应数据库 shop_custom.status
     * 0:停用;1:启用
     */
    private Integer status;

    /**
     * 对应数据库 shop_custom.create_by
     * 
     */
    private Integer createBy;

    /**
     * 对应数据库 shop_custom.create_time
     * 
     */
    private Date createTime;

    /**
     * 对应数据库 shop_custom.update_by
     * 
     */
    private Integer updateBy;

    /**
     * 对应数据库 shop_custom.update_time
     * 
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}