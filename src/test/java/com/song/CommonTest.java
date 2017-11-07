package com.song;

import com.alibaba.fastjson.JSON;
import com.song.bean.domain.alipay.BizContent;
import com.song.utils.enums.TradeStatusEnum;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Song on 2017/11/7.
 */
public class CommonTest {

    @Test
    public void timeStamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYYMMddmmssSSS");
        System.out.println(dateFormat.format(new Date()));
    }

    @Test
    public void testEnum() {
        System.out.println(TradeStatusEnum.WAIT_BUYER_PAY.getValue());
        System.out.println(TradeStatusEnum.WAIT_BUYER_PAY.getDesc());

    }

    @Test
    public void testBizContentToStr() {
        BizContent bizContent = new BizContent("1", "2", new BigDecimal(10), "4", "5", "6", null);
        System.out.println(bizContent.toString());
        System.out.println(JSON.toJSONString(bizContent));
    }
}
