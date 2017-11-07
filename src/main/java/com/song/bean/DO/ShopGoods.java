package com.song.bean.DO;

import java.math.BigDecimal;
import java.util.Date;

public class ShopGoods {
    /**
     * 对应数据库 shop_goods.id
     * 
     */
    private Integer id;

    /**
     * 对应数据库 shop_goods.name
     * 
     */
    private String name;

    /**
     * 对应数据库 shop_goods.price
     * 
     */
    private BigDecimal price;

    /**
     * 对应数据库 shop_goods.store_number
     * 
     */
    private Integer storeNumber;

    /**
     * 对应数据库 shop_goods.status
     * 0:下架;1:上架
     */
    private Integer status;

    /**
     * 对应数据库 shop_goods.create_by
     * 
     */
    private Integer createBy;

    /**
     * 对应数据库 shop_goods.create_time
     * 
     */
    private Date createTime;

    /**
     * 对应数据库 shop_goods.update_by
     * 
     */
    private Integer updateBy;

    /**
     * 对应数据库 shop_goods.upadate_time
     * 
     */
    private Date upadateTime;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(Integer storeNumber) {
        this.storeNumber = storeNumber;
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

    public Date getUpadateTime() {
        return upadateTime;
    }

    public void setUpadateTime(Date upadateTime) {
        this.upadateTime = upadateTime;
    }
}