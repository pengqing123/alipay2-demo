package com.song.web.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.song.utils.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Song on 2017/11/6.
 */
@Controller
public class AlipayController {

    @GetMapping("/alipay/pay")
    @ResponseBody
    public String pay(HttpServletResponse httpResponse) throws Exception {

        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
        //创建API对应的request
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);//在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" +
                "    \"out_trade_no\":\"20170320910101002\"," +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                "    \"total_amount\":0.01," +
                "    \"subject\":\"Iphone6 16G\"," +
                "    \"body\":\"Iphone6 16G\"," +
                "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
                "    \"extend_params\":{" +
                "    \"sys_service_provider_id\":\"2088511833207846\"" +
                "    }" +
                "  }");//填充业务参数
        String form = "";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + AlipayConfig.charset);
        httpResponse.getWriter().write(form);//直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
        return null;
    }

    @GetMapping("/alipay/refound")
    @ResponseBody
    public String refound() throws Exception {
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
        request.setBizContent("{" +
                "\"out_trade_no\":\"20170320010101007\"," +
                "\"trade_no\":\"2017110621001004070200293275\"," +
                "\"refund_amount\":0.01," +
                "\"refund_reason\":\"正常退款\"," +
                "\"out_request_no\":\"HZ01RF001\"," +
                "\"operator_id\":\"OP001\"," +
                "\"store_id\":\"NJ_S_001\"," +
                "\"terminal_id\":\"NJ_T_001\"" +
                "  }");
        AlipayTradeRefundResponse response = alipayClient.execute(request);
        if (response.isSuccess()) {
            System.out.println("调用成功");
            return null;
        } else {
            System.out.println("调用失败");
            return null;
        }
    }

    @GetMapping("/alipay/refoundQuery")
    @ResponseBody
    public String refoundQuery() throws Exception{//这个方法测试失败了
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();
        request.setBizContent("{" +
                "\"trade_no\":\"2017110621001004070200293275\"," +
                "\"out_trade_no\":\"20170320010101007\"," +
                "\"out_request_no\":\"HZ01RF001\"" +//请求退款时的请求号
                "}");
        AlipayTradeFastpayRefundQueryResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
        return null;
    }
}
