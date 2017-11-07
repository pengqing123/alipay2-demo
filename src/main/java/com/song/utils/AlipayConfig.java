package com.song.utils;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Song on 2017/11/6.
 */
public class AlipayConfig {
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016080500170254";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDBagIyOqBqdqrO8bPpf8DQTyW3Om9viFUHGYEeNMHvPmcsqrcP2/rqaIuxBWhvz+weugvyrk36FeNWTixPKX50tg8W9J9N4qNR7sMeDh7A7BoMQHZMBhdPljuhUtVm+zBp5MJug5NUsYk/PoTMOpbNu/vLStGlFGiinYa7PQGgfTDq7e6P6FTvtAdOi20zwUZk1EcBXjKU+jG2Phvj0O+2kS6j/6IZcsKlIcAAo6DB90OcQVLT1P/4Uyc7GOsR5N1sC9prcgOHS8K3uvLzS1LOL97gt9Sd4mmovHePGawXpQpCWp63WtaF2Bn2J8xQENJXhdGtuzcLURdANcQXFwglAgMBAAECggEAfIVUbqQh/QjzRRKFgvH13+bk4Ecl0UeTfmOkJh9PMEkbwb0S6In2zA2MyeYya7IQUWP0J0Si/Tw0Ra9EhZ6wRFGl+2B4Y3tjLG+sfOAYWppm1rZ1stJFFb8iGuWqcIeNjs9xghcBtogqVWZZtuaNilzZafN8b2xpRTBnuoo3TuvMCbOUomXDylzQOESfAitJKP5V7JfwhzcOKBQ2xMYR3lS+P0iG/Ql6PkSQBJiwV3uK10KqAg4drbcmT+Pe/UYyMvIpbRqFJVfLQaX7kaQ7zeDZNjNZBJ1yCq2PXRvjmJQXfWFi3PSIku3OnLPJSuj97mO978CkVzHu05RcM8yWTQKBgQDjWDIe0vwmRjHemxfkuMGQhXP9omJazkQFg4VhCKF5Fiy6tMva/FGwyzMB3RksF0b0/ENiveuKa7Ze/qTsJCC1kNv07r/ErYme7irESck6HLWg8+Kvq576pSgTfE/vrXhTBtZtGqj8zHKSHrHwVB+2K7F3TzLvSG77uwyPSBxLTwKBgQDZyvfdOENyq52/8pO5j4LE+PcY6uRLcw6y/uwdgvFXhdgQFvy+xhifTReayhj/HFS8kp9btcetgOKhIbzH0vvZ5Vd3KaijrcU3525toabz9GopsLCGyF8e/zasnFPRlkSe59R/9sAG1QsRsenFJ47vYr9EV32ekWPgQdYglcWISwKBgFlO3zmOpnEeqB6LjKJUFe4BDuS3Mq37U2tbFD1fF5eqp12dAmv/LNQnrtzvjyDr7/rzUkFq3CmfUKAWppEBTDwnMNESLRFFHsfpRbGgTsVeW9djl0xtPeG2mXy2G+zKl3b+O6PWkkXkxqkyF7KSSXbVyTxWR2sKaFbJTxDGQh8vAoGAF0rWwWkABaaHA31NAT5w7OH3g0mzysHuY4RR+kIDz6l31xiuRTToczkKejp8++OqyFQiCOvjBBJRqovyJajR2JbniM4CxCaUfgsZS05LjbGpHPZRmsiZK7Z9wW4ipLqeciQ3HMxl8xUbzvOpHbXCWqXD8OoufCPue5Bu9yMtcgsCgYEAs+OYNUSPEnSZaXrlo0kvysYtYfXzE6/DNDCGtWHMKJ4KqwACoD136A547CcNr3fVfL3+/7ttxwU728HyycEI3tD17hDzpuar7wtKdEBc/JlE1Kuc9+nU9t0SuO29RVlULrA1NEfpB9XvOmrPuw87j6zsdtXJRdE0l+/+dr5mfqM=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApdpZQMa96wMIEQcekre+INHPLVixbSsNFtI0SmcJYFNO73aO1KsVT+2Ay2CesAOHefKi7qXY5FoMo5GHOckXSXs9w2RTgYUmPhHsT7U5AtofP6mj2EUfAtV5BvS5qlB58Yv/K40IjpAIjKRsuXFApI85GsnKf4xFbRE6WzAOkhO2OhXTykM3o+rsBDFe3YWN4CUWUeBqTtAlX8Ai+kOkdilh47Ywq4f4exVv2DQP2d3QzN4I38qW+BfpCdpCTeBKdXSXm7u9XJdfiTyuFpOAdRQ0dQBFoLrNGyMclX0+2/lAvkUQm+oVSVlUO0oQJYFEry7FBHEQ2YX+GeoHAnVEsQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://swh.frp.nextyu.com/alipay/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://swh.frp.nextyu.com/alipay/return";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "UTF-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "E:\\";

    //付款超时时间(取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。)
    public static String time_precess = null;

    //收款人id
    public static String seller_id = "";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

