package com.song.service;

import com.song.bean.DO.ShopCustom;
import com.song.bean.vo.ShopCustomVO;
import com.song.dao.ShopCustomMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;

/**
 * Created by Song on 2017/11/7.
 */
@Service
public class CustomServcice {

    @Resource
    public ShopCustomMapper shopCustomMapper;

    public Integer generateUser(ShopCustomVO vo) {
        ShopCustom shopCustom = new ShopCustom();
        BeanUtils.copyProperties(vo, shopCustom);
        shopCustom.setStatus(1);
        shopCustom.setCreateBy(1);
        shopCustom.setId(null);
        shopCustom.setCreateTime(Calendar.getInstance().getTime());
        shopCustomMapper.insert(shopCustom);
        return shopCustom.getId();
    }
}
