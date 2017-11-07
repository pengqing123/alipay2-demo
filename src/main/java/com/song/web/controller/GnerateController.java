package com.song.web.controller;

import com.song.bean.vo.ShopCustomVO;
import com.song.bean.vo.ShopGoodsVO;
import com.song.service.CustomServcice;
import com.song.service.GoodsService;
import com.song.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Song on 2017/11/7.
 */
@Controller
@Api(value = "生成基础数据类")
@RequestMapping(produces = "application/json;charset=UTF-8")
public class GnerateController {
    @Resource
    public CustomServcice customServcice;
    @Resource
    public GoodsService goodsService;
    @Resource
    public OrderService orderService;

    @PostMapping("/generate/custom")
    @ApiOperation(value = "生成custom")
    public String buildCustom(@RequestBody ShopCustomVO vo) {
        return customServcice.generateUser(vo) + "";
    }

    @RequestMapping(value = "/generate/goods",method = RequestMethod.POST)
    @ApiOperation(value = "goods")
    @ResponseBody
    public String buildGoods(@RequestBody ShopGoodsVO vo) {
        return goodsService.generateGoods(vo) + "";
    }

    @GetMapping("/generate/order")
    @ApiOperation(value = "生成order")
    public String buildOrder(@ApiParam(value = "客户id") Integer customId,
                             @ApiParam(value = "商品id") Integer goodsId,
                             @ApiParam(value = "购买数量") Integer quantity) {
        return orderService.generateOrder(customId, goodsId, quantity) + "";
    }
}
