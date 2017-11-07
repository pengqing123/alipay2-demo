package com.song.bean.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.math.BigDecimal;
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ShopGoodsVO {
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
}