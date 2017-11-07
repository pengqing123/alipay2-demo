package com.song.service;

import com.song.bean.DO.ShopGoods;
import com.song.bean.vo.ShopGoodsVO;
import com.song.dao.ShopGoodsMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Song on 2017/11/7.
 */
@Service
public class GoodsService {
    @Resource
    public ShopGoodsMapper shopGoodsMapper;

    public Integer generateGoods(ShopGoodsVO vo) {
        ShopGoods shopGoods = new ShopGoods();
        BeanUtils.copyProperties(vo,shopGoods);
        shopGoods.setStatus(1);
        shopGoods.setCreateBy(1);

        shopGoodsMapper.insertSelective(shopGoods);
        return shopGoods.getId();
    }
}
