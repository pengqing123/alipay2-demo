package com.song.bean.DO;

import java.math.BigDecimal;
import java.util.Date;

public class ShopOrder {
    /**
     * 对应数据库 shop_order.id
     * 
     */
    private Integer id;

    /**
     * 对应数据库 shop_order.custom_id
     * 
     */
    private Integer customId;

    /**
     * 对应数据库 shop_order.goods_id
     * 
     */
    private Integer goodsId;

    /**
     * 对应数据库 shop_order.goods_name
     * 
     */
    private String goodsName;

    /**
     * 对应数据库 shop_order.quantity
     * 购买数量
     */
    private Integer quantity;

    /**
     * 对应数据库 shop_order.price
     * 商品单价
     */
    private BigDecimal price;

    /**
     * 对应数据库 shop_order.amount
     * 总价
     */
    private BigDecimal amount;

    /**
     * 对应数据库 shop_order.pay_channel
     * 付款渠道(0:支付宝;1:微信)
     */
    private Integer payChannel;

    /**
     * 对应数据库 shop_order.payed_amount
     * 已付金额
     */
    private BigDecimal payedAmount;

    /**
     * 对应数据库 shop_order.to_third_order_id
     * 给第三方的订单号(加密得到)
     */
    private String toThirdOrderId;

    /**
     * 对应数据库 shop_order.third_trade_num
     * 第三方交易号
     */
    private String thirdTradeNum;

    /**
     * 对应数据库 shop_order.order_time
     * 下单时间
     */
    private Date orderTime;

    /**
     * 对应数据库 shop_order.pay_time
     * 支付时间
     */
    private Date payTime;

    /**
     * 对应数据库 shop_order.status
     * 0:已取消;1:创建;2:已支付部分;3:已支付;4:已发货;5:已退货
     */
    private Integer status;

    /**
     * 对应数据库 shop_order.create_by
     * 
     */
    private Integer createBy;

    /**
     * 对应数据库 shop_order.create_time
     * 
     */
    private Date createTime;

    /**
     * 对应数据库 shop_order.update_by
     * 
     */
    private Integer updateBy;

    /**
     * 对应数据库 shop_order.update_time
     * 
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public BigDecimal getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
    }

    public String getToThirdOrderId() {
        return toThirdOrderId;
    }

    public void setToThirdOrderId(String toThirdOrderId) {
        this.toThirdOrderId = toThirdOrderId;
    }

    public String getThirdTradeNum() {
        return thirdTradeNum;
    }

    public void setThirdTradeNum(String thirdTradeNum) {
        this.thirdTradeNum = thirdTradeNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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