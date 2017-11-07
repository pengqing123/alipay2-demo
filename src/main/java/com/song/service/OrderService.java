package com.song.service;

import com.alibaba.fastjson.JSON;
import com.song.bean.DO.ShopCustom;
import com.song.bean.DO.ShopGoods;
import com.song.bean.DO.ShopOrder;
import com.song.bean.domain.alipay.BizContent;
import com.song.bean.dto.OrderDTO;
import com.song.dao.ShopCustomMapper;
import com.song.dao.ShopGoodsMapper;
import com.song.dao.ShopOrderMapper;
import com.song.utils.enums.TradeChannelEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Song on 2017/11/7.
 */
@Service
public class OrderService {
    @Resource
    public ShopOrderMapper ordersMapper;

    @Resource
    public ShopGoodsMapper shopGoodsMapper;

    @Resource
    public ShopCustomMapper shopCustomMapper;

    public OrderDTO getOrderDTOById() {
        return null;
    }

    /**
     * 根据订单id获取alipay支付需要的bizcontent字段
     *
     * @param orderId
     * @return
     */
    public String getAlipayOrderBizContent(Integer orderId) {
        ShopOrder order = ordersMapper.selectByPrimaryKey(orderId);
        if (order != null) {
            BizContent bizContent = new BizContent();
            bizContent.setOut_trade_no(order.getToThirdOrderId());
            bizContent.setProduct_code("BUILDING_PAY");
            bizContent.setSubject(order.getGoodsName());
            bizContent.setPassback_params(TradeChannelEnum.ALIPAY.getType());
            bizContent.setTotal_amount(order.getAmount());
            return JSON.toJSONString(bizContent);
        }
        return null;
    }

    /**
     * 生成随机订单
     *
     * @return
     */
    public Integer generateOrder(Integer customId, Integer goodsId, Integer quantity) {
        ShopOrder order = new ShopOrder();
        ShopGoods goods = shopGoodsMapper.selectByPrimaryKey(goodsId);
        ShopCustom custom = shopCustomMapper.selectByPrimaryKey(customId);
        order.setGoodsId(goodsId);
        order.setQuantity(quantity);
        order.setPrice(goods.getPrice());
        order.setAmount(goods.getPrice().multiply(new BigDecimal(quantity)));
        order.setCustomId(customId);
        order.setOrderTime(new Date());
        order.setPayedAmount(new BigDecimal(0));
        order.setStatus(1);
        order.setToThirdOrderId(UUID.randomUUID().toString().replace("-", ""));
        order.setCreateBy(1);
        ordersMapper.insertSelective(order);
        return order.getId();
    }

}
