package com.song.bean.domain.alipay;

import com.alipay.api.domain.ExtendParams;
import lombok.Data;
import java.math.BigDecimal;

/**
 * Created by Song on 2017/11/7.
 */
@Data
public class BizContent {
    /**
     * 商户订单号，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
     */
    private String out_trade_no;

    /**
     * 销售产品码，与支付宝签约的产品码名称。 注：目前仅支持FAST_INSTANT_TRADE_PAY
     */
    private String product_code;

    /**
     * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     */
    private BigDecimal total_amount;

    /**
     * 订单标题
     */
    private String subject;

    /**
     * 订单描述
     */
    private String body;

    /**
     * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。
     * 支付宝只会在异步通知时将该参数原样返回。
     * 本参数必须进行UrlEncode之后才可以发送给支付宝
     */
    private Object passback_params;

    /**
     * 业务扩展参数
     */
    private ExtendParams extend_params;

    public BizContent() {
    }

    public BizContent(String out_trade_no, String product_code, BigDecimal total_amount, String subject, String body, Object passback_params, ExtendParams extend_params) {
        this.out_trade_no = out_trade_no;
        this.product_code = product_code;
        this.total_amount = total_amount;
        this.subject = subject;
        this.body = body;
        this.passback_params = passback_params;
        this.extend_params = extend_params;
    }
}
