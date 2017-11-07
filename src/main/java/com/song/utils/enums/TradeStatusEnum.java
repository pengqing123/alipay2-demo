package com.song.utils.enums;

/**
 * Created by Song on 2017/11/7.
 */
public enum TradeStatusEnum {
    WAIT_BUYER_PAY("WAIT_BUYER_PAY", "交易创建，等待买家付款"),
    TRADE_CLOSED("TRADE_CLOSED", "未付款交易超时关闭，或支付完成后全额退款"),
    TRADE_SUCCESS("TRADE_SUCCESS", "交易支付成功"),
    TRADE_FINISHED("TRADE_FINISHED", "交易结束，不可退款");

    private String value;
    private String desc;

    TradeStatusEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
