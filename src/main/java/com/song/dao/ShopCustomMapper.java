package com.song.dao;

import com.song.bean.DO.ShopCustom;

public interface ShopCustomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopCustom record);

    int insertSelective(ShopCustom record);

    ShopCustom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopCustom record);

    int updateByPrimaryKey(ShopCustom record);
}