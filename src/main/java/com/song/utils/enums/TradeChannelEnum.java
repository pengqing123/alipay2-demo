package com.song.utils.enums;

/**
 * Created by Song on 2017/11/7.
 */
public enum TradeChannelEnum {
    ALIPAY(1,"支付宝"),
    WXPAY(2,"微信");

    private Integer type;
    private String desc;

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    TradeChannelEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
