package com.song.dao;

import com.song.bean.DO.ShopGoods;

public interface ShopGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopGoods record);

    int insertSelective(ShopGoods record);

    ShopGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopGoods record);

    int updateByPrimaryKey(ShopGoods record);
}